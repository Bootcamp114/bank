<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Insert title here</title>

<link
	href="./../../resources/assets/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="./../../resources/assets/vendor/metisMenu/metisMenu.min.css"
	rel="stylesheet">
<link href="./../../resources/assets/css/sb-admin-2.css" rel="stylesheet">
<link href="./../../resources/assets/vendor/morrisjs/morris.css"
	rel="stylesheet">
<link
	href="./../../resources/assets/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<script type="text/javascript"src="/resources/assets/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	
	//save data
	$("input[name='submit']").on('click' ,function(){
		save();
		clearColumn();
	});
	
	//show data
	showData();
	
	//delete
	$(document).on("click",'.delete', function(){
		onDelete(this);
	});
	
	
	// update
	$("input[name='update']").on('click', function(){
	var type =$('input[name="type"]').val();
	var jenis_pelayanan =$('input[name="jenis_pelayanan"]').val();
	var harga_kartu =$('input[name="harga_kartu"]').val();
	var jenis_obat =$('input[name="jenis_obat"]').val();
	var kelipatan = $('input[name="kelipatan"]').val();
	var diskripsi_class = $('textarea[name="diskripsi_class"]').val(); 
	var id = $('input[name="id"]').val();
	
	var class_asuransi = {
		
			type : type,
			jenisPelayanan : jenis_pelayanan,
			hargaKartu : harga_kartu,
			jenisObat : jenis_obat,
			kelipatan : kelipatan,
			diskripsiClass : diskripsi_class,
			id : id
	}
	
	$.ajax({
		url : '/classasuransicontroller/update',
		type : 'PUT',
		contentType : 'application/json',
		data : JSON.stringify(class_asuransi),
		success: function(data){
			showData();
			clearColumn();
		}
		
	});
	
	});
	
	//get id
	$(document).on("click",'.edit', function(){
		var id = $(this).attr('id_edit');
		$.ajax({
			url :"/classasuransicontroller/getbyid/"+id,
			type:'GET',
			dataType : 'json',
			success : function(data){
				updateColumn(data);
			}
		});
	});
	
	
});

</script>

</head>
<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <a class="navbar-brand" href="index">Bank CBA</a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li>
                            <a href="index"><i class="fa fa-dashboard fa-fw"></i> Menu Utama</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-wrench fa-fw"></i> Komponen Bank<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="karyawan">Karyawan</a>
                                </li>
                                <li>
                                    <a href="produknasabah">Produk Nasabah</a>
                                </li>
                                <li>
                                    <a href="produkasuransi">Produk Asuransi</a>
                                </li>
                                <li>
                                    <a href="rekening">Info Rekening</a>
                                </li>
                                <li>
                                    <a href="#">Info Setoran Asuransi</a>
                                </li>
                                <li>
                                    <a href="classasuransi"> Kelas Asuransi</a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="asuransi"><i class="fa fa-table fa-fw"></i> Asuransi Kesehatan</a>
                        </li>
                        <li>
                            <a href="peminjamandana"><i class="fa fa-edit fa-fw"></i> Peminjaman Dana</a>
                        </li>
                        <li>
                            <a href="account"><i class="fa fa-book fa-fw"></i> Nasabah</a>
                        </li>
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>

		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">Tambah Class Asuransi</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<!-- Edit Dibawah Ini -->
				<div>
				<input type="hidden" name="id"/>
				</div>
				
				<div>
				<label for="exampleInputEmail1">Type </label> <input
							type="text" class="form-control" name="type"
							placeholder="Masukan Type Class Asuransi ">
				</div>
				<div>			
				<label for="exampleInputEmail1">Jenis Pelayanan</label> <input
							type="text" class="form-control" name="jenis_pelayanan"
							placeholder="Masukan Jenis Pelayanan ">
				</div>
				<div>			
				<label for="exampleInputEmail1">Jenis Obat</label> <input
							type="text" class="form-control" name="jenis_obat"
							placeholder="Masukan jenis obat class asuransi">
				</div>
				<div>			
				<label for="exampleInputEmail1">Harga Kartu</label> <input
							type="text" class="form-control" name="harga_kartu"
							placeholder="Masukan Harga Kartu">
				</div>
				<div>			
				<label for="exampleInputEmail1">Kelipatan</label> <input
							type="text" class="form-control" name="kelipatan"
							placeholder="Masukan Jumlah Kelipatan">
				</div>
				<div>			
				<label for="exampleInputEmail1">Diskripsi Class</label>
							<textarea class="form-control" rows="9" name="diskripsi_class" placeholder="Masukan Diskripsi class Asuransi"></textarea>	
				</div>
				<br/>
				<input type="button" class="btn btn-primary" name="submit" value="Save"/>
				<input type ="button" class="btn btn-succes" name="update" value="Update">
				
				<h3 class="page-header">Class Asuransi List</h3>
				<div>
				<table width="100%" class="table table-striped table-bordered table-hover" id="dataTables">
                                <thead>
                                    <tr>
                                        <th><center>Type</center></th>
                                        <th><center>Jenis Pelayanan</center></th>
                                        <th><center>Harga Kartu</center></th>
                                        <th><center>Jenis Obat</center></th>
                                         <th><center>Harga Kart</center></th>
                                          <th><center>Kelipatan</center></th>
                                        <th><center>Deskripsi</center></th>
                                        <th><center>Action</center></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    
                                </tbody>
                            </table>			
				</div>			
				
			</div>
	<!-- /.row -->
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="./../../resources/assets/vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script
		src="./../../resources/assets/vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="./../../resources/assets/vendor/metisMenu/metisMenu.min.js"></script>

	<!-- Morris Charts JavaScript -->
	<script src="./../../resources/assets/vendor/raphael/raphael.min.js"></script>
	<script src="./../../resources/assets/vendor/morrisjs/morris.min.js"></script>
