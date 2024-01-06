public class Logic_circuit{
    public static void main(String[] args) {

        boolean A = true;
        boolean B = false;
        boolean C = true;

        boolean Output = (A && B) || (C && !A);

        System.out.println("The Output: " + Output);
    }
}
