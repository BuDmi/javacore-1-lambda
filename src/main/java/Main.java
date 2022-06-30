public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1,2);
        int b = calc.minus.apply(1,1);
        // Проблема была при вызове calc.divide.apply. Переменная b получается равной 0, отсюда получается деление на 0
        // Соответственно здесь требуется проверка на 0 в знаменателе
        // 2 варианта решения проблемы:
        // 1. Использовать доработанный divide, с проверкой знаменателя на 0
        // 2. Использовать старый divide, но строчку 5 заменить, например, на calc.minus.apply(2,1)
        // 3. Применить оба верхних варианта
        int c = calc.divide.apply(a, b);
        calc.println.accept(c);
    }
}
