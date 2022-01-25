package Lesson03.HW03;

public class Array {


    public static void main(String[] args) {
        arrayOneSize();
        System.out.println();
        System.out.println("********");
        emptyArray();
        System.out.println();
        System.out.println("********");
        arraySixTimes();
        System.out.println();
        System.out.println("********");
        arrayTwoSize();
        System.out.println();
        System.out.println("********");
        arrayReturn(20, 19);

    }

    public static void arrayOneSize() {
        int[] array = new int[6];
        array[0] = 1;
        array[1] = 1;
        array[2] = 0;
        array[3] = 0;
        array[4] = 0;
        array[5] = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else array[i] = 0;
            System.out.print(array[i] + " | ");
        }
    }

    public static void emptyArray() {
        int[] myArrayEmpty = new int[100];
        for (int i = 0; i < myArrayEmpty.length; i++) {
            myArrayEmpty[i] = i + 1;
            System.out.print(myArrayEmpty[i] + " | ");
        }
    }

    public static void arraySixTimes() {
        int[] arrayInt = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] < 6) {
                arrayInt[i] *= 2;
                System.out.println(arrayInt[i]);
            }
        }


    }

    public static void arrayTwoSize() {
        int[][] arraySquare = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == j) {
                    arraySquare[i][j] = 1;
                }
                System.out.print(arraySquare[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] arrayReturn (int len, int initialValue) {
        int[] myArrayR = new int[len];
        for (int i = 0; i < myArrayR.length; i++) {
            myArrayR[i] = initialValue;
            System.out.print(myArrayR[i] + " ");
        }
        return myArrayR;
    }

}

