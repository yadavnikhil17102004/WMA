<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $email = $_POST['email'];

    // Regular expression for validating email
    $pattern = "/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/";

    if (preg_match($pattern, $email)) {
        echo "<h2>✔ Valid Email: $email</h2>";
    } else {
        echo "<h2>✖ Invalid Email: $email</h2>";
    }
}
?>

