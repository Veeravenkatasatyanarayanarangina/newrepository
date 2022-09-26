
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctor Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<style>
input{
width:200px;
margin:5px;

}
form{

width:50vw;
height:50vh;
}
.abc{
background-color:lightblue;
border:5px solid black;
border-radius:20px;
margin:20px;

}
</style>
<body>
<h1>DoctorLogin</h1>
<div class="m-10 w-75 h-70 rounded-3 border border-5 p-5">
<form action="Doctorlogin" method="post" class="abc" align="center" class="w-50 h-70 rounded-3  border mt-5">
<div class="mb-2 col-sm-7">
    <label for="exampleInputEmail" class="form-label">Email</label>
    <input type="email" class="form-control" name="email" id="exampleInputPassword1">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-2 col-sm-7">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control" name="password" id="exampleInputPassword1">
  </div>
  <input type="submit">
</form>

</div>


</body>
</html>