<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>

<style>
body{
    font-family: Arial;
    background-color: #f2f2f2;
}

.container{
    width: 400px;
    margin: auto;
    margin-top: 100px;
    background: white;
    padding: 20px;
    border-radius: 5px;
}

input, textarea{
    width: 100%;
    padding: 8px;
    margin: 10px 0;
}

button{
    background-color: green;
    color: white;
    padding: 10px;
    border: none;
    width: 100%;
}
</style>

</head>
<body>

<div class="container">

<h2>Sign Up</h2>


<form action="${pageContext.request.contextPath}/createUser" method="post">

<label>Username</label>
<input type="text" name="username" required>

<label>Department</label>
<input type="text" name="department" required>

<label>Address</label>
<textarea name="address" required></textarea>

<button type="submit">Register</button>

</form>

</div>

</body>
</html> 