<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>data types</title>

    <style>
        body {
            font-family: Helvetica, "Fira Code";
        }
    </style>
</head>

<body>
    <?php
        $a_bool = TRUE;   // a boolean
        $a_str  = "foo";  // a string
        $a_str2 = 'foo';  // a string
        $an_int = 12;     // an integer
    ?>
      
    <h2><code>var_dump()</code></h2>

    <?php
        echo var_dump($a_bool);
        echo "<br>";
        echo var_dump($a_str);
        echo "<br>";
        echo var_dump($a_str2);
        echo "<br>";
        echo var_dump($an_int);
        echo "<br>";
    ?>

    <h2><code>gettype()</code></h2>
    
    <?php
        echo gettype($a_bool);
        echo "<br>";
        echo gettype($a_str);
        echo "<br>";
        echo gettype($a_str2);
        echo "<br>";
        echo gettype($an_int);
        echo "<br>";
    ?>

    <h2><code>is_type()</code></h2>
    
    <?php
        echo settype(is_bool($a_bool), "bool");
        echo "<br>";
        echo is_string($a_str);
        echo "<br>";
        echo is_string($a_str2);
        echo "<br>";
        echo is_int($an_int);
        echo "<br>";
    ?>
</body>

</html>