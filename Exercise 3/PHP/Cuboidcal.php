
<html>
<body>

<?php
if (isset($_POST['check'])) {
    $l = $_POST['length'];
    $b = $_POST['bredth'];
    $h = $_POST['height'];

    echo "<h1>surface area: ".(2*(($l*$b)+($l*$h)+($b*$h)))." !!</h1>";
    echo "<h1>Volumn: ".($l*$b*$h)." !!</h1>";
}
?>
</body>
</html>
