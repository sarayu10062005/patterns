public class TriDown {
    public static void main(String[] args) {
        int size = 8;
        for (int i = size; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("X ");
            }
            if (i != 1) {
            System.out.println();
            }
        }
    }
}
