import java.util.*;
//import static net.mindview.util.Print.*;

class Tank{
    int level;
    float floatLevel;
}

class Letter{
    char c;
}

class PassObject{
    static void f(Letter y){
        y.c = 'z';
    }
}

class Value{
    int i;
}

class Dog{
    String name;
    String says;
}

public class Main {

    static int ternary(int i){
        return i < 10 ? i * 100 : i * 10;
    }

    static void stringBul(String s1, String s2){
        System.out.println("Integer.parseInt(s1): " + Integer.parseInt(s1));
        System.out.println("Integer.parseInt(s2): " + Integer.parseInt(s2));
        System.out.println("Integer.parseInt(s1) < Integer.parseInt(s2): " + (Integer.parseInt(s1) < Integer.parseInt(s2)));
        System.out.println("Integer.parseInt(s1) > Integer.parseInt(s2): " + (Integer.parseInt(s1) > Integer.parseInt(s2)));
        System.out.println("Integer.parseInt(s1) == Integer.parseInt(s2): " + (Integer.parseInt(s1) == Integer.parseInt(s2)));
        System.out.println("Integer.parseInt(s1) != Integer.parseInt(s2): " + (Integer.parseInt(s1) != Integer.parseInt(s2)));
        System.out.println("s1.equals(s2): " + s1.equals(s2));

    }

    public static void main(String[] args) {

        System.out.println("Привет, сегодня: ");
        System.out.println(new Date());

        System.out.println("Здравствуй!");

        int x = 1, y = 2, z = 3;
        int a = x + y - 2/2 + z;
        int b = x + (y - 2)/(2 + z);
        System.out.println("a = " + a + " b = " + b);
        System.out.println();

        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1 = t2;
        System.out.println("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1.level = 27;
        System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
        System.out.println();

        t1.floatLevel = 0.5f;
        t2.floatLevel = 2.25f;
        System.out.println("1: t1.floatLevel: " + t1.floatLevel + ", t2.floatLevel: " + t2.floatLevel);
        t1 = t2;
        System.out.println("2: t1.floatLevel: " + t1.floatLevel + ", t2.floatLevel: " + t2.floatLevel);
        t1.floatLevel = 1.75f;
        System.out.println("3: t1.floatLevel: " + t1.floatLevel + ", t2.floatLevel: " + t2.floatLevel);
        System.out.println();

        Letter xL = new Letter();
        xL.c = 'a';
        System.out.println("1: xL.c: " + xL.c);
        PassObject.f(xL);
        System.out.println("2: xL.c: " + xL.c);
        System.out.println();

        int s = 10;
        float t = 0.5f;
        System.out.println("V = " + s/t);
        System.out.println();

        int i = 1;
        System.out.println("i : " + i);
        System.out.println("++i : " + ++i);
        System.out.println("i++ : " + i++);
        System.out.println("i : " + i);
        System.out.println("--i : " + --i);
        System.out.println("i-- : " + i--);
        System.out.println("i : " + i);
        System.out.println();

        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        System.out.println();

        System.out.println(n1.equals(n2));
        System.out.println();

        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
        System.out.println();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "spot";
        dog2.name = "scruffy";
        dog1.says = "guf!";
        dog2.says = "guf guf!";
        System.out.println(dog1.name + " says: " + dog1.says);
        System.out.println(dog2.name + " says: " + dog2.says);
        System.out.println();

        float min1 = 1e-45f;
        System.out.println(min1);
        double min2 = 1e-323d;
        System.out.println(min2);
        System.out.println();

        int i1 = 0x2f; // шестнадцатеричное (нижний регист)
        System.out.println("i1: " + Integer.toBinaryString(i1));
        int i2 = 0x2F; // шестнадцатеричное (верхний регист)
        System.out.println("i2: " + Integer.toBinaryString(i2));
        int i3 = 0177; // восьмеричное (начинается с нуля)
        System.out.println("i3: " + Integer.toBinaryString(i3));
        char c = 0xffff; //макс. щестнадцатеричное значение char
        System.out.println("c: " + Integer.toBinaryString(c));
        byte bb = 0x7f; //макс. щестнадцатеричное значение byte
        System.out.println("b: " + Integer.toBinaryString(bb));
        short ss = 0x7fff; //макс. щестнадцатеричное значение short
        System.out.println("s: " + Integer.toBinaryString(ss));
        System.out.println();

        String b1 = "0101";
        String b2 = "1010";
        System.out.println(Integer.parseInt(b1, 2));
        System.out.println(Integer.parseInt(b2, 2));
        System.out.println(Integer.parseInt(b1, 2) & Integer.parseInt(b2, 2));
        System.out.println(Integer.parseInt(b1, 2) | Integer.parseInt(b2, 2));
        System.out.println(Integer.parseInt(b1, 2) ^ Integer.parseInt(b2, 2));
        System.out.println();

        System.out.println(ternary(9));
        System.out.println(ternary(10));
        System.out.println();

        int x1 = 0, y1 = 1, z1 = 2;
        String s1 = "x1, y1, z1 ";
        System.out.println(s1 + x1 + y1 + z1);
        System.out.println(x1 + " " + s1);
        s1 = "(summed) = ";
        System.out.println(s1 + (x1 + y1 + z1));
        System.out.println("" + x1);
        System.out.println();

        int i4 = 200;
        long lng = (long) i4;
        lng = i4; // явное преобразование не необходимо
        long lng2 = (long) 200;
        lng2 = 200;
        i4 = (int) lng2; //преобразование необходимо
        System.out.println();

        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("(int) above: " + (int) above);
        System.out.println("(int) below: " + (int) below);
        System.out.println("(int) fabove: " + (int) fabove);
        System.out.println("(int) fbelow: " + (int) fbelow);
        System.out.println();

        System.out.println("Math.round(above): " + Math.round(above));
        System.out.println("Math.round(below): " + Math.round(below));
        System.out.println("Math.round(fabove): " + Math.round(fabove));
        System.out.println("Math.round(fbelow): " + Math.round(fbelow));
        System.out.println();

        int big = Integer.MAX_VALUE;
        System.out.println("большое = " + big);
        int bigger = big * 4;
        System.out.println("еще больше = " + bigger);
        System.out.println();

        String s2 = new String("123");
        String s3 = new String("321");
        stringBul(s2, s3);

    }
}
