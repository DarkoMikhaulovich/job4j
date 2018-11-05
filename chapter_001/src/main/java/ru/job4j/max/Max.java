package ru.job4j.max;

/**
 * Нахождение максимума из двух чисел
 */
public class Max {
    /**
     * Функция максимума из двух чисел.
     * @param first,second первое и второе число
     * @return результат нахождения максимума.
     */
    public int max(int first, int second) {
        int result;
        result = (first > second) ? first : second;
        return result;
    }

    /**
     * Функция максимума из двух чисел.
     * @param first, second, third первое, второе и третье число
     * @return результат нахождения максимума из трех чисел.
     */
    public int max(int first, int second, int third) {
         int temp;
         temp = this.max(first, second);
         temp = this.max(third, temp);
        return temp;
    }

    /*Проверка кода
    public static void main(String[] args) {
        Max maxim = new Max();
        int result = maxim.max(5,4,10);
        System.out.println(result);
    }
    */

}

