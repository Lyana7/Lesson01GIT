public class HomeWorkApp {

    public HomeWorkApp() {
    }
    public static void main(String[] args) {
        printThreeWords("Orange");
        printThreeWords("Banana");
        printThreeWords("Apple");
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords(String fruit) {
        System.out.println(fruit);
    }

    public static void checkSumSign() {
        int a = 75;
        int b = 106;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor() {
        int value = 55;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        int a = 37;
        int b = 111;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }
}

