<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Form2</title>
    <link href="css/Style.css" rel="stylesheet">
    <script src="JS/jquery-1.8.3.min.js" type="text/javascript"></script>
    <script src="JS/jquery.maskedinput.js" type="text/javascript"></script>
    <script>
        jQuery(function($) {
            $("#credit").mask("9999-9999-9999-9999");
            $("#phone").mask("+99(999) 999-99-99");
        });
    </script>
</head>
<body>

<form method="post" action="save.php">
    <ul>
        <li><h2>Заполните анкету<span><sup>*-поле обязательное для заполнения</sup></span></h2></li>
        <li><label for="name">Ваше Имя и Фамилия</label>
            <input type="text" name="name" id="name" placeholder="Иванов Иван Иванович" maxlength="40"
                   required pattern="[А-Я][а-я]+\s[А-Я][а-я]+">
            <span class="form_hint">Пример ввода: Иванов Иван </span>
        </li>
        <li><label for="login">Введите логин для сайта (на английском):</label>
            <input type="text" name="login" id="login" placeholder="Admin" maxlength="20"
                   required pattern="\w+">
            <span class="form_hint">Пример ввода: Admin </span>
        </li>
        <li><label for="m">Кто вы:</label>
            <input type="radio" name="sex" id="m" required value="m">М
            <input type="radio" name="sex" id="z" required value="z">Ж
        </li>
        <li><label for="dat">Введити дату рождения</label>
            <input type="date" name="dat" id="dat" required>
        </li>
        <li><label for="email">Email:</label>
            <input type="email" name="email" id="email" placeholder="turchyna@ukr.net" maxlength="40"
                   required pattern="\w+@\w+\.\w+">
            <span class="form_hint">Пример ввода: turchyna.natali@gmail.com </span>
        </li>
        <li><label for="ws">Website(url):</label>
            <input type="text" name="Website" id="ws" placeholder="http://www.my-site.com" maxlength="50"
                   required pattern="\w+...\w+.\w+.\w+.\w+">
            <span class="form_hint">Пример ввода: http://www.my-site.com </span>
        </li>
        <li><label for="credit">Кредитная карта:</label>
            <input type="text" name="credit" id="credit" placeholder="1234-1234-1234-1234" maxlength="19"
                   required pattern="\d{4}-\d{4}-\d{4}-\d{4}">
            <span class="form_hint">Пример ввода: 1234-1234-1234-1234 </span>
        </li>
        <li><label for="phone">Телефон:</label>
            <input type="text" name="phone" id="phone" placeholder="" maxlength="18"
                   required pattern="\+\d{2}.\d{3}..\d{3}.\d{2}.\d{2}">
            <span class="form_hint">Пример ввода: +38(098) 545-54-54 </span>
        </li>
        <li>
            <label for="mas">Сообщение</label>
            <textarea rows="5" cols="50" name="mas" id="mas"
                      placeholder="Введите своё сообщение..."></textarea>
        </li>
        <li>
            <input type="submit" name="send" value="Отправить">
        </li>
    </ul>
</form>
</body>
</html>