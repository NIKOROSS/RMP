import java.util.Scanner;
import java.util.Arrays;
public class matrix {
    public static void main(String[] args) {

        var nomer = new Scanner(System.in);

        System.out.print("Введите номер задания: ");
        int k = nomer.nextInt();

        if (k == 59) {
            int m, n;
            System.out.println("Введие m и n:");
            m = nomer.nextInt();
            n = nomer.nextInt();
            int[][] a = new int[m][n];
            for (int i = 0; i < a.length; i++)
                for (int j = 0; j < a[i].length; j++)
                    a[i][j] = (int) (Math.random() * 10);


            for (int i = 0; i < a.length; i++, System.out.println())
                for (int j = 0; j < a[i].length; j++)
                    System.out.print(a[i][j] + " ");


            for (int i = 0; i < a.length / 2; ++i) {
                int tmp[] = a[i];
                a[i] = a[a.length - i - 1];
                a[a.length - i - 1] = tmp;
            }


            System.out.println();
            for (int i = 0; i < a.length; i++, System.out.println())
                for (int j = 0; j < a[i].length; j++)
                    System.out.print(a[i][j] + " ");

        }
        if (k == 21) {
            System.out.print("Введите длину массива: ");
            int n = nomer.nextInt();
            int a[] = new int[n];
            int K;
            int L;

            while (true) {
                System.out.println("Введите значение L: ");
                K = nomer.nextInt();
                System.out.println("Введите значение K: ");
                L = nomer.nextInt();
                if (K >= 1 & K <= L & L <= n) {
                    break;
                } else {
                    System.out.println("Ошибка");
                }
            }
            for (int i = 0; i < n; i++) {
                a[i] = i;
                System.out.println("a[" + i + "] = " + i);

            }
            double sum = 0;
            for (int i = K; i <= L; i++) {
                sum += a[i];
            }
            System.out.print(((sum) / (L - K + 1)));
        }
        if (k == 69) {




           System.out.print("Введите длину массива: ");
           int n = nomer.nextInt();
           int a[] = new int[n];
            System.out.print("Исходный массив: ");
            int i;
           for ( i = 0; i < n; i++) {
                a[i] = i;
                System.out.println("a[" + i + "] = " + a[i]);
            }
           for(i=0;i<a.length;i+=2){
               var g1 = a[i];
               var g2 = a[i+1];
               a[i]=g2;
               a[i+1]=g1;
           }
            System.out.println();
            for ( i = 0; i < n; i++) {
                System.out.println("a[" + i + "] = " + a[i]);
            }






        }

        if (k == 39) {
           int m,n,i,j,kol;
           boolean f;
            System.out.println("Введие m:");
            m = nomer.nextInt();
            System.out.println("Введие n:");
            n = nomer.nextInt();
            int a[][] = new int[n][n];
            for ( i = 0; i < a.length; i++) {
                for (j = 0; j < a[i].length; j++)
                    a[i][j] = (int) (Math.random() * 10);
            }

            for ( i = 0; i < a.length; i++, System.out.println()) {
                for (j = 0; j < a[i].length; j++)
                    System.out.print(a[i][j] + " ");
            }
            kol =0;
            for(j=0;j<m;j++) {
                f = true;
                i = 0;
                while ((i < m) && f) {
                    k = 0;
                    while ((k < m) && f) {
                        k = 0;
                        while ((k < m) && f)
                            if ((a[i][j]) == a[k][j] && (i != k)) f = false;
                            else k++;
                    }
                    if (f) i++;
                }
                if (f) kol++;
            }
            System.out.print("Количество столбцов, в которых все элементы разные = "+ kol);

             }




            }

        }







