<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $name = $_POST['name'];
    $city = $_POST['city'];
    $os = $_POST['os'];
    $gender = $_POST['gender'];

    echo "<h2>Information Submitted:</h2>";
    echo "Name: " . $name . "<br>";
    echo "City: " . $city . "<br>";
    echo "Operating System: " . $os . "<br>";
    echo "Gender: " . $gender . "<br>";
}
?>

