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
	
	$('input[name="submit"]').on('click', function(){
		save();
		clearColumn();
});
	
	showData();
	
	$(document).on('click','.delete',function(){
		doDelete(this);
	});
	
	$("input=[name='update']").on('click',function(){
		var produk =$('input[name="produk"]').val();
		var jumlah_dana =$('input[name="jumlah_dana"]').val();
		var jumlah_storan =$('input[name="jumlah_storan"]').val();
		var diskripsi_produk =$('textarea[name="diskripsi_produk"]').val();
		var id =$('input[name="id"]').val();
		
		var produk_asuransi = {
				produk : produk,
				jumlahDana : jumlah_dana,
				jumlahStoran : jumlah_storan,
				diskripsiProduk : diskripsi_produk,
				id : id
		}
		
		$.ajax({
			url : '/produkasuransicontroller/update',
			type : 'PUT',
			contentType : 'application/json',
			data : JSON.stringify(produk_asuransi),
			success : function(data){
				showData();
				clearColumn();
			}
		});
		
	});
	
	$(document).on('click','.edit',function(){
		var id = $(this).attr('id_edit');
		
		$.ajax({
			url :'/produkasuransicontroller/getbyid'+id,
			type : 'GET',
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
					<h1 class="page-header">Tambah Produk Asuransi</h1>
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
				<label for="exampleInputEmail1">Produk </label> <input
							type="text" class="form-control" name="produk"
							placeholder="Masukan Type Class Asuransi ">
				</div>
				<div>			
				<label for="exampleInputEmail1">Jumlah Dana</label> <input
							type="text" class="form-control" name="jumlah_dana"
							placeholder="Masukan Jenis Pelayanan ">
				</div>
				<div>			
				<label for="exampleInputEmail1">jumlah Storan</label> <input
							type="text" class="form-control" name="jumlah_storan"
							placeholder="Masukan jenis obat class asuransi">
				</div>
				<div>			
				<label for="exampleInputEmail1">Diskripsi Class</label>
							<textarea class="form-control" rows="9" name="diskripsi_produk" placeholder="Masukan Diskripsi class Asuransi"></textarea>	
				</div>
				<br/>
				<input type="button" class="btn btn-primary" name="submit" value="Save"/>
				<input type ="button" class="btn btn-succes" name="update" value="Update">
				
				<h3 class="page-header">Class Asuransi List</h3>
				<div>
				<table width="100%" class="table table-striped table-bordered table-hover" id="dataTables">
                                <thead>
                                    <tr>
                                        <th><center>Produk</center></th>
                                        <th><center>Jumlah Dana</center></th>
                                        <th><center>Jumlah Storan</center></th>
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
		url : '/produkasuransicontroller/getall',
		type : 'POST',
		dataType : 'json', 
		success: function(data, x, xhr){
			console.log("data is load");
			fillData(data);
		}
	});
}

function fillData(data){
	var dt = $('#dataTables');
	var tbody = dt.find('tbody');
	var child = tbody.find('tr').remove();
	
	$.each(data, function(index, produk_asuransi){
		var trString = "<tr>";
		trString += "<td>";
		trString += produk_asuransi.produk;
		trString += "</td>"
		trString += "<td>";
		trString += produk_asuransi.jumlahDana;
		trString += "</td>"
		trString += "<td>";
		trString += produk_asuransi.jumlahStoran;
		trString += "</td>"
		trString += "<td>";
		trString += produk_asuransi.diskripsiProduk;
		trString += "</td>"
		trString += "<td>";
		trString += "<a id_delete = '"+produk_asuransi.id+"' href='#' class = 'delete' >Delete</a>";
		trString += "</td>"
		trString += "<td>";
		trString += "<a id_edit='"+produk_asuransi.id+"' href='#' class='edit'>Edit</a>"
		trString += "</td>"
		trString += "</tr>"
		
		tbody.append(trString)
		
	});
}

function save(){
	var produk = $('input[name="produk"]').val();
	var jumlah_dana = $('input[name="jumlah_dana"]').val();
	var jumlah_storan = $('input[name="jumlah_storan"]').val();
	var diskripsi_produk = $('textarea[name="diskripsi_produk"]').val();
	
	var produk_asuransi = {
			produk : produk,
			jumlahDana : jumlah_dana,
			jumlahStoran : jumlah_storan,
			diskripsiProduk : diskripsi_produk
	}
	
	$.ajax({
		url : '/produkasuransicontroller/save',
		type : 'POST',
		contentType : 'application/json',
		data : JSON.stringify(produk_asuransi),
		success : function(data, a, xhr){
			console.log(data);
			console.log(a);
			console.log(xhr.status);
			showData();
			
		}
	});
}

function doDelete(ini){
	var id = $(ini).attr('id_delete');
	
	$.ajax({
		url : '/produkasuransicontroller/delete/'+id,
		type :'DELETE',
		success : function(data){
			console.log(data);
			showData();
		}
	});
}

function update(){
	var produk =$('input[name="produk"]').val();
	var jumlah_dana =$('input[name="jumlah_dana"]').val();
	var jumlah_storan =$('input[name="jumlah_storan"]').val();
	var diskripsi_produk =$('textarea[name="diskripsi_produk"]').val();
	
	var produk_asuransi = {
			produk : produk,
			jumlahDana : jumlah_dana,
			jumlahStoran : jumlah_storan,
			diskripsiProduk : diskripsi_produk
	}
	
	$.ajax({
		url : '/produkasuransicontroller/save',
		type : 'POST',
		data : JSON.stringify(produk_asuransi),
		success : function(data, a, xhr) {
			console.log(a);
			console.log(xhr.status);
			showData();
		}
	});
}

function updateColumn(data){
	$('input[name="produk"]').val(data.produk);
	$('input[name="jumlah_dana"]').val(data.jumlahDana);
	$('input[name="jumlah_storan"]').val(data.jumlahStoran);
	$('textarea[name="diskripsi_produk"]').val(data.diskripsiProduk);
}
function clearColumn(){
	$('input[name="produk"]').val("");
	$('input[name="jumlah_dana"]').val("");
	$('input[name="jumlah_storan"]').val("");
	$('textarea[name="diskripsi_produk"]').val("");

}

</script>

</html>