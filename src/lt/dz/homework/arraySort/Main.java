package lt.dz.homework.arraySort;

public class Main {
    public static void main(String[] args) {
        int[] a = {-10,0,2,9,-5};
        int[] b = {-9999999,-9999999,-9999999,-9999999,-9999999};

        for ( int j = 0; j<5;j++){
            for (int i = 0; i < 5; i++) {
                if (a[i] > b[j] && a[i]!=b[0] && a[i]!=b[1] && a[i]!=b[2] && a[i]!=b[3] && a[i]!=b[4]) {
                    b[j] = a[i];
                }
            }
        }
        System.out.println(b[0] +" " + b[1] +" " + b[2] +" " + b[3] +" " + b[4] +" ");
    }
}
