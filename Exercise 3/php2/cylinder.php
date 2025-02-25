<?php
function calculateCylinder($radius, $height) {
    $area = 2 * pi() * $radius * ($radius + $height);
    $volume = pi() * $radius * $radius * $height;
    return array($area, $volume);
}

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $radius = $_POST['radius'];
    $height = $_POST['height'];
    list($area, $volume) = calculateCylinder($radius, $height);

    echo "<h2>Cylinder Details:</h2>";
    echo "Surface Area: " . $area . "<br>";
    echo "Volume: " . $volume . "<br>";
}
?>

