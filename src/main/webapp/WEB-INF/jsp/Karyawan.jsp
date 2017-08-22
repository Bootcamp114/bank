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
	<link href="./../../resources/assets/vendor/font-awesome/css/font-awesome.min.css"
		rel="stylesheet" type="text/css">
		
</head>
	<script type="text/javascript" src="/resources/assets/jquery-3.2.1.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			var karyawan;

			$("#update").on("click", function(){
				updateData();
				window.location.href = "karyawan";
				// alert("Berfungsi..");
			});

			$(document).on("click", ".delete", function(){
				var conf = confirm("Apakah anda yakin menghapus data ini ?");
				if (conf == true){
					doDelete(this);
				}
			});

			$(document).on("click", ".edit", function(){
				var id = $(this).attr("id_update");
				$.ajax({
					url : "/nasabah/karyawan/getkaryawanbyid/"+id,
					type : "GET",
					dataType : "json",
					success : function(data){
						editData(data);
					}
				});
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
                    <h1 class="page-header">Karyawan</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
		<div class="panel-body">
            <div class="row">
				<div class = "col-lg-12">
					<div class = "col-lg-4">
						<a href="karyawan/add" class = "btn btn-success btn-md"><span class = "fa fa-fw fa-plus"></span>Tambah Karyawan</a>
						<a href="karyawan" class = "btn btn-primary btn-md"><span class = "fa fa-fw fa-refresh fa-spin"></span>Refresh</a>
					</div>
					<br><br>
					<table class = "table table-striped table-bordered table-hover dataTable no-footer dtr-inline" id = "dataTables-example" role = "grid" aria-describedby="dataTables-example_info">
						<thead class = "kolom">
							<tr>
								<th class="text-center">Nama Karyawan</th>
								<th class="text-center">Alamat</th>
								<th class="text-center">No Hp</th>
								<th class="text-center">Email</th>
								<th class="text-center" colspan="3">Action</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach var = "karyawan" items = "${karyawan}">
							<tr>
								<td class="text-center">${karyawan.nama}</td>
								<td class="text-center">${karyawan.alamat}</td>
								<td class="text-center">${karyawan.noHp}</td>
								<td class="text-center">${karyawan.email}</td>
								<td class="text-center"><a href="#" id_update="${karyawan.id}" class = "edit btn btn-primary btn-sm" data-toggle="modal" data-target="#edit-karyawan"><span class = "fa fa-fw fa-edit"></span>Edit</a></td>
								<td class="text-center"><a href="#" id_delete="${karyawan.id}" class = "delete btn btn-danger btn-sm"><span class = "fa fa-fw fa-times"></span>Delete</a></td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
					<div class="modal fade" tabindex="-1" role="dialog" aria-labelledby="gridSystemModalLabel" id="edit-karyawan">
						<div class="modal-dialog" role="document">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal" aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
									<h4 class="modal-title" id="gridSystemModalLabel">Edit Karyawan</h4>
								</div>
								<div class="modal-body">
								<!-- <p>This is a small modal.</p>-->
									<form id="form">
										<div class="form-group">
											<label>ID</label>
											<input type="text" name="id_edit" class="form-control" id="id" disabled>
										</div>
										<div class="form-group">
											<label>Nama Karyawan</label>
											<input type="text" name="nama_edit" class="form-control" id="nama">
										</div>
										<div class="form-group">
											<label>Alamat</label> 
											<input type="text" name="alamat_edit" class="form-control" id="alamat">
										</div>
										<div class="form-group">
											<label>Nomer Handphone</label> 
											<input type="text" name="nohp_edit" class="form-control" id="nohp">
										</div>
										<div class="form-group">
											<label>Email</label> 
											<input type="text" name="email_edit" class="form-control" id="email">
										</div>
										<div class="modal-footer">
											<button type="button" id="close" class="btn btn-default" data-dismiss="modal">Cancel</button>
											<button type="button" id="update" class="btn btn-primary" data-dismiss="modal">Update</button>
										</div>
									</form>
								</div>
							<!-- /.modal-content -->
							</div>
						<!-- /.modal-dialog -->
						</div>
					<!-- /.modal -->
					</div>
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

    <!-- Morris Charts JavaScript -->
    <script src="./../../resources/assets/vendor/raphael/raphael.min.js"></script>
    
    <script src="./../../resources/assets/js/sb-admin-2.js"></script>
</body>
<script>
	function doDelete(del){
		var id = $(del).attr("id_delete");
		$.ajax({
			url : "/nasabah/karyawan/delete/"+id,
			type : "DELETE",
			success : function(data){
				console.log(data);
				window.location = "karyawan";
			}
		});
	}

	function updateData(data) {
		var id = $('input[name="id_edit"]').val();
		var nama = $('input[name="nama_edit"]').val();
		var alamat = $('input[name="alamat_edit"]').val();
		var nohp = $('input[name="nohp_edit"]').val();
		var email = $('input[name="email_edit"]').val();

		karyawan = {
			id : id,
			nama : nama,
			alamat : alamat,
			noHp : nohp,
			email : email
		}

		$.ajax({
			url : "/nasabah/karyawan/update",
			type : "POST",
			contentType : "application/json",
			data : JSON.stringify(karyawan),
			dataType : "JSON",
			success : function(data) {
				window.location.href = "karyawan";
			},
		});
	}

	function editData(data) {
		$('input[name="id_edit"]').val(data.id);
		$('input[name="nama_edit"]').val(data.nama);
		$('input[name="alamat_edit"]').val(data.alamat);
		$('input[name="nohp_edit"]').val(data.noHp);
		$('input[name="email_edit"]').val(data.email);
	}
</script>
</html>