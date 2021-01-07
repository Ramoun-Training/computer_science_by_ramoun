<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;

            height: 95vh;
        }

        form {
            display: flex;
            flex-direction: column;
            justify-content: stretch;
            align-items: stretch;

            /* background-color: crimson; */
            border: 10px solid crimson;
            width: 50%;
            margin: 0 auto;
            padding: 0 20px;
        }

        p {
            display: flex;
        }

        p,
        input[type="submit"] {
            font-family: 'Courier New', Courier, monospace;
            font-weight: bolder;
            font-size: 40px;
        }

        input {
            flex: 1;
            margin-left: 10px;
        }

        input[type="text"] {
            font-size: 20px;
        }

        input[type="submit"]:hover {
            cursor: pointer;
        }
    </style>
</head>

<body>
    <form action="forms.php" method="GET">
        <p>Hi <?php echo htmlspecialchars($_POST['name']); ?>.</p>
        <p>You are <?php echo (int)$_POST['age']; ?> years old.</p>
        <!-- <p><input onclick="back()" type="button" value="back"/></p> -->
        <p><input type="submit" value="back"/></p>
        for more about forms in php visit <a href="https://www.php.net/manual/en/tutorial.forms.php">this link</a>
    </form>
    <script>
        function back() {
            window.location.href = "forms.php";
        }
    </script>
    <!-- 
        htmlspecialchars: makes sure any characters that are special in html are properly encoded so people can't inject HTML tags or Javascript into your page. 
        (int): casting to int, also can be done using filter extension
        $_POST: since we used in the html form (post) -> the $_POST superglobal contains all the post request data
        $_REQUEST: can be used if you don't care about the source of the data either $_GET or $_POST or cookie

     -->
</body>

</html>