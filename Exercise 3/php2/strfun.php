<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $str1 = $_POST['str1'];
    $str2 = $_POST['str2'];
    $operation = $_POST['operation'];

    if ($operation == "compare") {
        echo "Strings are " . ($str1 == $str2 ? "equal" : "not equal") . "<br>";
    } elseif ($operation == "uppercase") {
        echo "String 1 in uppercase: " . strtoupper($str1) . "<br>";
        echo "String 2 in uppercase: " . strtoupper($str2) . "<br>";
    } elseif ($operation == "lowercase") {
        echo "String 1 in lowercase: " . strtolower($str1) . "<br>";
        echo "String 2 in lowercase: " . strtolower($str2) . "<br>";
    }
}
?>

