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
	<link href="./../../resources/assets/vendor/font-awesome/css/font-awesome.min.css"
		rel="stylesheet" type="text/css">
		
	<script type="text/javascript"
		src="/resources/assets/jquery-3.2.1.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#submit").on("click", function(e){
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
                            <a href="../index"><i class="fa fa-dashboard fa-fw"></i> Menu Utama</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-wrench fa-fw"></i> Komponen Bank<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="../karyawan">Karyawan</a>
                                </li>
                                <li>
                                    <a href="../produknasabah">Produk Nasabah</a>
                                </li>
                                <li>
                                    <a href="../produkasuransi">Produk Asuransi</a>
                                </li>
                                <li>
                                    <a href="../rekening">Info Rekening</a>
                                </li>
                                <li>
                                    <a href="../classasuransi"> Kelas Asuransi</a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="../asuransi"><i class="fa fa-table fa-fw"></i> Asuransi Kesehatan</a>
                        </li>
                        <li>
                            <a href="../peminjamandana"><i class="fa fa-edit fa-fw"></i> Peminjaman Dana</a>
                        </li>
                        <li>
                            <a href="../account"><i class="fa fa-book fa-fw"></i> Nasabah</a>
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
                    <h1 class="page-header">Tambah Karyawan</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <!-- Edit Dibawah -->
				<form>
					<div class="col-lg-6">
						<div class = "form-group">
		                	<label>Nama Karyawan : </label>
		               		<input class = "form-control" name = "nama" required autofocus>
		             	</div>
		                <div class = "form-group">
		                	<label>Alamat : </label>
		               		<input class = "form-control" name = "alamat">
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
		                	<label>Username : </label>
		               		<input class = "form-control" name = "username">
	               		</div>
	               		<div class = "form-group">
		                	<label>Password : </label>
		               		<input class = "form-control" name = "password">
	               		</div>
	                <button type="submit" id = "submit" class="btn btn-success">Submit Button</button>
					<button type="reset" class="btn btn-warning">Reset Button</button>
				</form>
			</div>
		</div>
	</div>
            <!-- /.row -->
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="./../../resources/assets/vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="./../../resources/assets/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="./../../resources/assets/vendor/metisMenu/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="./../../resources/assets/js/sb-admin-2.js"></script>
</body>
	<script type = "text/javascript">
		function save() {
			var nama = $('input[name="nama"]').val();
			var alamat = $('input[name="alamat"]').val();
			var no_hp = $('input[name="no_hp"]').val();
			var email = $('input[name="email"]').val();
			var username = $('input[name="username"]').val();
			var password = $('input[name="password"]').val();

			var karyawan = {
				nama : nama,
				alamat : alamat,
				noHp : no_hp,
				email : email,
				username : username,
				password : password
			}

			$.ajax({
				url : '/nasabah/karyawan/save',
				type : 'POST',
				contentType : 'application/json',
				data : JSON.stringify(karyawan), // Convert object to string
				success : function(data, a, xhr) {
					console.log(xhr.status);
					if (xhr.status == 201) {
						window.location = "./../karyawan";
					}
				}
			});
		}
	</script>
</html>