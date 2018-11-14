package ru.job4j.loop;

/**
 Вычисление факториала заданного числа
 */
public class Factorial {

    /**
     * Функция вычисления факториала заданного числа.
     * @param n - число для вычисления факториала.
     * @return факториал заданного числа n.
     */

    public int calc(int n) {
        int f = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                f = f * i;
            }
        }
        return f;
    }
    /* Проверка кода

    public static void main (String[] args) {
        Factorial myFactorial = new Factorial();
        int result = myFactorial.calc(0);
        System.out.println(result);
    }
    */
}
