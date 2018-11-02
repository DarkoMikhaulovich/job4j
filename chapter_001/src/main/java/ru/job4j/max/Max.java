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
     * @param first,second,third первое, второе и третье число
     * @return результат нахождения максимума из трех чисел.
     */
    public int max3(int first, int second, int third) {
        int temp = this.max(first ,second);
        int temp = this.max(first ,third);
        int temp = this.max(second ,third);
        return temp;
    }

}

