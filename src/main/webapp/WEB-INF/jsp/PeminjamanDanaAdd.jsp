<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<link rel="stylesheet" href="./../../resources/assets/jquery-ui-1.12.1/jquery-ui.css">
<script type="text/javascript" src="/resources/assets/jquery-3.2.1.min.js"></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="./../../resources/assets/jquery-ui-1.12.1/jquery-ui.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$('#htg-angsuran').on('click', function(){
			$("#datepicker").datepicker();
			
			var jumlahPinjam = $('input[name="jumlah_pinjam"]').val();
			var lamaPinjam = $('input[name="lama_pinjam"]').val();
			var bungaBank = $('input[name="bunga_bank"]').val();
		 
			addDays(1825);
			
			var hasilAngsuranBunga = hitungAngsuranBunga(jumlahPinjam, lamaPinjam, bungaBank);
			$('#angsuran_bunga').val(hasilAngsuranBunga);
			
			var hasilAngsuranPokok = hitungAngsuranPokok(jumlahPinjam, lamaPinjam);
			$('#angsuran_pokok').val(hasilAngsuranPokok);
			
			var hasilTotalAngsuran = hitungTotalAngsuran(hasilAngsuranBunga, hasilAngsuranPokok);
			$('#total_angsuran').val(hasilTotalAngsuran);
		});
		
		function addDays(lamaPinjam){
		    var t = new Date();
		    t.setDate(t.getDate()+lamaPinjam); 
		    var month = "0"+(t.getMonth()+1);
		    var date = "0"+t.getDate();
		    var year = t.getFullYear();
		    month = month.slice(-2);
		    date = date.slice(-2);
		    year = year;
		    var date = date +"/"+month +"/"+year;
		  //  alert(date);
		    $('#jatuh_tempo').val(date);
		}
		
		function hitungAngsuranBunga(jumlahPinjam, lamaPinjam, bungaBank){
			var angsuranBunga = jumlahPinjam*(bungaBank/100)/(lamaPinjam/2);
			return angsuranBunga;
		}
	
		function hitungAngsuranPokok(jumlahPinjam, lamaPinjam){
			var angsuranPokok = jumlahPinjam/lamaPinjam;
			return angsuranPokok;
		}
		
		function hitungTotalAngsuran(hasilAngsuranBunga, hasilAngsuranPokok){
			var totalAngsuran = hasilAngsuranBunga+hasilAngsuranPokok;
			return totalAngsuran;
		}
		
		$("input[name='submit']").on("click", function(e) {
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
                            <a href="./../index"><i class="fa fa-dashboard fa-fw"></i> Menu Utama</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-wrench fa-fw"></i> Komponen Bank<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="./../karyawan">Karyawan</a>
                                </li>
                                <li>
                                    <a href="./../produknasabah">Produk Nasabah</a>
                                </li>
                                <li>
                                    <a href="#">Produk Asuransi</a>
                                </li>
                                <li>
                                    <a href="./../rekening">Info Rekening</a>
                                </li>
                                <li>
                                    <a href="#">Info Setoran Asuransi</a>
                                </li>
                                <li>
                                    <a href="./../classasuransi"> Kelas Asuransi</a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="./../asuransi"><i class="fa fa-table fa-fw"></i> Asuransi Kesehatan</a>
                        </li>
                        <li>
                            <a href="./../peminjamandana"><i class="fa fa-edit fa-fw"></i> Peminjaman Dana</a>
                        </li>
                        <li>
                            <a href="./../account"><i class="fa fa-book fa-fw"></i> Nasabah</a>
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
                    		<td><select class = "form-control" name="employee" id="employee">
                    			<c:forEach var="employee" items="${employee}">
                    				<option value="${employee.id}">${employee.nama}</option>
                    			</c:forEach>
                    		</select></td>
                    	</tr>
                    </table>
				<form role="form">
					<div class="col-lg-12">
						<h4 class="page-header">Data Diri</h4>
						<div class="col-lg-12">
							<div class="col-lg-12">
								<div class="form-group">
									<label>Nama Nasabah: </label> <select class="form-control" name="nasabah" id="nasabah">
										<c:forEach var="nasabah" items="${nasabah}">
											<option value="${nasabah.id}">${nasabah.nama}</option>
										</c:forEach>
									</select>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-6">
						<h4 class="page-header">Jaminan</h4>
						<div class="col-lg-12">
							<div class="col-lg-12">
								<div class="form-group">
									<label>Jaminan : </label> <select class="form-control" name="nama_jaminan">
										<option>-</option>
										<option value="Tanah atau Bangunan">Tanah atau Bagunan</option>
										<option value="Kendaraan">Kendaraan</option>
										<option value="Deposito">Deposito</option>
										<option value="Mesin">Mesin</option>
										<option value="Inventory">Inventory</option>
										<option value="Account Receivable">Account Receivable</option>
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
								<div class="form-group" id="filesContainer">
									<label>Masukkan Dokumen : </label> <input type="file"
										name="file_bukti_jaminan" id="file_bukti_jaminan" />
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
								<div class="form-group">
									<label>Tanggal Pinjam : </label> <input type="text"
									class="form-control" name="tanggal_pinjam" id="datepicker"/>
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
								<label>Lama Pinjam : </label>
								<div class="form-group input-group">
									<input type="text" class="form-control" name="lama_pinjam" value="60" readOnly>
									<span class="input-group-addon">Bulan</span>
								</div>
							</div>
							<div class="col-lg-6">
								<label>Bunga Bank : </label>
								<div class="form-group input-group">
									<input type="text" class="form-control" name="bunga_bank">
									<span class="input-group-addon">%</span>
								</div>
							</div>
							<div class="col-lg-12">
								<input type="button" id="htg-angsuran" class="btn btn-danger" value="Hitung Angsuran" onclick="">
							</div>
							<div class="col-lg-6">
								<div class="form-group">
									<label>Angsuran Bunga : </label> <input type="text"
									class="form-control" name="angsuran_bunga" id="angsuran_bunga" readOnly/>
								</div>
							</div>
							<div class="col-lg-6">
								<div class="form-group">
									<label>Angsuran Pokok : </label> <input type="text"
									class="form-control" name="angsuran_pokok" id="angsuran_pokok" readOnly/>
								</div>
							</div>
							<div class="col-lg-12">
								<label>Total Angsuran : </label>
								<div class="form-group input-group">
									<input type="text" class="form-control" name="total_angsuran" id="total_angsuran" readOnly/>
									<span class="input-group-addon">/Bulan	</span>
								</div>
							</div>
							<div class="col-lg-12">
								<div class="form-group">
									<label>Jatuh Tempo : </label> <input type="text"
									class="form-control" name="jatuh_tempo" id="jatuh_tempo" readOnly/>
								</div>
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
	
	<script src="./../../resources/assets/js/sb-admin-2.js"></script>
</body>
<script type="text/javascript">		
	function save() {
		var tujuanPenggunaan = $('input[name="tujuan_penggunaan"]').val();
		var jumlahPinjam = $('input[name="jumlah_pinjam"]').val();
		var lamaPinjam = $('input[name="lama_pinjam"]').val();
		var bungaBank = $('input[name="bunga_bank"]').val();
		var tanggalPinjam = $('input[name="tanggal_pinjam"]').val();
		var angsuranBunga = $('input[name="angsuran_bunga"]').val();
		var angsuranPokok = $('input[name="angsuran_pokok"]').val();
		var totalAngsuran = $('input[name="total_angsuran"]').val();
		var jatuhTempo = $('input[name="jatuh_tempo"]').val();
		var namaJaminan = $('select[name="nama_jaminan"]').val();
		var deskripsiJaminan = $("textarea[name='deskripsi_jaminan']").val();
		var fd = new FormData();    
		fd.append( 'theFiles', $('input[type="file"]')[0].files[0]);
		var nasabah = $('#nasabah').val();
		var employee = $('#employee').val();
		var myFiles = [];
		

		var pinjamdn = {
			    tujuanPenggunaan: tujuanPenggunaan,
			    jumlahPinjam: jumlahPinjam,
			    lamaPinjam: lamaPinjam,
			    bungaBank : bungaBank,
			    tanggalPinjam: tanggalPinjam,
			    angsuranBunga : angsuranBunga,
			    angsuranPokok : angsuranPokok,
			    totalAngsuran : totalAngsuran,
			    jatuhTempo: jatuhTempo,
			    namaJaminan: namaJaminan,
			    deskripsiJaminan: deskripsiJaminan,
			    nasabah : {
			    	id: nasabah
			    },
			    employee : {
			    	id: employee
			    },
			    myFiles : myFiles
		}
		
		
		$.ajax({
			  url: '/pinjamdana/doupload',
			  data: fd,
			  enctype: 'multipart/form-data',
			  processData: false,
			  contentType: false,
			  type: 'POST',
			  success: function(data){
				  console.log("file berhasil dimasukkan");
			  }
			});


		$.ajax({
			url : '/pinjamdana/save',
			type : 'POST',
			contentType : 'application/json', 
			data : JSON.stringify(pinjamdn), 
			success : function(data, a, xhr) { 
				if (xhr.status == 201) {
					console.log("data berhasil dimasukkan");
					window.location = "./../peminjamandana"; 
				}
			}
		});
	}
</script>
</html>