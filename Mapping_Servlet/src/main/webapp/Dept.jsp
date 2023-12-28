<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Department</title>
</head>
<body>
	<form action="<%= request.getContextPath() %>/dept" method="post">

		enter the did: <input type="number" name="did"> <br>
		enter the dname: <input type="text" name="dname"> <br>
		enter the loc: <input type="text" name="loc"> <br> 
		<input type="submit">

	</form>

</body>
</html>