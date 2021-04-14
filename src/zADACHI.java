import java.util.Scanner;

public class zADACHI {

    public static void main(String[] args) {

        var nomer = new Scanner(System.in);
        System.out.print("Введите номер задания:");

        int k = nomer.nextInt();


        if (k == 1) {


            Scanner num = new Scanner(System.in);
            System.out.print("Первый радиус: ");
            double r1 = num.nextDouble();
            System.out.print("Второй радиус: ");
            double r2 = num.nextDouble();
            double pi = 3.14;
            double S1 = 0;
            double S2 = 0;
            double S3 = 0;
            if (r1 <= r2) {
                System.out.println("Введи значение r1 так, чтобы оно было больше r2 ;)");
            } else {
                S1 = pi * Math.pow(r1, 2);
                System.out.println("Первая площадь равна: " + S1);
                S2 = pi * Math.pow(r2, 2);
                System.out.println("Вторая площадь равна: " + S2);
                S3 = S1 - S2;
                System.out.println("Третья площадь равна: " + S3);

            }
        }


//     System.out.print("Введите число A : ");
//        var input =  new Scanner(System.in);
//        var A  = input.nextInt();
//        int vr = 0;
//        vr= A+A;
//        System.out.println(vr);
//        vr = vr*A;
//        System.out.println(vr);
//        vr=vr*A*A;
//        System.out.println(vr);
//        vr=vr*A*A*A*A*A;
//        System.out.println(vr);
//       vr=vr*A*A*A*A*A;
//       System.out.println(vr);


        else if (k == 2) {
            System.out.print("Введите число A : ");
            var input = new Scanner(System.in);
            var A = input.nextInt();
            int vr = 0;
            vr = A + A;
            System.out.println(vr);
            vr = vr + vr;
            System.out.println(vr);
            vr = vr + vr;
            System.out.println(vr);

        } else if (k == 3) {
            Scanner input = new Scanner(System.in);
            System.out.println("Введите сторону квадрата: ");
            int a1 = input.nextInt();
            System.out.println("Площадь квадрата: " + Math.pow(a1, 2));


        }

        else if (k == 4) {
            Scanner num = new Scanner(System.in);
            System.out.print("Введите диаметор окружности: ");
            double S = num.nextDouble();
            double pi = 3.14;
            double S1 = 0;
            S1 = S * pi;
            System.out.println(S1);

        }
        else if (k == 5) {
            Scanner num = new Scanner(System.in);
            System.out.print("Введите А: ");
            var A = num.nextInt();
            System.out.print("Введите В: ");
            var B = num.nextInt();
            System.out.print("Введите С: ");
            var C = num.nextInt();
            var n = 0;

            n=A;

            n=B;
            System.out.print("\nA = " +n);
            B=C;
            System.out.print("\nB = " +B);
            C=A;
            System.out.print("\nC = " +C);


        }
    }
}