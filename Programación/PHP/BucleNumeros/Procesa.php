<?php
        $i = $_POST['campo1'];
        $k = $i;
        $j = $_POST['campo2'];
        echo 'Pares'."<br />";
        for ($i; $i <= $j; $i++) {
            if (($i%2) == 0) {
                echo $i, ' '."<br />";
            }
        }
        echo "<br />".'Impares'. "<br />";
        for ($k; $k <= $j; $k++){
            if (($k%2)!= 0){
                echo $k, ' '."<br />";
            }
        }
?>
