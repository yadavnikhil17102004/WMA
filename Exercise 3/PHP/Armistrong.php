<!DOCTYPE html>
<html>
<head>
<title>Armstrong Number Checker</title>
</head>
<body>
<h2>Checking if the given number is Armstrong or not...</h2>
<form method="POST" action="index.php">
Enter a number:
<input type="number" name="num" required />
<input type="submit" name="check" value="Check" />
</form>

<?php
if(isset($_POST['check'])){
    $num = $_POST['num'];
    $sum = 0;
    $temp = $num;
    $digits = strlen($num);
    while($temp > 0){
        $digit = $temp % 10;
        $sum += pow($digit, $digits);
        $temp = (int)($temp / 10);
    }
    if($sum == $num){
        echo "<p><b>$num</b> is an Armstrong number</p>";
    }
    else{
        echo "<p><b>$num</b> is not an Armstrong number</p>";
    }
}
?>

</body>
</html>
