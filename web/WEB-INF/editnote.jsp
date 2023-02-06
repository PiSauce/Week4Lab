<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note - Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form action="note" method="post">
            <b>Title:</b><input type="text" name="title"></br>
            <b>Contents:</b><input type="text" name="content"></br>
            <input type="submit" value="Save">
        </form>
    </body>
</html>
