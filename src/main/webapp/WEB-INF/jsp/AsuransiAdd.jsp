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

</head>
<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
		<div class="navbar-header">
			<a class="navbar-brand" href="index.html">Bank CBA</a>
		</div>
		<!-- /.navbar-header -->

		<ul class="nav navbar-top-links navbar-right">
			<!-- /.dropdown -->
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
					<i class="fa fa-caret-down"></i>
			</a>
				<ul class="dropdown-menu dropdown-user">
					<li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i>
							Logout</a></li>
				</ul> <!-- /.dropdown-user --></li>
			<!-- /.dropdown -->
		</ul>
		<!-- /.navbar-top-links -->

		<div class="navbar-default sidebar" role="navigation">
			<div class="sidebar-nav navbar-collapse">
				<ul class="nav" id="side-menu">
					<li><a href="../index"><i class="fa fa-dashboard fa-fw"></i>
							Dashboard</a></li>
					<li><a href="../asuransi"><i class="fa fa-table fa-fw"></i> Health
							Insurance</a></li>
					<li><a href="../peminjamandana"><i class="fa fa-edit fa-fw"></i> Loan
							Funds</a></li>
					<li><a href="../account"><i class="fa fa-book fa-fw"></i> Create
							Nasabah Account</a></li>
				</ul>
			</div>
			<!-- /.sidebar-collapse -->
		</div>
		<!-- /.navbar-static-side --> </nav>

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
								placeholder="Masukan No Polis" disabled="disabled">
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
						<a href="asuransiadd"><button type="button" hre
								class="btn btn-primary">Rincian</button></a><br/><br/>
					
					<div class = "form-group">
	                			<textarea class="form-control" rows="10" name = "alamat" disabled="disabled"></textarea>
	                		</div>
								
					<h2 class="page-header">Info Tertanggung</h2>
				<div class="form-group">
						<label for="exampleInputEmail1">Nama</label> <input
							type="text" class="form-control" id="NoPolis"
							placeholder="Masukan Nama penanggung ">
				</div>
				<div class = "form-group">
                			<label>Hubungan : </label>
                			<select class = "form-control" name = "jenis_identitas">
                				<option>Anak</option>
                				<option>Istri/Suami</option>
                				<option>Ayah/Ibu</option>
                				<option>Adik/Kakak</option>
                				<option>Lain-Lain</option>
                			</select>
                		</div>
                <div class = "form-group">
                			<label>No Hp : </label>
                			<input class = "form-control" name = "no_identitas" required>
                		</div>
                <div class = "form-group">
                			<label>Email : </label>
                			<input class = "form-control" name = "no_identitas" required>
                		</div>
				<div class="form-group">
						<label for="exampleInputEmail1">Tanggal Lahir</label> <input
							type="date" class="form-control"  id="NoPolis"
							placeholder="Masukan Nama penanggung ">
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
                			<input class = "form-control" name = "no_identitas" required>
                		</div>
                
                <button type="button" class="btn btn-success">Save</button>
                <button type="button" class="btn btn-danger">Cencel</button>
                
				</div>

				<div class="col-lg-6">
					<div class="form-group">
						<label for="exampleInputEmail1">Nama Penanggung</label> <input
							type="text" class="form-control" id="NoPolis"
							placeholder="Masukan Nama penanggung ">

					</div>
				</form>

				<div class="form-group">
					<label for="exampleInputEmail1">Program Stroran / bulan</label> <select
						class="form-control">
						<option>Rp.100.000</option>
						<option>Rp.300.00</option>
						<option>Rp.500.000</option>
					</select>
					</div>
				<a href="asuransiadd"><button type="button" hre
								class="btn btn-primary">Rincian</button></a><br/><br/>
				<div class = "form-group">
	                			<textarea class="form-control" rows="10" name = "alamat" disabled="disabled"></textarea>
	                		</div>
				<br/>
				
				<h1 class="page-header">  </h1>
				
				<div class="form-group">
						<label for="exampleInputEmail1">Pekerjaan</label> <input
							type="text" class="form-control" id="NoPolis"
							placeholder="Masukan Nama penanggung ">
				

					</div>
					
				<div class = "form-group">
						<label>Alamat Rumah : </label>
						<textarea class="form-control" rows="3" name = "alamat"></textarea>
					</div>
				
				<div class = "form-group">
                			<label>Jenis Kelamin : </label>
                			<div class = "radio">
                				<label>
                					<input type="radio" name="jenis_kel" id="laki" checked>Laki - Laki
                				</label>
                			</div>
                			<div class = "radio">
                				<label>
                					<input type="radio" name="jenis_kel" id="perempuan" checked>Perempuan
                				</label>
                			</div>
                
					
					
					<div class = "form-group">
                			<label>Status : </label>
                			<div class = "radio">
                				<label>
                					<input type="radio" name="status" id="sudah" checked>Menikah
                				</label>
                			</div>
                			<div class = "radio">
                				<label>
                					<input type="radio" name="status" id="belum" checked>Belum Menikah
                				</label>
                			</div>
                			
                	<div class = "form-group">
                			<label>Warga Negara : </label>
                			<div class = "radio">
                				<label>
                					<input type="radio" name="warga_negara" id="wni" checked>WNI
                				</label>
                			</div>
                			<div class = "radio">
                				<label>
                					<input type="radio" name="warga_negara" id="wna" checked>WNA
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
	<script src="./../../resources/assets/data/morris-data.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="./../../resources/assets/dist/js/sb-admin-2.js"></script>
</body>
</html>