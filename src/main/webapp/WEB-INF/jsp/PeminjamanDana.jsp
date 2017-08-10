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

<link href="./../resources/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="./../resources/assets/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">
<link href="./../resources/assets/css/sb-admin-2.css" rel="stylesheet">
<link href="./../resources/assets/vendor/morrisjs/morris.css" rel="stylesheet">
<link href="./../resources/assets/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

</head>
<body>
	<div id="wrapper">
		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
		<div class="navbar-header">
			<a class="navbar-brand" href="index">Bank CBA</a>
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
					<li><a href="index"><i class="fa fa-dashboard fa-fw"></i>
							Dashboard</a></li>
					<li><a href="asuransi"><i class="fa fa-table fa-fw"></i>
							Health Insurance</a></li>
					<li><a href="peminjamandana"><i class="fa fa-edit fa-fw"></i>
							Loan Funds</a></li>
					<li><a href="account"><i class="fa fa-book fa-fw"></i>
							Create Nasabah Account</a></li>
				</ul>
			</div>
			<!-- /.sidebar-collapse -->
		</div>
		<!-- /.navbar-static-side --> </nav>

		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h2 class="page-header">Form Peminjaman Dana</h2>
					<form role="form">
						<div class="col-lg-6">
							<h4 class="page-header">Data Diri</h4>
							<div class="col-lg-12">
								<div class="col-lg-6">
									<div class="form-group">
										<label>Nama : </label> <input class="form-control" name="nama">
									</div>
								</div>
								<div class="col-lg-6">
									<div class="form-group">
										<label>Jenis Identitas : </label> <select class="form-control"
											name="jenis_identitas" disabled="disabled">
											<option>KTP</option>
											<option>SIM</option>
											<option>Kartu Keluarga</option>
											<option>Ijazah</option>
											<option>Passport</option>
										</select>
									</div>
								</div>
								<div class="col-lg-6">
									<div class="form-group">
										<label>Nomor Identitas : </label> <input class="form-control"
											name="no_identitas" disabled="disabled">
									</div>
								</div>
								<div class="col-lg-6">
									<div class="form-group">
										<label>Warga Negara : </label>
										<div class="radio">
											<label> <input type="radio" name="warga_negara"
												id="wni" disabled="disabled">WNI
											</label>
										</div>
										<div class="radio">
											<label> <input type="radio" name="warga_negara"
												id="wna" disabled="disabled">WNA
											</label>
										</div>
									</div>
								</div>
								<div class="col-lg-6">
									<div class="form-group">
										<label>Alamat Rumah : </label>
										<textarea class="form-control" rows="1" name="alamat"
											disabled="disabled"></textarea>
									</div>
								</div>
								<div class="col-lg-6">
									<div class="form-group">
										<label>Tempat Lahir : </label> <input class="form-control"
											name="tempat_lahir" disabled="disabled">
									</div>
								</div>
								<div class="col-lg-6">
									<div class="form-group">
										<label>Tanggal Lahir : </label> <input class="form-control"
											name="tanggal_lahir" type="date" disabled="disabled" />
									</div>
								</div>
								<div class="col-lg-6">
									<div class="form-group">
										<label>Jenis Kelamin : </label>
										<div class="radio">
											<label> <input type="radio" name="jenis_kel"
												id="laki" disabled="disabled">Laki - Laki
											</label>
										</div>
										<div class="radio">
											<label> <input type="radio" name="jenis_kel"
												id="perempuan" disabled="disabled">Perempuan
											</label>
										</div>
									</div>
								</div>
								<div class="col-lg-6">
									<div class="form-group">
										<label>Pekerjaan : </label> <input class="form-control"
											name="pekerjaan" disabled="disabled">
									</div>
								</div>
								<div class="col-lg-6">
									<label>Penghasilan (/bln)</label>
									<div class="form-group input-group">
										<span class="input-group-addon">Rp</span> <input type="text"
											class="form-control" disabled="disabled" name="penghasilan"> <span
											class="input-group-addon">.00</span>
									</div>
								</div>
								<div class="col-lg-6">
									<div class="form-group">
										<label>Nomor Peserta Wajib Pajak : </label> <input
											class="form-control" name="npwp" disabled="disabled">
									</div>
								</div>
								<div class="col-lg-6">
									<div class="form-group">
										<label>Rekening : </label> <input type="text"
											class="form-control" disabled="disabled" name="no_rek">
									</div>
								</div>
							</div>
						</div>
						<div class="col-lg-6">
							<h4 class="page-header">Fasilitas Peminjaman</h4>
							<div class="col-lg-12">
								<div class="col-lg-12">
									<div class="form-group">
										<label>Tujuan Penggunaan : </label> <select class="form-control"
											name="tujuan_penggunaan">
											<option>Kredit Komsumtif</option>
											<option>Kredit Komersil</option>
										</select>
									</div>
								</div>
								<div class="col-lg-6">
									<div class="form-group">
										<label>Jenis Kredit Komsumtif : </label> <select class="form-control"
											name="jenis_kredit">
											<option>Kredit Tanpa Agunan</option>
											<option>Kredit Kepemilikan Rumah</option>
											<option>Kredit Multiguna Berjaminan</option>
											<option>Kredit Kendaraan</option>
										</select>
									</div>
								</div>
								<div class="col-lg-6">
									<div class="form-group">
										<label>Jenis Kredit Komersil : </label> <select class="form-control"
											name="jenis_kredit">
											<option>Kredit Mikro</option>
											<option>Kredit Usaha Kecil</option>
											<option>Kredit Usaha Menengah</option>
											<option>Kredit Koperasi</option>
										</select>
									</div>
								</div>
								<div class="col-lg-6">
									<label>Jumlah Pinjam</label>
									<div class="form-group input-group">
										<span class="input-group-addon">Rp</span> <input type="text"
											class="form-control" name="jumlah_pinjam"> <span class="input-group-addon">.00</span>
									</div>
								</div>
								<div class="col-lg-6">
									<div class="form-group">
										<label>Lama Pinjam : </label> <select class="form-control"
											name="lama_pinjam">
											<option>- </option>
											<option>12 Bulan</option>
											<option>24 Bulan</option>
											<option>36 Bulan</option>
											<option>48 Bulan</option>
											<option>60 Bulan</option>
										</select>
									</div>
								</div>
								<div class="col-lg-6">
									<label>Bunga Bank (/thn)</label>
									<div class="form-group input-group">
										<input type="text" class="form-control" name="bunga_bank"> <span
											class="input-group-addon">%</span>
									</div>
								</div>
								<div class="col-lg-6">
									<div class="form-group">
										<label>Jenis Suku Bunga : </label> <select
											class="form-control" name="jenis_suku_bunga">
											<option>- </option>
											<option>Flat</option>
											<option>Efektif</option>
											<option>Anuitas</option>
										</select>
									</div>
								</div>
								<div class="col-lg-12">
									<button type="submit" class="btn btn-danger">Hitung Angsuran</button>
								</div>
							</div>
						</div>
						<div class="col-lg-6">
							<h4 class="page-header">Jaminan</h4>
							<div class="col-lg-12">
								<div class="col-lg-6">
									<div class="form-group">
										<label>Jenis Jaminan : </label> <select class="form-control"
											name="jenis_jaminan">
											<option>- </option>
											<option>Tanah atau Bagunan</option>
											<option>Kendaraan</option>
											<option>Deposito</option>
											<option>Mesin</option>
											<option>Inventory</option>
											<option>Account Receivable</option>
										</select>
									</div>
								</div>
								<div class="col-lg-12">
									<div class="form-group">
                                            <label>Dokumen Yang Harus Dilengkapi : </label>
                                            <textarea class="form-control" rows="3" disabled="disabled" name="jenis_dokumen"></textarea>
                                        </div>
								</div>
								<div class="col-lg-12">
									<div class="form-group">
										<label>Masukkan Dokumen : </label> 
										<input type="file" name="file_dokumen">
									</div>
								</div>
							</div>
						</div>
						<div class="col-lg-12">
							<button type="submit" class="btn btn-success">Submit
								Button</button>
							<button type="reset" class="btn btn-info">Reset Button</button>
						</div>
					</form>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row"></div>
			<!-- /.row -->
			<!-- /#wrapper -->

			<!-- jQuery -->
			<script src="./../resources/assets/vendor/jquery/jquery.min.js"></script>

			<!-- Bootstrap Core JavaScript -->
			<script
				src="./../resources/assets/vendor/bootstrap/js/bootstrap.min.js"></script>

			<!-- Metis Menu Plugin JavaScript -->
			<script src="./../resources/assets/vendor/metisMenu/metisMenu.min.js"></script>

			<!-- Morris Charts JavaScript -->
			<script src="./../resources/assets/vendor/raphael/raphael.min.js"></script>
			<script src="./../resources/assets/vendor/morrisjs/morris.min.js"></script>
			<script src="./../resources/assets/data/morris-data.js"></script>

			<!-- Custom Theme JavaScript -->
			<script src="./../resources/assets/dist/js/sb-admin-2.js"></script>
</body>
</html>