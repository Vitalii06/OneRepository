Написать автоматические тесты, покрывающие следующие кейсы:

Кейс 1 Разница двух целых чисел

Открыть сайт https://testsheepnz.github.io/BasicCalculator.html
Проскроллить вниз до конца
Выбрать сборку (Build) «Prototype»
Ввести в поле First number значение «2»
Ввести в поле Second number значение «3»
Выбрать операцию (Operation) «Subtract»
Нажать на кнопку «Calculate»
Проверить, что в поле ответа (Answer) значение равно «-1»

Кейс 2 Конкатенация двух строк

Открыть сайт https://testsheepnz.github.io/BasicCalculator.html
Проскроллить вниз до конца
Выбрать сборку (Build) «Prototype»
Ввести в поле First number значение «gs»
Ввести в поле Second number значение «bu»
Выбрать операцию (Operation) «Concatenate»
Нажать на кнопку «Calculate»
Проверить, что в поле ответа (Answer) значение равно «gsbu»

Кейс 3 Появление сообщения при вводе строки в поле

Открыть сайт https://testsheepnz.github.io/random-number.html
Проскроллить вниз до конца
Выбрать сборку (Select Build) «Demo»
Нажать на кнопку «Roll the dice»
Ввести в поле значение «string»
Нажать на кнопку «Submit»
Проверить, что появилось сообщение «string: Not a number!»

Структура проекта

WebDriverSettings - содержит операции, которые выполняются перед тестами и после тестов. Инициализация WedDriver.
FirstTest - содержит тест "Разница двух целых чисел".
SecondTest - содержит тест "Конкатенация двух строк".
ThirdTest - содержит тест "Появление сообщения при вводе строки в поле".

Запуск тестов

Ввести в командной строке Windows:

mvn clean test