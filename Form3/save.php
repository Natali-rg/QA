<?php
$opt=[
    PDO::ATTR_ERRMODE=>PDO::ERRMODE_EXCEPTION,
    PDO::ATTR_DEFAULT_FETCH_MODE=>PDO::FETCH_ASSOC
];
$pdo=new PDO("mysql:host=localhost;dbname=anceta","root", "root", $opt);


var_dump($_POST);

