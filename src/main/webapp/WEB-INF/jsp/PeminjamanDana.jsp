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
	href="./../resources/assets/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="./../resources/assets/vendor/metisMenu/metisMenu.min.css"
	rel="stylesheet">
<link href="./../resources/assets/css/sb-admin-2.css" rel="stylesheet">
<link href="./../resources/assets/vendor/morrisjs/morris.css"
	rel="stylesheet">
<link
	href="./../resources/assets/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

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
					<li><a href="#"><i class="fa fa-table fa-fw"></i> Health
							Insurance</a></li>
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
					<h1 class="page-header">Form Peminjaman Dana</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<!-- Edit Dibawah -->
				<div class="col-lg-6">
					<form role="form">
						<div class="form-group">
							<label>Nama Nasabah : </label> <select class="form-control">
								<option>Unknown</option>
								<option>Unknown</option>
								<option>Unknown</option>
								<option>Unknown</option>
								<option>Unknown</option>
							</select>
						</div>
					</form>
				</div>
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">Peminjaman Dana</h1>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="form-group">
						<label>Jumlah Pinjam : </label> <input type="text"
							class="form-control"> </select>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="form-group">
						<label>Lama Pinjam : </label> <input type="text"
							class="form-control"> </select>
					</div>
				</div>
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">Jaminan</h1>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="form-group">
						<label>Jenis Jaminan : </label> <select class="form-control">
							<option>Tanah atau Tanah dan Bangunan</option>
							<option>Kendaraan</option>
							<option>Deposito</option>
							<option>Mesin</option>
							<option>Inventory</option>
							<option>Account Receivable</option>
						</select>
					</div>
					<div class="form-group">
						<label>Upload Jaminan : </label> <input type="file">
					</div>
					<button type="submit" class="btn btn-success">Submit
						Button</button>
					<button type="reset" class="btn btn-info">Reset Button</button>
					</form>
				</div>
			</div>
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