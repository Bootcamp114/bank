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

<link href="./../../resources/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="./../../resources/assets/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">
<link href="./../../resources/assets/css/sb-admin-2.css" rel="stylesheet">
<link href="./../../resources/assets/vendor/morrisjs/morris.css" rel="stylesheet">
<link href="./../../resources/assets/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/resources/assets/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("input[name='submit']").on("click", function() {
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
	</div>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h2 class="page-header">Form Peminjaman Dana</h2>
				<table align = "right">
                    	<tr>
                    		<td><select class = "form-control" name = "role">
                    			<option>CS 1</option>
                    			<option>CS 2</option>
                    			<option>CS 3</option>
                    			<option>CS 4</option>
                    		</select></td>
                    	</tr>
                    </table>
				<form role="form">
					<div class="col-lg-12">
						<h4 class="page-header">Data Diri</h4>
						<div class="col-lg-12">
							<div class="col-lg-12">
								<div class="form-group">
									<label>Nama Nasabah: </label> <input class="form-control"
										name="nama">
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-6">
						<h4 class="page-header">Jaminan</h4>
						<div class="col-lg-12">
							<div class="col-lg-6">
								<div class="form-group">
									<label>Jaminan : </label> <select class="form-control"
										name="nama_jaminan">
										<option>-</option>
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
									<label>Deskripsi Jaminan : </label>
									<textarea class="form-control" rows="3" name="deskripsi_jaminan"></textarea>
								</div>
							</div>
							<div class="col-lg-12">
								<div class="form-group">
									<label>Masukkan Dokumen : </label> <input type="file"
										name="file_bukti_jaminan">
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-6">
						<h4 class="page-header">Fasilitas Peminjaman</h4>
						<div class="col-lg-12">
							<div class="col-lg-12">
								<div class="form-group">
									<label>Tujuan Penggunaan : </label> <input type="text"
									class="form-control" name="tujuan_penggunaan">
								</div>
							</div>
							<div class="col-lg-6">
								<label>Jumlah Pinjam</label>
								<div class="form-group input-group">
									<span class="input-group-addon">Rp</span> <input type="text"
										class="form-control" name="jumlah_pinjam"> <span
										class="input-group-addon">.00</span>
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
									<input type="text" class="form-control" name="bunga_bank">
									<span class="input-group-addon">%</span>
								</div>
							</div>
							<div class="col-lg-6">
								<div class="form-group">
									<label>Tanggal Pinjam : </label> <input type="date"
									class="form-control" name="tanggal_pinjam" />
								</div>
							</div>
							<div class="col-lg-12">
								<button type="submit" class="btn btn-danger" name="htg-angsuran">Hitung
									Angsuran</button>
							</div>
						</div>
					</div>
					<div class="col-lg-12">
						<input type="submit" class="btn btn-success" name="submit" value="Fix Loan" />
						<input type="reset" class="btn btn-info" value="Reset Form"/>
					</div>
				</form>
			</div>
			<!-- /.col-lg-12 -->
		</div>
	</div>
	<!-- /.row -->
	<div class="row"></div>
	<!-- /.row -->
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="./../../resources/assets/vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script
		src="./../../resources/assets/vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script
		src="./../../resources/assets/vendor/metisMenu/metisMenu.min.js"></script>

	<!-- Morris Charts JavaScript -->
	<script src="./../../resources/assets/vendor/raphael/raphael.min.js"></script>
	<script src="./../../resources/assets/vendor/morrisjs/morris.min.js"></script>
</body>
<script type="text/javascript">
	function save() {
		var nama = $('input[name="nama"]').val();
		var tujuanPenggunaan = $('input[name="tujuan_penggunaan"]').val();
		var jumlahPinjam = $('input[name="jumlah_pinjam"]').val();
		var lamaPinjam = $('input[name="lama_pinjam"]').val();
		var bungaBank = $('input[name="bunga_bank"]').val();
		var tanggalPinjam = $('input[name="tanggal_pinjam"]').val();
		var namaJaminan = $('input[name="nama_jaminan"]').val();
		var deskripsiJaminan = $('input[name="deskripsi_jaminan"]').val();
		var fileBuktiJaminan = $('input[name="file_bukti_jaminan"]').val();

		var pinjamdn = {
			    nama: nama,
			    tujuanPenggunaan: tujuanPenggunaan,
			    jumlahPinjam: jumlahPinjam,
			    lamaPinjam: lamaPinjam,
			    bungaBank : bungaBank,
			    tanggalPinjam: tanggalPinjam,
			    namaJaminan: namaJaminan,
			    deskripsiJaminan: deskripsiJaminan,
			    fileBuktiJaminan: fileBuktiJaminan
		}

		$.ajax({
			url : './../../pinjamdana/save',
			type : 'POST',
			contentType : 'application/json', 
			data : JSON.stringify(pinjamdn), 
			success : function(data, a, xhr) { 
				if (xhr.status == 201) {
					console.log("data berhasil dimasukkan");
				}
			}
		});
	}
</script>
</html>