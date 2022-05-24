public class MultiplicationTable_02 {
    public static void main(String[] args) {
        for (int firts = 1; firts <= 10; firts++) {
            for (int second = 1; second <= 10 ; second++) {
                int product = firts * second;
                System.out.println(firts + " * " + second + " = " + product);
            }
        }
    }
}
