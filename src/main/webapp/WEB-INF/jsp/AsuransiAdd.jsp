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
	
	//save
	$('input[name="submit"]').on('click', function(e){
		e.preventDefault();
		savePolis();
		
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
				
					<h1 class="page-header">Add polis</h1>
					
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<!-- Edit Dibawah Ini -->
				<div class="col-lg-6">
					<form>
						<div class="form-group" class="col-lg-6">
							<label for="exampleInputEmail1">No Polis</label> <input
								type="text" class="form-control" id="NoPolis"
								disabled="disabled" name="no_polis">
						</div>
						
						<div class="form-group">
						<label for="exampleInputEmail1">Tanggal Dibuat</label> <input
							type="date" class="form-control"  id="NoPolis" name ="tanggal_dibuat">
				</div>

						<div class="form-group">
							<label for="exampleInputEmail1">Produk Asuransi</label> <select
								class="form-control">
								<option>asuraansi penyakit kritis</option>
								<option>asuraansi ketenaga kerjaan</option>
								<option>asuraansi kesehatan</option>
								<option>asuraansi pendidikan</option>
								<option>asuraansi kecelakaan</option>
							</select>
						</div>
						<br/><br/>
					
					<div class = "form-group">
	                			<textarea class="form-control" rows="10" name = "alamat" disabled="disabled"></textarea>
	                		</div>
	                <div class="form-group">
							<label for="exampleInputEmail1">Class Asuransi</label> <select
								class="form-control">
								<option>Silver</option>
								<option>Gold</option>
								<option>Platinum</option>
							</select>
						</div>
						<br/><br/>
					
					<div class = "form-group">
	                			<textarea class="form-control" rows="10" name = "alamat" disabled="disabled"></textarea>
	                		</div>
								
					<h2 class="page-header">Info Tertanggung</h2>
				<div class="form-group">
						<label for="exampleInputEmail1">Nama</label> <input
							type="text" class="form-control" id="NoPolis" name ="nama"
							placeholder="Masukan Nama Tertanggung">
				</div>
				<div class = "form-group">
                			<label>Hubungan : </label>
                			<input class = "form-control" name = "hubungan" required
                			placeholder="masukan hubunngan penanggung dan tertanggung">
                		</div>
                <div class = "form-group">
                			<label>No Hp : </label>
                			<input class = "form-control" name = "no_hp" required
                			placeholder="masaukan No Hp info tertanggung">
                		</div>
                <div class = "form-group">
                			<label>Email : </label>
                			<input class = "form-control" name = "email" required
                			placeholder="masukan email info tertanggung ">
                		</div>
				<div class="form-group">
						<label for="exampleInputEmail1">Tanggal Lahir</label> <input
							type="date" class="form-control"  name ="tanggal_lahir">
				</div>
				
				<div class = "form-group">
                			<label>Jenis Identitas : </label>
                			<select class = "form-control" name = "jenis_identitas">
                				<option>KTP</option>
                				<option>SIM</option>
                				<option>Kartu Keluarga</option>
                				<option>Ijazah</option>
                				<option>Passport</option>
                			</select>
                		</div>
                		<div class = "form-group">
                			<label>Nomor Identitas : </label>
                			<input class = "form-control" name = "no_identitas" required
                			placeholder="Masukan No Identitas info tertanggung">
                		</div>
                			
                
                
                <input type="button" class="btn btn-success" name="submit" value="Save">
                
                
				</div>

				<div class="col-lg-6">
					<div class = "form-group">
                			<label>Nama Penanggung : </label>
                			<select class = "form-control" name = "nasabah">
                				<option>unknow</option>
                				<option>unknow</option>
                				<option>unknow</option>
                				<option>unknow</option>
                				<option>unknow</option>
                			</select>
                		</div>
					<div class="form-group">
						<label for="exampleInputEmail1">Ahli Waris</label> <input
							type="text" class="form-control" name="ahli_waris"
							placeholder="Masukan Nama Ahli Waris">

					</div>
				</form>
				
				<div class="form-group"> 
					<label for="exampleInputEmail1">Program Setroran / bulan</label> <select
						class="form-control">
						<option>Rp.100.000</option>
						<option>Rp.300.00</option>
						<option>Rp.500.000</option>
					</select>
					</div>
				<br/><br/>
				<div class = "form-group">
	                			<textarea class="form-control" rows="10" name = "alamat" disabled="disabled"></textarea>
	                		</div>
				<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>				
				<h1 class="page-header">  </h1>
				
				<div class="form-group">
						<label for="exampleInputEmail1">Pekerjaan</label> <input
							type="text" class="form-control" name="pekerjaan"
							placeholder="Masukan Pekerjaan info tertanggung ">
				
					</div>
					
				<div class = "form-group">
						<label>Alamat Rumah : </label>
						<textarea class="form-control" rows="3" name = "alamat"></textarea>
					</div>
				
				<div class = "form-group">
                			<label>Jenis Kelamin : </label>
                			<div class = "radio">
                				<label>
                					<input type="radio" name="jenis_kelamin" value="Laki_Laki">Laki-Laki
                				</label>
                			</div>
                			<div class = "radio">
                				<label>
                					<input type="radio" name="jenis_kelamin" value="Perempuan">Perempuan
                				</label>
                			</div>
                
					
					
					<div class = "form-group">
                			<label>Status : </label>
                			<div class = "radio">
                				<label>
                					<input type="radio" name="status"  value="Sudah Menikah">Sudah Menikah
                				</label>
                			</div>
                			<div class = "radio">
                				<label>
                					<input type="radio" name="status"  value="Belum Menikah">Belum Menikah
                				</label>
                			</div>
                			
                	<div class = "form-group">
                			<label>Warga Negara : </label>
                			<div class = "radio">
                				<label>
                					<input type="radio" name="kewarganegaraan" value="WNI">WNI
                				</label>
                			</div>
                			<div class = "radio">
                				<label>
                					<input type="radio" name="warga_negara" value="WNA">WNA
                				</label>
                			</div>
                		</div>
                		

		</div>
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
<script>
function savePolis(){
	var no_polis = $('input[name="no_polis"]').val();
	var ahli_waris = $('input[name="ahli_waris"]').val();
	var tanggal_dibuat = $('input[name="tanggal_dibuat"]').val();
	var class_asuransi = $('#classasuransi').val();
	var produk_asuransi = $('#produkasuransi').val();
	var jumlah_storan = $('#jumlahstoran').val();
	var nasabah = $('#nasabah').val();
	
	var polis = {
			noPolis : no_polis,
			ahliWaris : ahli_waris,
			tanggalDibuat : tanggal_dibuat,
			classAsuransi : {
				id : class_asuransi
			},
			
			produkAsuransi : {
				id : produk_asuransi
			}, 
			
			jumlahStroran : {
				id : jumlah_storan
			},
			
			nasabah : {
				id : nasasbah
			}
			
	}
	$.ajax({
		url : '/poliscontroller/save',
		type : 'POST',
		contentType : 'application/json',
		data : JSON.stringify(polis),
		success : function(data, a, xhr) {
			console.log(xhr.status);
		}
		
	});
	
}

var jenis_kelamin;
var kewarganegaraan;
var status;

$(document).ready(function(){
	$('input[name="jenis_kelamin"]').on('change',function(){
		jenis_kelamin = $(this).val();
	});
	
	$('input[name="kewarganagaraan"]').on('change', function(){
		kewarganegaraan = $(this).val();
	});
	$('input[name="status"]').on('change',function(){
		status = $(this).val();
	});
	
});

	function saveInfoTertanggung(){
		var nama = $('input[namee="nama"]').val();
		var alamat =$('input[name="alamat"]').val();
		var pekerjaan =$('input[name="pekerjaan"]').val();
		var tanggal_lahir =$('input[name="tanggal_lahir"]').val();
		var no_hp =$('input[name="no_hp"]')val();
		var email =$('input[name="email"]').val();

		var info_tertanggung = {
				nama : nama,
				alamat : alamat,
				pekerjaan : pekerjaan,
				tanggalLahir : tanggal_lahir,
				noHp : no_hp,
				email : email,
				jenisKelamin : jenis_kelamin,
				kewarganegaraan : kewarganegaraan,
				status : status
		}
		
		$.ajax({
			url :'/infotertanggungcontroller/save',
			type : 'POST',
			contentType : 'application/json',
			success : function(data, a, xhr){
				console.log(xhr.status)
			}
		});
	
	}
	
<script>
</html>