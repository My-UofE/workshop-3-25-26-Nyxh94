public class PrintPattern2 {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);

        if (size > 5) {
            System.out.println("too big!");
        } else if (size < 1) {
            System.out.println("too small!");
        } else {
            for (int i = 1; i <= size; i++) {
                for (int j = i; j < i + size; j++) {
                    System.out.print(j);
                }
                for (int j = i + size - 1; j >= i; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
            for (int i = size; i >= 1; i--) {
                for (int j = i; j < i + size; j++) {
                    System.out.print(j);
                }
                for (int j = i + size - 1; j >= i; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}