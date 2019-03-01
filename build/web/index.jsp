<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=on">
    <title>
        Test task
    </title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body>
    <nav class="navbar bg-primary">
        <img class="ml-5" width="30" height="30" src="img/Logo.png" alt="logo">
    </nav>
    
    <div class="container-fluid">
        <div class="container">
            <div class="row my-4">
                <div class="col-md text-center">
                    <div class="d-flex h-100 justify-content-center align-items-center" style="color: #007bff;"> 
                        Welcom<br>Please, Log in to access your page<br>Or Sign up, if you don`t have an account
                    </div>
                </div>
                <div class="border-left col-md-4 col-lg-3">
                    
                    <form method="GET" action="login" class="formLogin">
                        <div class="form-group">
                            <label>Login</label>
                            <div class="d-flex justify-content-center" style="color:red;">
                                <small>${message}</small>
                            </div>
                            <input class="form-control field login" type="text" name="login" placeholder="login">
                            <small class="text-muted">Please, enter your login</small>
                        </div>
                        <div class="form-group">
                            <label>Password</label>
                            <input class="form-control field password" type="password" name="password" placeholder="password">
                            <small class="text-muted">Please, enter your password</small>
                        </div>
                        <button class="btn btn-success loginBtn" type="submit" name="loginsub">Log in</button>  
                    </form>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row mb-4">
                <div class="border-right col-md-4 col-lg-3">
                    <form method="GET" action="signin" class="formSignin">
			<div class="form-group">
                            <label for="firstnameEnter">Firstname</label>
                            <input class="form-control field" type="text" name="firstname" placeholder="firstname">
                            <small class="text-muted">Please, enter your firstname<br>Don`t use special characters</small>
			</div>
			<div class="form-group">
                            <label for="lastnameEnter">Lastname</label>
                            <input class="form-control field" type="text" name="lastname" placeholder="lastname">
                            <small class="text-muted">Please, enter your lastname<br>Don`t use special characters</small>
			</div>
                        <div class="d-flex justify-content-center" style="color:red;">
                            <small>${messageSignin}</small>
                        </div>   
                        <div class="form-group">
                            <label for="loginEnter">Login</label>
                            <input class="form-control field" type="text" name="login" placeholder="login">
                            <small class="text-muted">Please, enter login<br>Don`t use special characters</small>
			</div>	
			<div class="form-group">
                            <label for="passwordEnter">Password</label>
                            <input class="form-control field" type="password" name="password" id="passwordEnter" placeholder="password">
                            <small class="text-muted">Please, enter your password<br>Don`t use special characters</small>
			</div>
                        <div class="form-group">
                            <label for="passwordEnter">Confirm password</label>
                            <input class="form-control field" type="password" name="confirmPassword" id="confirmPasswordEnter" placeholder="confirm password">
                            <small class="text-muted">Please, confirm password</small>
			</div>
			<button class="btn btn-success signinBtn" type="submit" name="registersub">Sign in</button>
                    </form>
                </div>
                <div class="col text-center" style="color: #007bff;">
                    <div class="d-flex h-30 justify-content-center mt-4">Join<br>And be with us</div>
                    <div class="d-flex h-80 justify-content-end align-items-center mt-3">
                        <img class="w-80" src="img/start.png">  
                    </div>
                </div>
            </div>              
        </div>
    </div>
    
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.0/js/bootstrap.min.js" integrity="sha384-7aThvCh9TypR7fIc2HV4O/nFMVCBwyIUKL8XCtKE+8xgCgl/PQGuFsvShjr74PBp" crossorigin="anonymous"></script>
    <script src="js/validation.js"></script>
</body>
</html>
