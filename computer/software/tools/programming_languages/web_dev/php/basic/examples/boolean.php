<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Boolean</title>
</head>
<body>
    <?php
        echo var_dump((bool) "");        // bool(false)
        echo "<br>";

        echo var_dump((bool) 1);         // bool(true)
        echo "<br>";

        echo var_dump((bool) -2);        // bool(true)
        echo "<br>";

        echo var_dump((bool) "foo");     // bool(true)
        echo "<br>";

        echo var_dump((bool) 2.3e5);     // bool(true)
        echo "<br>";

        echo var_dump((bool) array(12)); // bool(true)
        echo "<br>";

        echo var_dump((bool) array());   // bool(false)
        echo "<br>";

        echo var_dump((bool) "false");   // bool(true)
        echo "<br>";
       
        echo "<hr>";

        echo var_dump((bool) "0");
        echo "<br>";

        echo "<hr>";

        $x = TRUE;
        $y = FALSE;

        $z=$y OR $x; // true

        echo var_dump($z);

        echo "<hr>";

        echo var_dump(0 == (bool)'all');
        echo "<br>";
        echo var_dump(0 == "all"); // man, this is hilarious
        echo "<br>";
        echo var_dump((string)0 == 'all');        
        ?>
        <hr>
        <?= (boolean)0 ?>
        <?= (boolean)1 ?>
        <hr>
        <?= true+true #2 ?> <!--conversion to int is done due to using the + operator-->
</body>
</html>