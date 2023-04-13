import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int[] check = new int[]{1, 2, 3, 4, 5, 3, 6, 7, 8, 1, 3};
//        for (int i = 0; i < check.length; i++) {
//            //  System.out.println(i);
//
//
//            for (int j = i + 1; j < check.length; j++) {
//                if (check[j] == check[i]) {
//                    System.out.println("fskvif");
//                }
//            }
//
//
//        }
//        int counter = 0;
//        int[] res = new int[]{0, 2, 4, 5, 6, 6, 7, 8, 9, 1,};
//        for (int r = 0; r < res.length; r++) {
//            for (int t = r + 1; t < res.length; t++) {
//                if (res[t] == res[r]) {
//                    counter++;
//                }
//            }
//        }
//        System.out.println(" количество одинаковых пар" + counter);

        Random random = new Random();
        int[] sum = new int[35];
        int max = 0;
        int indexOf = 0;
        int a;
        for (int i = 0; i < sum.length; i++) {
            sum[i] = random.nextInt(50);
            if (sum[i] > max){
                max = sum[i];
                indexOf = i;
            }
        }
//        System.out.println(Arrays.toString(sum));
//        a = sum[indexOf];
//        sum[0] = sum[indexOf];
//        sum[indexOf] = a;
//        System.out.println(Arrays.toString(sum));
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i]+" ");
        }
        System.out.println();
        a = sum[indexOf];
        sum[0] = sum[indexOf];
        sum[indexOf] = a;

        int[] res = new int[sum.length];

        for (int i = 0; i < res.length; i++) {
            System.out.print(sum[i]+" ");
        }
    }

}