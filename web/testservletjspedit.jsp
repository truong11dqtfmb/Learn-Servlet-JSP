<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Test Servlet JSP!</h1>

        <form action="listtestservletjsp" method="post">
            <input type="text" name="name" placeholder="Name........."><br>
            <input type="number" name="quantity" placeholder="Quantity........."><br>
            <input type="text" name="image" placeholder="Image........."><br>
            <input type="number" name="status" placeholder="Status........."><br>
            <input type="text" name="des" placeholder="Describe........."><br>
            <input type="text" name="dateadd" placeholder="Dateadd........."><br>
            <button type="submit">Add</button>
        </form>

</body>
</html>
