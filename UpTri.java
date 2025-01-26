public class UpTri {
    public static void main(String[] args) {
        int size = 10;
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}