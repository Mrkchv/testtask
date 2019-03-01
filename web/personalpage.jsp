<html>
<head>
    <title>Test task</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body>
    <nav class="navbar bg-primary">
        <img class="ml-5" width="30" height="30" src="img/Logo.png" alt="logo">
	<div>
            <div class="d-flex justify-content-end">
                <form method="POST" action="logout" class="my-0">
                    <button class="btn text-light" type="submit" name="logutbtn">Log out</button>
                </form>
            </div>
	</div>
    </nav>
    
    <div class="container">
        <div class="row mt-4">
            <div class="col">
                <div class="d-flex justify-content-end">
                    <img src="img/user.png" alt="userimage">
                </div>
            </div>
            <div class="col-7">
                <div class="d-flex mt-4">
                <span class="display-4">${firstname} ${lastname}</span>
                </div>
            </div>
        </div>
    </div>
</body>
</html>