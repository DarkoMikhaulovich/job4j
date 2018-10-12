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
        /*int result;
        result = (first > second) ? first : second;
        return result;
        */
        return(first > second) ? first: second;
    }
}
