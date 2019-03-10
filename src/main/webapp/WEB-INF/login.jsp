
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logowanie</title>
</head>

<body>
<form action="/login-process" method="post">
    <div class="form-group">
        <label for="email">Email address:</label>
        <input name ="email" type="email" class="form-control" id="email">
    </div>
    <div class="form-group">
        <label for="pwd">Password:</label>
        <input name="password" type="password" class="password" id="pwd">
    </div>
    <div class="checkbox">
        <label><input type="checkbox"> Remember me</label>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>

    <a class="btn btn-primary" href="/register" role="button">Register</a>
</form>

</body>
</html>

<%--//login i password--%>