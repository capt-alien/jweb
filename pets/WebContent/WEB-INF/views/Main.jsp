<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pets-R-Us</title>
</head>
<body>
<h1>Welcome to Pets-R-Us</h1>

<h2>Make a dog!</h2>
<form action="/PetsRus/DisplayDog" method="post">
	Name: <input type="text" name="name"><br>
	Breed: <input type="text" name="breed"><br>
	Weight (lb): <input type="number" name="weight"><br>
	<input type="submit">
</form>
<h2>Make a cat!</h2>
<form action="/PetsRus/DisplayCat" method="post">
	Name: <input type="text" name="name"><br>
	Breed: <input type="text" name="breed"><br>
	Weight (lb): <input type="number" name="weight"><br>
	<input type="submit">
</form> 
</body>
</html>