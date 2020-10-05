<!doctype html>
<html>
<head>
    <title>Home</title>
</head>
<body>

<h1>Welcome to jsp powered page     <%=request.getAttribute("myName")%></h1>

<h3>Time now: <%=new java.util.Date()%> </h3>

</body>
</html>