public class App {
    public static void main(String[] args) {
        int start = 32;
        int end = 126;

        for (int i = start; i <= end; i++) {
            System.out.print(i + "='" + (char) i + "'\t");

            if (((i+1)-start) % 5 == 0) {
                System.out.println();
            }
        }

    }
}