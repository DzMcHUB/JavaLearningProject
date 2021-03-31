package lt.dz.homework.arraySort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {-10, 0, 2, 9, -5};

        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length; i++) {
                if (a[j] > a[i]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
