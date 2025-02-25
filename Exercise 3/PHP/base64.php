<!DOCTYPE html>
<html>
<head>
<title>Encoding String</title>
</head>
<body>
<h2>Encoding String</h2>
<form method="POST" action="index.php">
Enter a String:
<input type="string" name="string" required />
<input type="submit" name="check" value="Check" />
</form>

<?php
if(isset($_POST['check'])){
    $string = $_POST['string'];
    $encoded = base64_encode($string);

    echo "Encoded :".$encoded."<br>";
    echo "Decoded :".base64_decode($encoded);
}
?>

</body>
</html>
