<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctor Register</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h1 align="center" margin="30px">welcome to maxhospital</h1>
<h3>Doctor Registration</h3>
<h5>if you already have an account click this <a href="Doctorlogin.html">DoctorLogin</a></h2>
<div class="ml-10 w-75 h-70 rounded-3 border border-5 p-5" align="center">

<form class="w-50 h-70 rounded-3  border mt-5"  action="DoctorRegister" method="get">
  <div class="mb-2 col-sm-7">
    <label for="exampleInputName" class="form-label">Name</label>
    <input type="text" class="form-control" name="name" id="exampleInputEmail1" aria-describedby="emailHelp">
    
  </div>
  <div class="mb-2 col-sm-7">
    <label for="exampleInputEmail" class="form-label">Email</label>
    <input type="email" class="form-control" name="email" id="exampleInputPassword1">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-2 col-sm-7">
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
  <div class="col-md-7">
  <select class="form-select col-md-4" aria-label="Default select example" name="specialist">
  <option selected>Open this select menu</option>
 <option value="ENT">ENT</option>
<option value="Heart">Heart</option>
<option value="Dentist">Dentist</option>
<option value="Eye">Eye</option>
<option value="Kidney">Kidney</option>
<option value="Cardio">Cardio</option>
 
  
</select>
 </div>
<input type="submit" class="btn btn-primary" value="register">
</form>




</div>


</body>
</html>