*Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
Соблюдать принципы SOLID, паттерны проектирования.*


При создании программы использовался паттерн Model – View – Presenter.
В package complex создан класс ComplexNumber‚ который представляет комплексное число.
В этом классе определены две переменные : реальная и мнимая части комплексного числа.
Добавлены геттеры и переопределен метод toString(). Методы для сложения‚ вычитания, умножения
и деления комплексных чисел находятся в package complexoperations (Model). Все они implements от
интерфейса Operations, как мы делали на семинаре. На каждую операцию  своя стратегия. 
Предобработка данных с консоли вынесена в package complex (Presenter). 
Клиентское меню находится в package menu(View). 
Добавлена проверка на правильность ввода пункта меню и логгирование.