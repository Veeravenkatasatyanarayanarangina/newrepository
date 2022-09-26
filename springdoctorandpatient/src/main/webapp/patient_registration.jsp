<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<h1>Patient Register</h1>

<!-- <form action="PatientRegister" method="get">

<label>name</label><br>
<input type="text" name="name">
<br>
<label>email</label>
<input type="email" name="email">
<br>
<label>password</label>
<input type="password" name="password">
<br>
<label>phone</label>
<input type="text" name="phone">
<br>

<input type="submit">

</form>
 -->
 
<h3>Patient Registration</h3>
<div class="ml-10 w-75 h-70 rounded-3 border border-5 p-5" align="center">

<form class="w-50 h-75 rounded-3  border mt-5"  action="PatientRegister" method="get">
  <div class="mb-2 col-sm-7">
    <label for="exampleInputName" class="form-label">Name</label>
    <input type="text" class="form-control" name="name" id="exampleInputEmail1" aria-describedby="emailHelp">
    
  </div>
  <div class="mb-3 col-sm-7">
    <label for="exampleInputEmail" class="form-label">Email</label>
    <input type="email" class="form-control" name="email" id="exampleInputPassword1">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3 col-sm-7">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control" name="password" id="exampleInputPassword1">
  </div>
  <div class="mb-2 col-sm-7">
    <label for="exampleInputPhone" class="form-label">Phone</label>
    <input type="number" class="form-control" name="phone" id="exampleInputPassword1">
  </div>
  <div class="mb-2 form-check col-sm-7">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>

<input type="submit" class="btn btn-primary" value="register">
</form>


<a href="patientlogin.html">PatientLogin</a>

</div>

</body>
</html>