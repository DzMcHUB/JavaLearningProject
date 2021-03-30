package lt.dz.homework.multiplicationTable;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i +=3) {
            for (int j = 1; j <= 10; j++){
                for (int n = 0; n<3; n++){
                    System.out.print((i+n) + "x" +
                            (j<10?" ":"") + j + " = " +
                            ((i+n)*j<10? " ":"") + (i+n) * j + "   ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
