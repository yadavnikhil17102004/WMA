<!DOCTYPE html>
<html>
<head>
<title>Pan number</title>
</head>
<body>
<h2>PAN number</h2>
<form method="POST" action="index.php">
Enter a pan number:
<input type="text" name="num" required />
<input type="submit" name="check" value="Check" />
</form>

<?php
if(isset($_POST['check'])){
    $num = $_POST['num'];
    $pattern = "/[A-Z]{5}[0-9]{4}[A-Z]{1}/i";

    echo preg_match($pattern, $num);

}
?>

</body>
</html>
