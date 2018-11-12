import java.util.Random;

class IfElse2{
    static int test(int testval, int target){
        if (testval > target)
            return +1;
        else if (testval < target)
            return -1;
        else return 0;
    }
    static void test1(int begin, int end, int testval){
        if ((testval <= begin) || (testval >= end))
            System.out.println("тестовое значение не принадлежит заданному диапазону");
        else
            System.out.println("тестовое значение принадлежит заданному диапазону");
    }
}


public class Main {

    static int result = 0;
    static void test(int testval, int target){
        if (testval > target)
            result = +1;
        else if (testval < target)
            result = -1;
        else result = 0;
    }

    static void Fibonacci(int x){
        int[] f = new int[x];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < x; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }
        for (int i : f){
            System.out.print(i + ", ");
        }
    }

    public static void main(String[] args) {
        test(10, 5);
        System.out.println(result);
        test(5,10);
        System.out.println(result);
        test(5,5);
        System.out.println(result);
        System.out.println();

        for (char c = 0; c < 128; c++)
            if (Character.isLowerCase(c))
                System.out.println("значение: " + (int) c + " символ: " + c);
        System.out.println();

        for (int i = 0; i < 101; i ++)
            System.out.println(i);
        System.out.println();

        int a1 = (int) (100 * Math.random());
        System.out.println(a1);
        int i = 0;
        while(i < 25){
            int a2 = (int) (100 * Math.random());
            if (a1 > a2){
                System.out.println("сгенерированное значение " + a2 + " меньше изначального");
            } else if (a1 < a2) {
                System.out.println("сгенерированное значение " + a2 + " больше изначального");
            } else System.out.println("сгенерированное значение " + a2 + " и изначальное равны");
            i++;
        }
        System.out.println();

        for (int i1 = 3; i1 < 100; i1++){
            for (int b1 = 2; b1 < i1; b1++){
                if (i1 % b1 == 0)
                    break;
                else if (i1 == b1 + 1)
                    System.out.println(i1);
            }
        }
        System.out.println();

        for (int i1=1, j=i1+10; i1<5; i1++, j=i1*2){
            System.out.println("i1 = " + i1 + " j = " + j);
        }
        System.out.println();

        Random rand = new Random(47);
        float f[] = new float[10];
        for (int i1 = 0; i1 < 10; i1++)
            f[i1] = rand.nextFloat();
        for (float x : f)
            System.out.println(x);
        System.out.println();

        for(char c:"An African Swallow".toCharArray())
            System.out.print(c + " ");
        System.out.println();
        System.out.println();

        System.out.println(IfElse2.test(10, 5));
        System.out.println(IfElse2.test(5, 10));
        System.out.println(IfElse2.test(5, 5));
        System.out.println();

        IfElse2.test1(1, 5, 3);
        IfElse2.test1(1, 3, 5);
        System.out.println();

        for (int i1 = 0; i1 < 100 ; i1++) {
            if (i1 == 74)
                break;
            if (i1 % 9 != 0)
                continue;
            System.out.print(i1 + " ");
        }
        System.out.println();
        i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269)
                break;
            if (i % 10 != 0)
                continue;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        i = 0;
        outer:
        for (; true ;) {
            inner:
            for (; i < 10; i++){
                System.out.println("i = " + i);
                if (i == 2){
                    System.out.println("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("break");
                    i++;
                    break;
                }
                if (i == 7) {
                    System.out.println("continue outer");
                    i++;
                    continue outer;
                }
                if (i == 8) {
                    System.out.println("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++){
                    if (k == 3){
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
        System.out.println();

        i = 0;
        outer:
        while(true){
            System.out.println("Внешний цикл while");
            while(true){
                i++;
                System.out.println("i = " + i);
                if (i == 1){
                    System.out.println("continue");
                    continue;
                }
                if (i == 3){
                    System.out.println("continue outer");
                    continue outer;
                }
                if (i == 5){
                    System.out.println("break");
                    break;
                }
                if (i == 7){
                    System.out.println("break outer");
                    break outer;
                }
            }
        }
        System.out.println();

        for (int i1 = 0; i1 < 100; i1++){
            int c = rand.nextInt(26) + 'a';
            System.out.print((char)c + ", " + c + ": ");
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': System.out.println("гласная");
                    break;
                case 'y':
                case 'w': System.out.println("условно гласная");
                    break;
                default: System.out.println("согласная");
            }
        }
        System.out.println();

        for (int i1 = 0; i1 < 5; i1++){
            switch (i1) {
                case 0: System.out.println("0");
                    //break;
                case 1: System.out.println("1");
                    //break;
                case 2: System.out.println("2");
                    //break;
                case 3: System.out.println("3");
                    //break;
                default: System.out.println("random int");
            }
        }
        System.out.println();

        Fibonacci(5);
        System.out.println();

//        for (int i1 = 1001; i1 < 1002; i1++){
//            int number1 = i1 / 1000;
//            int number2 = i1 / 100 % 10;
//            int number3 = i1 % 100 / 10;
//            int number4 = i1 % 1000;
//            System.out.println(number1 + " " + number2 + " " +  number3 + " " +  number4);
//            //if ()
//        }


    }

}
