import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        var nomer = new Scanner(System.in);
        System.out.print("Введите номер задания: ");
        int k = nomer.nextInt();
        if (k == 1) {


            System.out.print("Введите a: ");
            int a = nomer.nextInt();
            if (a < 0) {
                a = a - 2;
            }
            if (a > 0) {
                a = a + 1;
            }
            if (a == 0) {
                a = 10;
            }
            System.out.println("a = " + a);
        }

         else if (k == 2) {

            System.out.println("Введите значение i: ");
            String p = "";
            int i = nomer.nextInt();
            int a = i / 100;
            int b = i / 10 % 10;
            int c = i % 10;

            switch (a) {

                case 1: {
                    p = "Сто ";
                    break;
                }
                case 2: {
                    p = "Двести ";
                    break;
                }
                case 3: {
                    p = "Триста ";
                    break;
                }
                case 4: {
                    p = "Четыреста ";
                    break;
                }
                case 5: {
                    p = "Пятьсот ";
                    break;
                }
                case 6: {
                    p = "Шестьсот ";
                    break;
                }
                case 7: {
                    p = "Семьсот ";
                    break;
                }
                case 8: {
                    p = "Восемьсот ";
                    break;
                }
                case 9: {
                    p = "Девятьсот ";
                    break;
                }

            }

            switch (b) {

                case 1: {
                    p += "Десять ";
                    break;
                }
                case 2: {
                    p += "Двадцать ";
                    break;
                }
                case 3: {
                    p += "Тридцать ";
                    break;
                }
                case 4: {
                    p += "Сорок ";
                    break;
                }
                case 5: {
                    p += "Пятьдесят ";
                    break;
                }
                case 6: {
                    p += "Шестьдесят ";
                    break;
                }
                case 7: {
                    p += "Семьдесят ";
                    break;
                }
                case 8: {
                    p += "Восемьдесят ";
                    break;
                }
                case 9: {
                    p += "Девяносто ";
                    break;
                }

            }
            if (b != 1) {
                switch (c) {
                    case 1: {
                        p += "Один";
                        break;
                    }
                    case 2: {
                        p += "Два";
                        break;
                    }
                    case 3: {
                        p += "Три";
                        break;
                    }
                    case 4: {
                        p += "Четыре";
                        break;
                    }
                    case 5: {
                        p += "Пять";
                        break;
                    }
                    case 6: {
                        p += "Шесть";
                        break;
                    }
                    case 7: {
                        p += "Семь";
                        break;
                    }
                    case 8: {
                        p += "Восемь";
                        break;
                    }
                    case 9: {
                        p += "Девять";
                        break;
                    }
                }
            }
            System.out.println(p);

        }


        if (k == 3) {

            System.out.print("Введите a: ");
            int a = nomer.nextInt();
            System.out.print("Введите b: ");
            int b = nomer.nextInt();
            if (a < b) {
                System.out.println("Больше - " + b);
            } else if (a > b) {
                System.out.println("Больше - " + a);
            } else {
                System.out.println("Они равны ");
            }
        }

        if (k == 4) {

            System.out.println("Введите значение i: ");
            String p = "";
            int i = nomer.nextInt();
            int b = i / 10 % 10;
            int c = i % 10;

            if(i <= 40){
                switch (b) {

                    case 1: {
                        p += "Десять ";
                        break;
                    }
                    case 2: {
                        p += "Двадцать ";
                        break;
                    }
                    case 3: {
                        p += "Тридцать ";
                        break;
                    }
                    case 4: {
                        p += "Сорок ";
                        break;
                    }
                }
                if (b != 1) {

                    switch (c) {
                        case 1: {
                            p += "Один";
                            break;
                        }
                        case 2: {
                            p += "Два";
                            break;
                        }
                        case 3: {
                            p += "Три";
                            break;
                        }
                        case 4: {
                            p += "Четыре";
                            break;
                        }
                        case 5: {
                            p += "Пять";
                            break;
                        }
                        case 6: {
                            p += "Шесть";
                            break;
                        }
                        case 7: {
                            p += "Семь";
                            break;
                        }
                        case 8: {
                            p += "Восемь";
                            break;
                        }
                        case 9: {
                            p += "Девять";
                            break;
                        }
                    }


                }


                System.out.println(p);
            }

            else{
                System.out.println("");
             }

           }

        if (k == 5) {

            System.out.println("Введите значение i: ");
            String p = "";
            int i = nomer.nextInt();
            int a = i % 10;
            int b = i % 12;
            int c = (i+8) % 12;

            switch (a) {



                case 0,1: {
                    p = "бел";
                    break;
                }
                case 2,3: {
                    p = "черн";
                    break;
                }

                case 4,5: {
                    p = "зелен";
                    break;
                }

                case 6,7: {
                    p = "красн";
                    break;
                }

                case 8,9: {
                    p = "желт";
                    break;
                }


            }

            switch (b) {

                case 0,1,2,3,4,5,9,10,11: {
                    p += "ой";
                    break;
                }
                case 6,7,8: {
                    p += "ого";
                    break;
                }

                }



                switch (c) {
                    case 0: {
                        p += " крысы";
                        break;
                    }
                    case 1: {
                        p += " коровы";
                        break;
                    }
                    case 2: {
                        p += " тигра";
                        break;
                    }
                    case 3: {
                        p += " зайца";
                        break;
                    }
                    case 4: {
                        p += " дракона";
                        break;
                    }
                    case 5: {
                        p += " змеи";
                        break;
                    }
                    case 6: {
                        p += " лошади";
                        break;
                    }
                    case 7: {
                        p += " овцы";
                        break;
                    }
                    case 8: {
                        p += " обезьяны";
                        break;
                    }
                    case 9: {
                        p += " курицы";
                        break;
                    }
                    case 10: {
                        p += " собаки";
                        break;
                    }
                    case 11: {
                        p += " свиньи";
                        break;
                    }
                }

            System.out.println(p);


           }
        if (k == 6) {

            System.out.println("Введите цену конфет: ");
            float c = nomer.nextInt();
            float i;
            for(i = 1 ; i <=5; i++){
                System.out.println((1+i*2/10)+"кг: "+(1+i*2/10)*c);
            }



            }
        if (k == 7) {

            while(true) {
                System.out.println("Введите N: ");
                float N = nomer.nextInt();
                if (N > 0) {
                    float rez = 1;
                    while (N >= 2) {
                        rez = rez * N;
                        N = N - 2;

                    }
                    System.out.println("Двойной факториал равен: " + rez);
                    break;
                }
                else {
                    System.out.println("Вы ввели некоректное число");
                }
            }

        }
        if (k == 22) {
            System.out.println("Введите X: ");
            float X = nomer.nextFloat();
            System.out.println("Введите N: ");
            int N = nomer.nextInt();
            float Rez = 1;
            float pow = 1;
            float fact = 1;
            int i;
            for(i = 1 ; i < N;i++){
                fact=fact*i;
                pow=pow*X;
                Rez=Rez+pow/fact;
            }
            System.out.println("Ответ:"+Rez);
        }
        if (k == 30) {
            System.out.println("Введите A: ");
            float A = nomer.nextInt();
            System.out.println("Введите B: ");
            float B = nomer.nextInt();
            System.out.println("Введите C: ");
            float C = nomer.nextInt();
            float Btemp;
            int K = 0;
            while ( (A-C) >= 0 ){
                A=A-C;
                Btemp = B;

             while (Btemp-C >= 0 ) {
                 Btemp = Btemp - C;
                  ++K;
             }

            }
            System.out.println("Ответ:"+K);
        }
        if (k == 21) {
            System.out.print("Введите длину массива: ");
            int n = nomer.nextInt();
            int a[] = new int[n];
            int K;
            int L;

            while(true){
                System.out.println("Введите значение L: ");
                K = nomer.nextInt();
                System.out.println("Введите значение K: ");
                L = nomer.nextInt();
                if(K >= 1 & K <= L & L <= n){
                    break;
                }
                else{
                    System.out.println("Ошибка");
                }
            }
            for(int i = 0; i < n ;i++){
                a[i] = i;
                System.out.println("a["+ i +"] = " +i);

            }
            double sum = 0;
            for(int i = K; i<=L; i++){
                sum += a[i];
            }
            System.out.print(((sum)/(L-K+1)));
           }

        if (k == 59) {
//            int m, n,min,max;
//            System.out.println("Введие m и n:");
//            m = nomer.nextInt();
//            n = nomer.nextInt();
//            int[][] a = new int[m][n];
//            System.out.println("Введите min и max:");
//            min = nomer.nextInt();
//            max = nomer.nextInt();
//
//            for (int i = 0; i < a.length; i++) {
//                for (int j = 0; j < a[i].length; j++) {
//
//                    a[i][j] = min + (int) (Math.random()*(max-min+1));
//                    System.out.print(a[i][j] + "\t");
//
//                }
//                System.out.println();
//            }
            int m, n;
            System.out.println("Введие m и n:");
            m = nomer.nextInt();
            n = nomer.nextInt();
            int[][] a = new int[m][n];
            for (int i = 0; i < a.length; i++)
                for (int j=0; j < a[i].length; j++)
                    a[i][j] = (int)(Math.random()*10);


            for (int i=0;i < a.length;i++,System.out.println())
                for (int j=0;j < a[i].length;j++)
                    System.out.print(a[i][j]+" ");


            for (int i = 0; i < a.length / 2; ++i) {
                int tmp[] = a[i];
                a[i] = a[a.length - i - 1];
                a[a.length - i - 1] = tmp;
            }


            System.out.println();
            for (int i=0;i < a.length;i++,System.out.println())
                for (int j=0;j < a[i].length;j++)
                    System.out.print(a[i][j]+" ");
        }
    }
}





