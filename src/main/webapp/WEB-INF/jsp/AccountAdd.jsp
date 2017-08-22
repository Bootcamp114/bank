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

		<title>Insert title here</title>

	<link href="/resources/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
	<link href="/resources/assets/css/bootstrap-theme.min.css" rel="stylesheet" />
	<link href="/resources/assets/css/sb-admin-2.css" rel="stylesheet" />
	<link href="/resources/assets/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link href="/resources/assets/jquery-ui-1.12.1/jquery-ui.css" rel="stylesheet">
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	<script src="/resources/assets/jquery-3.2.1.min.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script>
	$(function() {  
		// $("#tanggal_lahir").datepicker();
	});
	</script>
	<script type="text/javascript">
	var nasabah;
		$(document).ready(function(){
			var keluarga;

			$("#submit").on("click", function(e){
				console.log(nasabah);
				e.preventDefault();
				save();
			});

				var datatable = $('#keluarga-dt');
				var elementNama = $('#nama_kel');
				var elementHubungan = $('#hubungan_kel');
				var elementPendidikan = $('#pendidikan_kel');
				var elementUmur = $('#umur_kel');
				var elementNoTelp = $('#no_telp_kel');
				var elementSubmit = $('#add');
				var elementClose = $('#close');
				var oTr = 0;

				elementSubmit.on('click', function(){
 					var keluarga1 = {
 						nama : elementNama.val(),
 						hubungan : elementHubungan.val(),
 						pendidikan : elementPendidikan.val(),
 						umur : elementUmur.val(),
 						notelp : elementNoTelp.val()
 					}

 					var tbody = datatable.find('tbody');
 					//jquery append
 					var tr = "<tr>";
 					tr += "<td name='nama_kel' class='text-center'>"+keluarga1.nama+"</td>";
 					tr += "<td name='hubungan_kel' class='text-center'>"+keluarga1.hubungan+"</td>";
 					tr += "<td name='pendidikan_kel' class='text-center'>"+keluarga1.pendidikan+"</td>";
 					tr += "<td name='no_telp_kel' class='text-center'>"+keluarga1.notelp+"</td>";
 					tr += "<td name='umur' class='text-center'>"+keluarga1.umur+"</td>";
 					tr += "<td class='text-center'><a href='#' class='del btn btn-info btn-danger'>Delete</td>";
 					tr += "</tr>";
 					tbody.append(tr);

 					clearForm();
				});

				elementClose.on('click', function(){
					clearForm();
				});

				function clearForm() {
					elementNama.val("");
					elementHubungan.val("");
					elementPendidikan.val("");
					elementUmur.val("");
					elementNoTelp.val("");
				}

				$(document).on('click','.del',function(){
					var row = $(this).closest('tr');
					row.remove();
					alert('Data berhasil dihapus..');
				});

				$("#rekening").on("change", function(){
					showRekening();
				});

				$("#produk").on("change", function(){
					showProduk();
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
                    <h1 class="page-header">Buat Akun Nasabah<table align = "right">
                    	<tr>
                    		<td><select class = "form-control" name = "employee" id="employee">
                    			<option> </option>
                    			<c:forEach var = "employee" items = "${employee}">
	                				<option value="${employee.id}">${employee.nama}</option>
	                			</c:forEach>
                    		</select></td>
                    	</tr>
                    </table></h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
			<div class="panel-body">
	            <div class="row">
	                <!-- Edit Dibawah -->
	                <div class = "col-lg-6">
	                	<form role = "form" id = "myForm">
	                		<div class = "form-group">
	                			<label>No Rekening : </label>
	                			<span class = "form-control">${noRek}</span>
	                			<input type="hidden" class = "form-control" name = "no_rek" value="${noRek}">
	                			<p class="help-block">Nomer Rekening Otomatis</p>
	                		</div>
	                		<div class = "form-group">
	                			<label>Nama : </label>
	                			<input class = "form-control" name = "nama" required autofocus>
	                		</div>
	                		<div class = "form-group">
	                			<label>Jenis Identitas : </label>
	                			<select class = "form-control" name = "jenis_identitas">
	                				<option value = "KTP">KTP</option>
	                				<option value = "SIM">SIM</option>
	                				<option value = "Kartu Pelajar">Kartu Keluarga</option>
	                				<option value = "Ijazah">Ijazah</option>
	                				<option value = "Passport">Passport</option>
	                			</select>
	                		</div>
	                		<div class = "form-group">
	                			<label>Nomor Identitas : </label>
	                			<input class = "form-control" name = "no_identitas" required>
	                		</div>
	                		<div class = "form-group">
	                			<label>Warga Negara : </label>
	                			<div class = "radio">
	                				<label>
	                					<input type="radio" name="warga_negara" value="WNI"/>WNI
	                				</label>
	                				<label>
	                					<input type="radio" name="warga_negara" value="WNA"/>WNA
	                				</label>
	                			</div>
	                		</div>
	                		<div class = "form-group">
	                			<label>Tempat Lahir : </label>
	                			<input class = "form-control" name = "tempat_lahir">
	                		</div>
	                		<div class = "form-group">
	                			<label>Tanggal Lahir : </label>
	                			<input class = "form-control" name = "tanggal_lahir" id="tanggal_lahir" type="date">
	                		</div>
	                		<div class = "form-group">
	                			<label>No Hp : </label>
	                			<input class = "form-control" name = "no_hp">
	                		</div>
	                		<div class = "form-group">
	                			<label>Jenis Kelamin : </label>
	                			<div class = "radio">
	                				<label>
	                					<input type="radio" name="jenis_kel" value="Laki-Laki"/>Laki - Laki
	                				</label>
	                				<label>
	                					<input type="radio" name="jenis_kel" value="Perempuan"/>Perempuan
	                				</label>
	                			</div>
	                		</div>
	                		<div class="col-lg-12">
								<h1 class="page-header">Jenis Rekening</h1>
							</div>
	                		<div class = "form-group">
	                			<label>Rekening : </label>
	                			<select class = "form-control" name = "rekening" id="rekening">
	                			<option> </option>
	                				<c:forEach var = "rekening" items = "${rekening}">
	                					<option class="pilihRek" idPilihRek="${rekening.id}" value="${rekening.id}">${rekening.rekening}</option>
	                				</c:forEach>
	                			</select>
	                		</div>
	               			<div class = "form-group">
	                			<label>Produk : </label>
	                			<select class = "form-control" name = "produk" id="produk">
	                			<option> </option>
	                				<c:forEach var = "produkNasabah" items = "${produkNasabah}">
	                					<option class="pilihPro" idPilihPro="${produkNasabah.id}" value="${produkNasabah.id}">${produkNasabah.namaProduk}</option>
	                				</c:forEach>
	                			</select>
	                		</div>
							<label>Saldo Minimal : </label>
	              			<div class="form-group input-group">
								<span class="input-group-addon">Rp</span>
									<input type="text" class="form-control" id="saldo" value="---" disabled>
								<span class="input-group-addon">.00</span>
							</div>
	              			<label>Harga Produk : </label>
	               			<div class="form-group input-group">
								<span class="input-group-addon">Rp</span>
	                				<input type="text" class="form-control" id="pembayaran" value = "---" disabled>
								<span class="input-group-addon">.00</span>
							</div>
							<label>Total Pembayaran : </label>
	               			<div class="form-group input-group">
								<span class="input-group-addon">Rp</span>
	                				<input type="text" class="form-control" id="total" disabled>
								<span class="input-group-addon">.00</span>
							</div>
							<div class = "col-lg-12">
								<h1 class="page-header">Keluarga</h1>
							</div>
							<div class = "form-group">
		                		<label>Status Pernikahan : </label>
	                			<div class = "radio">
	                				<label>
	                					<input type="radio" name="status" value="Sudah Menikah"/>Sudah Menikah
	                				</label>
	                				<label>
	                					<input type="radio" name="status" value="Belum Menikah"/>Belum Menikah
	                				</label>
	                			</div>
		                	</div>
		                	<!-- <a class = "btn btn-info btn-sm"><span class = "fa fa-fw fa-plus"></span></a> -->
		                	<button type="button" class="btn btn-info btn-sm" data-toggle="modal" data-target="#add-keluarga"><span class = "fa fa-fw fa-plus"></span></button>
		                	<br>
			                <div class = "from-group">
			                	<table class = "table table-striped table-bordered table-hover dataTable no-footer dtr-inline" role = "grid" aria-describedby="dataTables-example_info" id="keluarga-dt">
									<thead class = "kolom">
										<tr>
											<th class="text-center">Nama</th>
											<th class="text-center">Hubungan Keluarga</th>
											<th class="text-center">Pendidikan</th>
											<th class="text-center">No Telp</th>
											<th class="text-center">Umur</th>
											<th class="text-center">Action</th>
										</tr>
									</thead>
									<tbody>
										
									</tbody>
								</table>
								<p class="help-block">Jika sudah meninggal dunia, Input Pendidikan terakhir semasa hidup.</p>
							</div>
							<div class = "form-group">
		                		<label>Ahli Waris : </label>
		               			<input class = "form-control" name = "ahli_waris">
		             		</div>
							
							<button type="submit" id = "submit" class="btn btn-success">Submit Button</button>
							<button type="reset" class="btn btn-warning">Reset Button</button>
								
					</div>
					<div class="col-lg-6">
						<div class = "form-group">
		                	<label>Rekomendasi Perusahaan : </label>
		               		<input class = "form-control" name = "rekomendasi_perusahaan">
		             	</div>
		                <div class = "form-group">
		                	<label>Pekerjaan : </label>
		               		<input class = "form-control" name = "pekerjaan">
		             	</div>
		              		<label>Penghasilan</label>
		              		<div class="form-group input-group">
							<span class="input-group-addon">Rp</span>
								<input class="form-control" name="penghasilan">
							<span class="input-group-addon">.00</span>
						</div>
						<div class = "form-group">
							<label>Alamat Rumah : </label>
							<textarea class="form-control" rows="3" name = "alamat"></textarea>
						</div>
						<div class = "form-group">
	                			<label>Email : </label>
	                			<input class = "form-control" name = "email" type = "text">
	                		</div>
						<div class = "form-group">
							<label>Nomor Peserta Wajib Pajak (NPWP) : </label>
							<input class = "form-control" name = "npwp">
						</div>
	                </div>
	                <!-- Modal -->
					<div class="modal fade" tabindex="-1" role="dialog" aria-labelledby="gridSystemModalLabel" id="add-keluarga">
						<div class="modal-dialog" role="document">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal" aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
									<h4 class="modal-title" id="gridSystemModalLabel">Add Keluarga</h4>
								</div>
								<div class="modal-body">
								<!-- <p>This is a small modal.</p>-->
									<div class="form-group">
										<label>Nama</label>
										<input type="text" class="form-control" id="nama_kel" placeholder="Masukan Nama">
									</div>
									<div class="form-group">
										<label>Hubungan Keluarga</label> 
										<input type="text" class="form-control" id="hubungan_kel" placeholder="Masukan Hubungan Keluarga">
									</div>
									<div class="form-group">
										<label>Pendidikan</label>
										<input type="text" class="form-control" id="pendidikan_kel" placeholder="Masukan Pendidikan">
									</div>
									<div class="form-group">
										<label>Umur</label>
										<input type="text" class="form-control" id="umur_kel" placeholder="Masukan Umur">
									</div>
									<div class="form-group">
										<label>Nomer Telepon</label>
										<input type="text" class="form-control" id="no_telp_kel" placeholder="Masukan Nomer Telp">
									</div>
									<div class="modal-footer">
										<button type="button" id="close" class="btn btn-default" data-dismiss="modal">Close</button>
										<button type="button" id="add" class="btn btn-primary" data-dismiss="modal" id="save">add</button>
									</div>
								</div>
							<!-- /.modal-content -->
							</div>
						<!-- /.modal-dialog -->
						</div>
					<!-- /.modal -->
					</div>
					</form>
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

    <!-- Custom Theme JavaScript -->
    <script src="./../../resources/assets/js/sb-admin-2.js"></script>
</body>
	<script type="text/javascript">
	var jenis_kel;
	var warga_negara;
	var status;

	$(document).ready(function(){
		$("input[name='jenis_kel']").on("change", function(){
			jenis_kel = $(this).val();
		});

		$("input[name='warga_negara']").on("change", function(){
			warga_negara = $(this).val();
		});

		$("input[name='status']").on("change", function(){
			status = $(this).val();
		});/* 

		$("#produk").on("change", function(){
			$("#pembayaran").val("10000");
		});

		$("#rekening").on("change", function(){
			$("#saldo").val("20000");
		}); */
	});
		function save() {
			var no_rek = $('input[name="no_rek"]').val();
			var nama = $('input[name="nama"]').val();
			var jenis_identitas = $('select[name="jenis_identitas"]').val();
			var no_identitas = $('input[name="no_identitas"]').val();
			var alamat = $('textarea[name="alamat"]').val();
			var tempat_lahir = $('input[name="tempat_lahir"]').val();
			var tanggal_lahir = $('input[name="tanggal_lahir"]').val();
			var email = $('input[name="email"]').val();
			var no_hp = $('input[name="no_hp"]').val();
			var pekerjaan = $('input[name="pekerjaan"]').val();
			var penghasilan = $('input[name="penghasilan"]').val();
			var npwp = $('input[name="npwp"]').val();
			var rekomendasi_perusahaan = $('input[name="rekomendasi_perusahaan"]').val();
			var ahli_waris = $('input[name="ahli_waris"]').val();
			var produk = $('#produk').val();
			var rekening = $('#rekening').val();
			var employee = $('#employee').val();

			nasabah = {
				noRek : no_rek,
				nama : nama,
				jenisIdentitas : jenis_identitas,
				noIdentitas : no_identitas,
				wargaNegara : warga_negara,
				alamat : alamat,
				email : email,
				noHp : no_hp,
				tempatLahir : tempat_lahir,
				tanggalLahir : tanggal_lahir,
				jenisKel : jenis_kel,
				pekerjaan : pekerjaan,
				penghasilan : penghasilan,
				npwp : npwp,
				rekomendasiPerusahaan : rekomendasi_perusahaan,
				status : status,
				ahliWaris : ahli_waris,
				produkNasabah : {
					id : produk
				},
				rekening : {
					id : rekening
				},
				employee : {
					id : employee
				},
				keluargaNasabah : [
					
				]
			}

			var table = $("#keluarga-dt");
			var tbody = table.find('tbody');
			var tr = tbody.find('tr');
			var families = [];
			$.each(tr, function(index, data){
				
				keluarga = {
						nama : $(this).find('td').eq(0).text(),
						hubunganKel : $(this).find('td').eq(1).text(),
						pendidikan : $(this).find('td').eq(2).text(),
						umur : $(this).find('td').eq(4).text(),
						noHp : $(this).find('td').eq(3).text()
					}
				
				nasabah.keluargaNasabah.push(keluarga);
			});

			$.ajax({
				url : '/nasabah/save',
				type : 'POST',
				contentType : 'application/json',
				data : JSON.stringify(nasabah), // Convert object to string
				dataType : 'JSON',
				success : function(data, a, xhr) {
					console.log(xhr.status);
					if (xhr.status == 201) {
						window.location = "./../account";			
					}
				}
			});
		}

		function pilihReke(data) {
			$("#saldo").val(data.saldo);
		}

		function pilihProd(data) {
			$("#pembayaran").val(data.harga);
		}

		
		function showRekening() {
			var idRek = $('#rekening').val();
			$.ajax({
				url : "/nasabah/rekening/getrekeningbyid/" + idRek,
				type : "GET",
				success : function(data){
					pilihReke(data);
					total();
				}
			});
		}

		function showProduk() {
			var idPro = $('#produk').val();
			$.ajax({
				url : "/nasabah/produknasabah/getprodukbyid/" + idPro,
				type : "GET",
				success : function(data){
					pilihProd(data);
					total();
				}
			});
		}
		
		function total() {
			var saldo = parseFloat($("#saldo").val());
			var pembayaran = parseFloat($("#pembayaran").val());
			$("#total").val(saldo+pembayaran);
		}

	</script>
</html>