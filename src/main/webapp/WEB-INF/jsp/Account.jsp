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

	<link href="./../../resources/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<link href="./../../resources/assets/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">
	<link href="./../../resources/assets/css/sb-admin-2.css" rel="stylesheet">
	<link href="./../../resources/assets/vendor/morrisjs/morris.css" rel="stylesheet">
	<link href="./../../resources/assets/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link href="./../../resources/assets/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css">
		
</head>
	<script type="text/javascript" src="/resources/assets/jquery-3.2.1.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			
			$("#dataTables-example").DataTable();
			
			$(document).on("click", ".delete", function(){
				var conf = confirm("Apakah anda yakin menghapus data ini ?");
				if (conf == true){
					// alert("Cannot Delete This Data !");
					doDelete(this);
				}
			});
		});
	</script>
<body>
    <div id="wrapper">
        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <a class="navbar-brand" href="index">Bank CBA</a>
            </div>
            <!-- /.navbar-header -->

            <!-- <ul class="nav navbar-top-links navbar-right">
                /.dropdown
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                        </li>
                    </ul>
                    /.dropdown-user
                </li>
                /.dropdown
            </ul> -->
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
                    <h1 class="page-header">Akun Nasabah</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
				<div class = "col-lg-12">
					<div class = "col-lg-4">
						<a href="account/add" class = "btn btn-success btn-md"><span class = "fa fa-fw fa-plus"></span>Tambah Akun</a>
						<a href="account" class = "btn btn-primary btn-md"><span class = "fa fa-fw fa-refresh fa-spin"></span>Refresh</a>
					</div>
					<br><br>
					<table class = "table table-striped table-bordered table-hover dataTable no-footer dtr-inline" id = "dataTables-example" role = "grid" aria-describedby="dataTables-example_info">
						<thead class = "kolom">
							<tr>
								<th class="text-center">Nama</th>
								<th class="text-center">Alamat</th>
								<th class="text-center">Jenis Kelamin</th>
								<th class="text-center">Email</th>
								<th class="text-center">Tanggal Lahir</th>
								<th class="text-center">Pekerjaan</th>
								<th class="text-center">Action</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach var = "nasabah" items = "${nasabah}">
							<tr>
								<td class="text-center">${nasabah.nama}</td>
								<td class="text-center">${nasabah.alamat}</td>
								<td class="text-center">${nasabah.jenisKel}</td>
								<td class="text-center">${nasabah.email}</td>
								<td class="text-center">${nasabah.tanggalLahir}</td>
								<td class="text-center">${nasabah.pekerjaan}</td>
								<td class="text-center"><a href="#" id_delete="${nasabah.id}" class = "delete btn btn-danger btn-sm"><span class = "fa fa-fw fa-times"></span>Delete</a></td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
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

    <!-- Morris Charts JavaScript -->
    <script src="./../../resources/assets/vendor/raphael/raphael.min.js"></script>
    
    <script src="./../../resources/assets/js/sb-admin-2.js"></script>
</body>
<script>
	function doDelete(del){
		var id = $(del).attr("id_delete");
		$.ajax({
			url : "/nasabah/delete/"+id,
			type : "DELETE",
			success : function(data){
				console.log(data);
				window.location = "account";
			}
		});
	}
</script>
<script type="text/javascript" src="/resources/assets/datatable/jquery.dataTables.min.js"></script>
</html>