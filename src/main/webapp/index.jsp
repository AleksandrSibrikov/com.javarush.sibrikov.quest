<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Quest Game</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<section class="margin-top-large">

        <div class="text-primary ">
            <div class="col-12">
                <h1 class="fw-bolder" >Пролог</h1>
                <h3></h3>
                <h3 class="fw-bolder">Ты стоишь в космическом порту и готов подняться </h3>
                <h3 class="fw-bolder">на борт своего корабля. Разве ты не об этом мечтал? </h3>
                <h3 class="fw-bolder">Стать капитаном галактического судна с экипажем,</h3>
                <h3 class="fw-bolder">который будет совершать подвиги под твоим командованием.</h3>
                <h3 class="fw-bolder">   Когда ты поднялся на борт корабля, тебя поприветствовала</h3>
                <h3 class="fw-bolder">девушка с черной папкой в руках:</h3>
                <h3 class="fw-bolder">   -Здравствуйте, командир! Я Зинаида – ваша помощница. </h3>
                <h3 class="fw-bolder">Видите? Там в углу пьет кофе штурман – сержант Перегарный Шлейф,</h3>
                <h3 class="fw-bolder">под штурвалом спит наш борт механик Вечный Пьян, а фотографирует</h3>
                <h3 class="fw-bolder">его Навигаторович Шустр – наш навигатор.</h3>
                <div class="bg-primary p-1 "></div>
            </div>

        </div>

</section>

<section>
    <div class="container ">
        <div>
            <br>
        </div>
        <form action="gameServlet" method="post" class="row">
            <div class="col-4"></div>
            <div class="col-4">
                <input type="text" name="firstName" class="form-control" placeholder="Введите ваше имя">
            </div>
            <div class="col-4"></div>
            <div>
                <br>
            </div>

            <div class="col-4"></div>
            <div class="col-4 d-grid gap-2 mx-auto">
                <button class="btn btn-primary" type="submit">Начать игру</button>
            </div>
            <div class="col-4"></div>

        </form>
    </div>
</section>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
