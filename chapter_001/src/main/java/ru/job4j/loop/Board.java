package ru.job4j.loop;

/**
 Построение шахматной доски в псевдографике
 */

public class Board {
    /**
     * Функция построения шахматной доски в псевдографике с заданными высотой или длиной.
     * @param width - ширина доски.
     * @param height - высота.
     * @return - результат вывода строк по параметрам width и height
     */

    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int n = 0; n < width; n++) {
                // Условие при котором выводится Х, иначе пробел
                if ((i + n) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }

    /*Проверка кода
    public static void main (String[] args) {
        Board board = new Board();
        String result = board.paint(3, 3);
        System.out.println(result);
    }
    */
}
