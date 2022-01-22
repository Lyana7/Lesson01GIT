package Lesson02;

public class HomeWork02 {

    public HomeWork02() {
    }

    public static void main(String[] args) {
        System.out.println("#1");
        System.out.println(in10and20(5, 18));
        System.out.println(in10and20(5, 10));

        System.out.println("#2");
        printNumber(-9);
        printNumber(33);

        System.out.println("#3");
        System.out.println(trueOrFalse(-4));
        System.out.println(trueOrFalse(97));

        System.out.println("#4");
        printWord ("Word");


    }

    public static boolean in10and20(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void printNumber(int c) {
        if (c >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean trueOrFalse(int c) {
        if (c < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printWord(String word) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Word ");
        }
    }
}
