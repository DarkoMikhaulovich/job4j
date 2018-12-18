package ru.job4j.array;

public class Square {

    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int j;
        for (bound = 0, j = 1; bound != rst.length; bound++, j++) {
            rst[bound] = j * j;
        }
        return rst;
    }

    /* проверка кода
    public static void main(String[] args) {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        //int[] expect = new int[] {1, 4, 9};
        for (bound = 0; bound !=rst.length; bound++)
            System.out.println(rst[bound]);
        }
    */
}
