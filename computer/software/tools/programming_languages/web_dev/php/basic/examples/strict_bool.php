<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>strict_bool</title>
</head>
<body>
Since I haven't seen it posted.
Here is a function that you can use if you have a need to force strict boolean values.
Hopefully this will save someone some time from searching for similar.
<?php
function strictBool($val=false){
    return is_integer($val)?false:$val == 1;
}
?>

Simply put, it verifies that the value passed is (bool)true otherwise it's false.

Examples:
__________________________________
<?php
$myBool = strictBool(true);
var_dump($myBool);
//returns (bool)true

$myar = array(0 => true);
$myBool = strictBool($myar[0]);
var_dump($myBool);
//returns (bool)true

$myBool = strictBool("hello");
var_dump($myBool);
//returns (bool)false

$myBool = strictBool(false);
var_dump($myBool);
//returns (bool)false

$myBool = strictBool(array(0 => "hello"));
var_dump($myBool);
//returns (bool)false

$myBool = strictBool(1);
var_dump($myBool);
//returns (bool)false

$myBool = strictBool();
var_dump($myBool);
//returns (bool)false
?>
</body>
</html>