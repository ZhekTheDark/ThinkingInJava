class test{
    static int x;
    static char y;
}

class ATypeName{
    static int zero = 0;
}

class DataOnly {
    static int i;
    static double d;
    static boolean b;
}

class Incrementable {
    static void increment(){
        StaticTest.i++;
    }
}

class StaticTest {
    static int i = 47;
}

class AllTheColorsOfTheRainbow{
    static int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue){
        AllTheColorsOfTheRainbow.anIntegerRepresentingColors = newHue;
    }
}
public class Main {

    public static int storage(String s){
        return s.length() * 2;
    }

    public static void main(String[] args) {
        test test1 = new test();
        System.out.println(test.x);
        System.out.println(test.y);
        System.out.println("2.1 is done");

        System.out.println("Привет, мир");
        System.out.println("2.2 is done");

        ATypeName a = new ATypeName();
        System.out.println(a.zero);
        System.out.println("2.3 is done");

        DataOnly randomData = new DataOnly();
        System.out.println(randomData.i);
        System.out.println(randomData.d);
        System.out.println(randomData.b);
        System.out.println("2.4 is done");

        randomData.i = 47;
        randomData.d = 13.37;
        randomData.b = true;
        System.out.println(randomData.i);
        System.out.println(randomData.d);
        System.out.println(randomData.b);
        System.out.println("2.5 is done");

        System.out.println(storage("privet!"));
        System.out.println("2.6 is done");

        StaticTest incr = new StaticTest();
        Incrementable.increment();
        System.out.println(incr.i);
        System.out.println("2.7 is done");

        StaticTest incr1 = new StaticTest();
        StaticTest incr2 = new StaticTest();
        Incrementable.increment();
        System.out.println("incr1.i = " + incr1.i);
        Incrementable.increment();
        System.out.println("увеличил значение статичного поля");
        System.out.println("incr2.i = " + incr2.i);
        System.out.println("2.8 is done");

        int nine = 9;
        Integer bigNine = nine;
        System.out.println(bigNine.getClass());
        System.out.println("2.9 is done");

        String[] s = new String[3];
        s[0] = "первая строка";
        s[1] = "вторая строка";
        s[2] = "третья строка";
        System.out.println(s[0]);
        System.out.println(s[1]);
        System.out.println(s[2]);
        System.out.println("2.10 is done");

        AllTheColorsOfTheRainbow firstColor = new AllTheColorsOfTheRainbow();
        firstColor.anIntegerRepresentingColors = 25500;
        System.out.println("это типо красный = " + firstColor.anIntegerRepresentingColors);
        firstColor.changeTheHueOfTheColor(2552550);
        System.out.println("это уже желтый = " + firstColor.anIntegerRepresentingColors);
        System.out.println("2.11 is done");

        System.out.println("на этом второе дз завершено, ура!");
    }
}
