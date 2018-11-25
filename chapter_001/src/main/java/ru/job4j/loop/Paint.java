package ru.job4j.loop;

/**
 Построение пирамиды в псевдографике
 */

public class Paint {
    /**
     * Функция построения правой части пирамиды в псевдографике с заданной высотой.
     * @param height - высота.
     * @return - результат вывода строк по параметру height
     */
    public String rightTrl(int height) {
        StringBuilder screen = new StringBuilder();
        // ширина равна высоте.
        int weight = height;
        // внешний цикл двигается по строкам.
        for (int row = 0; row != height; row++) {
            // внутренний цикл определяет положение ячейки в строке.
            for (int column = 0; column != weight; column++) {
                // если строка равна ячейки, то рисуется галка.
                // определяется сколько галок будет на строке
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // перевод строки.
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
    /**
     * Функция построения левой части пирамиды в псевдографике с заданной высотой.
     * @param height - высота.
     * @return - результат вывода строк по параметру height
     */

    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= weight - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
    /**
     * Функция построения полной пирамиды в псевдографике с заданной высотой.
     * @param height - высота.
     * @return - результат вывода строк по параметру height
     */

    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
