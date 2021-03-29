package lt.dz.homework.project02;

public class chessProblem {

    public static void main(String[] args) {
        for (int i = 1; i <= 64; i++) {
            int j = (int) Math.pow(2,i-1);
            System.out.println("Ant " + i + " langelio " + ("padėti "+ j + " grūdus"));
        }
    }
}
