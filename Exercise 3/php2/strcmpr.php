<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $bigString = $_POST['bigString'];
    $smallString = $_POST['smallString'];

    echo "<h2>String Comparison Results</h2>";

    // Check if the small string appears at the start of the big string
    if (strpos($bigString, $smallString) === 0) {
        echo "✔ The small string appears at the start of the big string.<br>";
    } else {
        echo "✖ The small string does not appear at the start.<br>";
    }

    // Find the position of the small string in the big string
    $position = strpos($bigString, $smallString);
    if ($position !== false) {
        echo "✔ The small string is found at position: " . $position . "<br>";
    } else {
        echo "✖ The small string is not found in the big string.<br>";
    }

    // Compare both strings (case-sensitive)
    if ($bigString === $smallString) {
        echo "✔ Both strings are exactly the same.<br>";
    } else {
        echo "✖ The strings are different.<br>";
    }
}
?>

