<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
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
	$("input[name='submit']").on('click', function(e){
		e.preventDefault();
		save();
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
                            <a href="./../index"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-wrench fa-fw"></i> Component Bank<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="#">Employee</a>
                                </li>
                                <li>
                                    <a href="#">Product Nasabah</a>
                                </li>
                                <li>
                                    <a href="#">Product Asuransi</a>
                                </li>
                                <li>
                                    <a href="#">Info Rekening</a>
                                </li>
                                <li>
                                    <a href="#">Info Setoran Asuransi</a>
                                </li>
                                <li>
                                    <a href="#"> Class Asuransi</a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="./../asuransi"><i class="fa fa-table fa-fw"></i> Health Insurance</a>
                        </li>
                        <li>
                            <a href="./../peminjamandana"><i class="fa fa-edit fa-fw"></i> Loan Funds</a>
                        </li>
                        <li>
                            <a href="./../account"><i class="fa fa-book fa-fw"></i> Create Nasabah Account</a>
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
                    <h1 class="page-header">Tambah Polis<table align = "right">
                    	<tr>
                    		<td><select class = "form-control" name = "employee" id="employee">
                    			<c:forEach var = "employee" items = "${employee}">
	                				<option value="${employee.id}">${employee.nama}</option>
	                			</c:forEach>
                    		</select></td>
                    	</tr>
                    </table></h1>
                </div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<!-- Edit Dibawah Ini -->
				<div class = "col-lg-6">
	                	<form role = "form" id = "myForm">
	                		<div class = "form-group">
	                			<label>No Rekening : </label>
	                			<span class = "form-control">${noPolis}</span>
	                			<input type="hidden" class = "form-control" name = "no_polis" value="${noPolis}">
	                		</div>
	                		<div class = "form-group">
	                			<label>Nama Penanggung : </label>
	                			<input class = "form-control" name = "nama_penanggung" required autofocus>
	                		</div>
	                		<div class = "form-group">
	                			<label>Ahli Waris : </label>
	                			<input class = "form-control" name = "ahli_waris" required autofocus>
	                		</div>
	                		<div class = "form-group">
	                			<label>Tanggal Dibuat : </label>
	                			<input type="date" class = "form-control" name = "tanggal_dibuat" required autofocus>
	                		</div>
	                		<div class = "form-group">
	                			<label>Produk Asuransi : </label>
	                			<select class = "form-control" name = "produkAsuransi" id="produkAsuransi">
	                				<c:forEach var = "produkAsuransi" items = "${produkAsuransi}">
	                					<option value="${produkAsuransi.id}">${produkAsuransi.produk}</option>
	                				</c:forEach>
	                			</select>
	                		</div>
	                	<div>
	                		<textarea class="form-control" rows="6" disabled="disabled"></textarea>
						</div>
	                		<div class = "form-group">
	                			<label>Class Asuransi : </label>
	                			<select class = "form-control" name = "classAsuransi" id="classAsuransi">
	                				<c:forEach var = "classAsuransi" items = "${classAsuransi}">
	                					<option value="${classAsuransi.id}">${classAsuransi.class}</option>
	                				</c:forEach>
	                			</select>
	                		</div>
	                	<div>
	                		<textarea class="form-control" rows="6" disabled="disabled"></textarea>
						</div>
	                		<label>Jumlah Storan / bulan : </label>
	              			<div class="form-group input-group">
								<span class="input-group-addon">Rp</span>
									<input type="text" class="form-control" id="saldo" value="---" disabled>
								<span class="input-group-addon">.00</span>
							</div>
	                	<br>
						<div>
						<input type="submit" name="submit" class="btn btn-success">
							<button type="reset" class="btn btn-warning">Reset Button</button>
						</div>
					</div>
					
					
					
					<div class="col-lg-6">
						<div class = "form-group">
		                	<label>Nama Tertanggung : </label>
		               		<input class = "form-control" name = "nama">
		             	</div>
		             	<div class = "form-group">
		                	<label>Hubungan : </label>
		               		<input class = "form-control" name = "hubungan">
		             	</div>
		             	<div class = "form-group">
		                	<label>Pekerjaan : </label>
		               		<input class = "form-control" name = "pekerjaan">
		             	</div>
		             	<div class = "form-group">
		                	<label>No Hp : </label>
		               		<input class = "form-control" name = "no_hp">
		             	</div>
		             	<div class = "form-group">
		                	<label>Email : </label>
		               		<input class = "form-control" name = "email">
		             	</div>
		             	<div class = "form-group">
		                	<label>Tanggal Lahir : </label>
		               		<input class = "form-control" type="date" name = "tanggal_lahir">
		             	</div> 
		             	<div>
		             		<label>Alamat : </label>
	                		<textarea class="form-control" rows="3" name = "alamat"></textarea>
						</div>
						<div class = "form-group">
	                			<label>Jenis Kelamin : </label>
	                			<div class = "radio">
	                				<label>
	                					<input type="radio" name="jenis_kelamin" value="Laki-Laki"/>Laki-Laki
	                				</label>
	                				<label>
	                					<input type="radio" name="jenis_kelamin" value="perempuan"/>Perempuan
	                				</label>
	                			</div>
	                	</div>
	                	<div class = "form-group">
	                			<label>Status : </label>
	                			<div class = "radio">
	                				<label>
	                					<input type="radio" name="status" value="menikah"/>Menikah
	                				</label>
	                				<label>
	                					<input type="radio" name="status" value="belum-menikah"/>Belum Menikah
	                				</label>
	                			</div>
	                		</div>
	                	<div class = "form-group">
	                			<label>Warga Negara : </label>
	                			<div class = "radio">
	                				<label>
	                					<input type="radio" name="kewarganegaraan" value="WNI"/>WNI
	                				</label>
	                				<label>
	                					<input type="radio" name="kewarganegaraan" value="WNA"/>WNA
	                				</label>
	                			</div>
	                		</div>
		             	<div class = "form-group">
	                			<label>Jenis Identitas : </label>
	                			<select class = "form-control" name = "jenis_identitas">
	                				<option value = "KTP">KTP</option>
	                				<option value = "SIM">SIM</option>
	                				<option value = "Kartu Pelajar">Kartu Keluarga</option>
	                				<option value = "Ijazah">Ijazah</option>
	                				<option value = "Passport">Passport</option>
	                			</select>
	                	</div>
	                	<div class = "form-group">
		                	<label>No Identitas : </label> <input class="form-control" name="no_identitas">
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
	
	<script src="./../../resources/assets/js/sb-admin-2.js"></script>
</body>
<script type="text/javascript">
var jenis_kelamin;
var kewarganegaraan;
var status;

$(document).ready(function(){
	$("input[name='jenis_kelamin']").on('change', function(){
		jenis_kelamin =$(this).val();
	});
	$("input[name='kewarganegaraan']").on('change', function(){
		kewarganegaraan = $(this).val();
	});
	$("input[name='status']").on('change',function(){
		status = $(this).val();
	});
});

function save(){
	var no_polis = $("input[name='no_polis']").val();
	var ahli_waris = $("input[name='ahli_waris']").val();
	var tanggal_dibuat = $("input[name='tanggal_dibuat']").val();
	var nama = $("input[name='nama']").val();
	var hubungan = $("input[name='hubungan']").val();
	var no_hp = $("input[name='no_hp']").val();
	var email = $("input[name='email']").val();
	var tanggal_lahir = $("input[name='tanggal_lahir']").val();
	var jenis_identitas = $("select[name='jenis_identitas']").val();
	var pekerjaan = $("input[name='pekerjaan']").val();
	var alamat = $("textarea[name='alamat']").val();
	var no_identitas = $("input[name='no_identitas']").val();
	var employee = $('#employee').val();
	var classAsuransi = $('#classAsuransi').val();
	var produkAsuransi = $('#produkAsuransi');
	
	var polis = {
		noPolis : no_polis,
		ahliWaris : ahli_waris,
		tanggalDibuat : tanggal_dibuat,
		nama : nama,
		hubungan : hubungan,
		noHp : no_hp,
		email : email,
		tanggalLahir : tanggal_lahir,
		jenisIdentitas : jenis_identitas,
		pekerjaan : pekerjaan,
		alamat : alamat,
		noIdentitas : no_identitas,
		jenisKelamin : jenis_kelamin,
		kewarganegaraan : kewarganegaraan,
		status : status,
		employee : {
			id : employee
		},
		classAsuransi : {
			id : classAsuransi
		},
		produkAsuransi : {
			id : produkAsuransi
		}
		
	}
	
	$.ajax({
		url : '/poliscontroller/save',
		type : 'POST',
		contentType : 'application/json',
		data : JSON.stringify(polis),
		success : function(data, a, xhr){
			console.log(xhr.status);
			
		}
	});
}
</script>


</html>