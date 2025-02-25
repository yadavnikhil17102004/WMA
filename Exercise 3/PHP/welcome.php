
<html>
<body>

<?php
if (isset($_POST['check'])) {
    $num = $_POST['username'];
    echo "<h1>Hello, ". $num ."!!</h1>";
}
?>
</body>
</html>
