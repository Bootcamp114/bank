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

	<link href="./../resources/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<link href="./../resources/assets/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">
	<link href="./../resources/assets/css/sb-admin-2.css" rel="stylesheet">
	<link href="./../resources/assets/vendor/morrisjs/morris.css" rel="stylesheet">
	<link href="./../resources/assets/vendor/font-awesome/css/font-awesome.min.css"
		rel="stylesheet" type="text/css">
	<script type="text/javascript" src="/resources/assets/jquery-3.2.1.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$(document).on('click', '.view', function(){
				var id = $(this).attr("id_view");
				$.ajax({
					url : "/bank/getmyfilesbyid/"+id,
					type : "GET",
					success: function(){
						console.log();
						document.location = "./viewfileblob";
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

           <!--  <ul class="nav navbar-top-links navbar-right">
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
                                    <a href="#">Produk Asuransi</a>
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
                    <h1 class="page-header">Table File Jaminan</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
				<div class = "col-lg-12">
					<br><br>
					<table class = "table table-striped table-bordered table-hover dataTable no-footer dtr-inline" id = "dataTables-example" role = "grid" aria-describedby="dataTables-example_info">
						<thead class = "kolom">
							<tr>
								<th class="text-center">Nama</th>
								<th class="text-center">File</th>
								<th class="text-center">Aksi</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach var = "myFiles" items = "${myFiles}">
							<tr>
								<td class="text-center">${myFiles.name}</td>
								<td class="text-center">${myFiles.file}</td>
								<td class="text-center"><a href="#" id_view="${myFiles.id}" class="view btn btn-warning btn-sm"><span class = "fa fa-fw fa-trello"></span>View</a></td>	
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
            </div>
		</div>
	</div>
            <!-- /.row -->
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="./../resources/assets/vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="./../resources/assets/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="./../resources/assets/vendor/metisMenu/metisMenu.min.js"></script>
    
    <script src="./../../resources/assets/js/sb-admin-2.js"></script>
</body>
</html>