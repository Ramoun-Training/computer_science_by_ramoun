<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>php forms</title>
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

        p, input[type="submit"]    {
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
            cursor:pointer;
        }

    
    </style>
</head>

<body>
    <form action="action.php" method="post">
        <p>Your name: <input type="text" name="name" /></p>
        <p>Your age: <input type="text" name="age" /></p>
        <p><input type="submit" /></p>
    </form>

    <!-- When the user fills in this form and hits the submit button, the action.php page is called  -->
</body>

</html>