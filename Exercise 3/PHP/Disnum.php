<!DOCTYPE html>
<html>
<head>
<title>Display number</title>
</head>
<body>
<h2>Displaying number</h2>
<form method="POST" action="index.php">
Enter a number:
<input type="number" name="num" required />
<input type="submit" name="check" value="Check" />
</form>

<?php
if(isset($_POST['check'])){
    $num = $_POST['num'];
    $digits = str_split($num);

    $words = [ "0" => "zero", "1" => "one" , "2" => "two" , "3" => "three" , "4" => "four" ];

    echo "<h3>number in words is:<h3>";
    foreach($digits as $digit){
        echo $words[$digit]." ";
    }

}
?>

</body>
</html>