</body>
<script>
	function showData(){
		$.ajax({
			url : '/classasuransicontroller/getall',
			type : 'POST',
			dataType : 'json',
			success : function(data, x, xhr) {
				console.log("data is loaded");
				fillData(data);
			}
		});
	}
	
	function fillData(data){
		var dt = $('#dataTables');
		var tbody = dt.find('tbody');
		var child = tbody.find('tr').remove();
		
		//xtrack data json
		$.each(data,function(index, class_asuransi){
			var trString = "<tr>";
			trString += "<td>";
			trString += class_asuransi.type;
			trString += "</td>"
			trString += "<td>";
			trString += class_asuransi.jenisPelayanan;
			trString += "</td>"
			trString += "<td>";
			trString += class_asuransi.hargaKartu;
			trString += "</td>"
			trString += "<td>";
			trString += class_asuransi.jenisObat;
			trString += "</td>"
			trString += "<td>";
			trString += class_asuransi.hargaKartu;
			trString += "</td>"
			trString += "<td>";
			trString += class_asuransi.kelipatan;
			trString += "</td>"
			trString += "<td>";
			trString += class_asuransi.diskripsiClass;
			trString += "</td>"
			trString += "<td>";
			trString += "<a id_delete = '"+class_asuransi.id+"' href='#' class = 'delete' >Delete</a>";
			trString += "</td>"
			trString += "<td>";
			trString += "<a id_edit='"+class_asuransi.id+"' href='#' class='edit'>Edit</a>"
			trString += "</td>"
			trString += "</tr>"
			
			tbody.append(trString)
			
		});
	}
	
	function save(){
		var type = $('input[name="type"]').val();
		var jenis_pelayanan = $('input[name="jenis_pelayanan"]').val();
		var jenis_obat = $('input[name="jenis_obat"]').val();
		var harga_kartu = $('input[name="harga_kartu"]').val();
		var kelipatan = $("input[name=kelipatan]").val();
		var diskripsi_class = $("textarea[name='diskripsi_class']").val();
		
		var class_asuransi = {
				type : type,
				jenisPelayanan : jenis_pelayanan,
				jenisObat : jenis_obat,
				hargaKartu : harga_kartu,
				kelipatan : kelipatan,
				diskripsiClass : diskripsi_class
		}
		
		$.ajax({
			url : '/classasuransicontroller/save',
			type : 'POST',
			contentType : 'application/json',
			data : JSON.stringify(class_asuransi),
			success : function(data, a, xhr) {
				console.log(data);
				console.log(a);
				console.log(xhr.status);
				showData();
			}
		});
	}
	
	function onDelete(ini){
		var id = $(ini).attr('id_delete');
		
		$.ajax({
			url : '/classasuransicontroller/delete/'+id,
			type :'DELETE',
			success : function(data) {
				console.log(data);
				showData();
			}
		});
		
	}
	
	function update(){
		var type = $('input[name="type"]').val();
		var jenis_pelayanan = $('input[name="jenis_pelayanan"]').val();;
		var jenis_obat = $('input[name="jenis_obat"]').val();
		var harga_kartu = $('input[name="harga_kartu"]').val();
		var kelipatan = $("input[name='kelipatan']").val();
		var diskripsi_class = $("textarea[name='diskripsi_class']").val();
		
		var class_asuransi = {
				type : type,
				jenisPelayanan : jenis_pelayanan,
				jenisObat : jenis_obat,
				hargaKartu : harga_kartu,
				kelipatan : kelipatan,
				diskripsiClass : diskripsi_class
		}
		
		$.ajax({
			url : '/classasuransicontroller/save',
			type : 'POST',
			data : JSON.stringify(class_asuransi),
			success : function(data, a, xhr) {
				console.log(a);
				console.log(xhr.status);
				showData();
			}
		});
		
		
	}
	
	function updateColumn(data){
		$('input[name="type"]').val(data.type);
		$('input[name="jenis_pelayanan"]').val(data.jenisPelayanan);
		$('input[name="jenis_obat"]').val(data.jenisObat);
		$('input[name="harga_kartu"]').val(data.hargaKartu);
		$('input[name="kelipatan"]').val(data.kelipatan);
		$('textarea[name="diskripsi_class"]').val(data.diskripsiClass);
		$('input[name="id"]').val(data.id);
	}
	function clearColumn(){
		$('input[name="type"]').val("");
		$('input[name="jenis_pelayanan"]').val("");
		$('input[name="jenis_obat"]').val("");
		$('input[name="harga_kartu"]').val("");
		$('input[name="kelipatan"]').val("");
		$('textarea[name="diskripsi_class"]').val("");
	}

</script>

</html>