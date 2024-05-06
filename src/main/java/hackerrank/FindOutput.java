package hackerrank;

public class FindOutput {

    public static void main(String[] args) {
        divide(4, 0);
    }

    public static int divide(int a, int b) {
        int c = -1;

        try {
            c = a / b;
        } catch (Exception e) {
            System.err.print("Exception ");
        } finally {
            System.err.print("Finally ");
        }
        return c;
    }
}
