<?php
if (isset($_POST['submit'])) {
    $num = $_POST['num'];
    $originalNum = $num;  // Store original number for display
    $sum = 0;

    while ($num > 0) {
        $sum += $num % 10;  // Extract last digit and add to sum
        $num = (int)($num / 10);  // Remove last digit
    }

    echo "<h2>Sum of all digits in " . $originalNum . " is: " . $sum . "</h2>";
}
?>

