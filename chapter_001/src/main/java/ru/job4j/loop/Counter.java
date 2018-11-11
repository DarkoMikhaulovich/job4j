package ru.job4j.loop;

/**
 * Подсчет суммы чётных чисел в заданном диапазоне
 */

public class Counter {

    /**
     * Функция подсчета суммы четных чисел заданного дипазона.
     * @param start, finish - числа начала и конеца диапазона
     * @return результат суммы четных чисел заданного дипазона.
     */

    public int add(int start, int finish) {
        int i = 0, n;
        for (n = start; n <= finish; n++) {
            if (n % 2 == 0) {
                i = i + n;
            }
        }
        return i;
    }

    /* Проверка кода
    public static void main (String[] args) {
        Counter myCounter = new Counter();
        int result = myCounter.add(1, 10);
        System.out.println(result);
    }
    */
}
