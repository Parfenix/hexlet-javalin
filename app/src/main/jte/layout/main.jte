@import gg.jte.Content
@param Content content

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Мой сайт</title>
</head>
<body>
    <header>
        <h1><a href="/">Главная</a></h1>
        <nav>
            <a href="/courses">Курсы</a>
            <a href="/users">Пользователи</a>
        </nav>
    </header>

    <main>
        ${content}
    </main>

    <footer>
        <p>Посетите мой <a href="https://github.com/Parfenix" target="_blank">GitHub</a></p>
    </footer>
</body>
</html>
