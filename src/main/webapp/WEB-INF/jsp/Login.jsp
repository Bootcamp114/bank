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

		<title>Login Form</title>
	
	<link href="./resources/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<link href="./resources/assets/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">
	<link href="./resources/assets/css/sb-admin-2.css" rel="stylesheet">
	<link href="./resources/assets/vendor/font-awesome/css/font-awesome.min.css"
		rel="stylesheet" type="text/css">
</head>
<body>

    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title"><center>Please Sign In</center></h3>
                    </div>
                    <div class="panel-body">
                        <form role="form">
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Username" name="username" type="text" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Password" name="password" type="password" value="">
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                    </label>
                                </div>
                                <!-- Change this to a button or input when using this as a form -->
                                <button class="btn btn-lg btn-success btn-block">Login</button>
                                </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="./resources/assets/vendor/jquery/jquery.min.js"></script>
    <script src="./resources/assets/vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="./resources/assets/vendor/metisMenu/metisMenu.min.js"></script>
    <script src="./resources/assets/js/sb-admin-2.js"></script>
</body>
</html>