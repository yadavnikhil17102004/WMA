<!DOCTYPE html>
<html>
<head>
    <title>Encoding String</title>
</head>
<body>
    <h2>Encoding String</h2>
    <form method="POST" action="">
        Enter a String:
        <input type="text" name="string" required />
        <input type="submit" name="check" value="Check" />
    </form>

    <?php
    if (isset($_POST['check']) && isset($_POST['string'])) {
        $string = $_POST['string'];
        $encoded = base64_encode($string);

        echo "Encoded: " . htmlspecialchars($encoded) . "<br>";
        echo "Decoded: " . htmlspecialchars(base64_decode($encoded));
    }
    ?>
</body>
</html>
