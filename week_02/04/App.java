public class App {
    public static void main(String[] args) {
        final int N = 10;
        triangleOne(N);
        System.out.println();
        triangleTwo(N);
        System.out.println();
        triangleThree(N);
        System.out.println();
        diamond(N);
    }

    public static void triangleOne(int rows) {
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangleTwo(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangleThree(int rows) {
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < (rows - i); j++) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamond(int rows) {
        int halfRows = rows / 2;
        for (int i = 0; i < halfRows; i++) {
            for (int j = 0; j < halfRows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = halfRows; i >= 0; i--) {
            for (int j = 0; j < halfRows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}