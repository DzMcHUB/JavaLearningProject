package lt.dz.homework.triangleArea;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Įveskite trikampio kraštinų ilgius");

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        System.out.println("Pirmos kraštinės ilgis "+a);
        double b = in.nextDouble();
        System.out.println("Antros kraštinės ilgis "+b);
        double c = in.nextDouble();
        System.out.println("Trečios kraštinės ilgis "+c);

        double p = (a+b+c)/2;
        double S=Math.sqrt(p*(p-a)*(p-b)*(p-c));

        if (a+b>c && a+c>b && b+c>a){
            if(a==b && b==c){
                System.out.println("\n" + "Lygiakraštis trikampis");
            } else if (a==b || a==c || b==c) {
                System.out.println("\n" + "Lygiašonis trikampis");
            } else {
                System.out.println("\n" + "Įvairiašonis trikampis");
            }
            System.out.println("Plotas = "+S);
        }else {
            System.out.println("\n" + "Ne trikampis");
        }
    }
}
