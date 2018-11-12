import java.applet.Applet;

class Rock{
    Rock(){ // это и есть конструктор
        System.out.print("Rock ");
    }
}

class Rock2 {
    Rock2 (int i){
        System.out.print("Rock" + i + " ");
    }
}

class Task1 {
    Task1(){
        String s = new String();
        System.out.println(s);
    }
}

class Task2 {
    String s1 = new String("string s1");
    Task2(String s2){
        System.out.println(s2);
    }
}

class Tree {
    int height;
    Tree(){
        System.out.println("сажаем росток");
        height = 0;
    }
    Tree (int initialHeight){
        height = initialHeight;
        System.out.println("создание нового дерева высотой " + height + " м.");
    }
    void info() {
        System.out.println("Дерево высотой " + height + " м.");
    }
    void info(String s) {
        System.out.println(s + " Дерево высотой " + height + " м.");
    }
}

class f{
    f(int i, String s){
        System.out.println("int: " + i + ", String: " + s);
    }
    f(String s, int i){
        System.out.println("String: " + s + ", int: " + i);
    }
}

class Bird{}

class Bird2 {
    Bird2(int i){}
    Bird2(double b){}
}

class Task3 {
    Task3(){
        System.out.println("Task3 test");
    }
    Task3(String s){
        System.out.println("Task4 test " + s);
    }
}

class Dog{
    void bark(){
        System.out.println("лай");
    }
    void bark(int i){
        System.out.println("завывание");
    }
    void bark(double d){
        System.out.println("поскуливание");
    }
    void bark(int i ,double d){
        System.out.println("int, double");
    }
    void bark(double d, int i){
        System.out.println("double, int");
    }
}

class Task7{}

class Leaf{
    int i = 0;
    Leaf increment(){
        i++;
        return this;
    }
    void print(){
        System.out.println("i = " + i);
    }
}

class Person{
    public void eat(Apple apple){
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler {
    static Apple peel(Apple apple){
        // снимаем кожуру яблока
        return apple; //очищенное яблоко
    }
}

class Apple{
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}


class Task8 {

    int number;

    void setNumber1(int newNumber){
        number = newNumber;
    }
    void setNumber2(int number){
        this.number = number;
    }
}
public class Main {

    public static void main(String[] args) {
        for (int i = 0 ; i < 10; i++){
            new Rock();
        }
        System.out.println();

        for (int i = 0 ; i < 8; i++){
            new Rock2(i);
        }
        System.out.println();

        new Task1();
        Task2 task2 = new Task2("string s2");
        System.out.println(task2.s1);

        for (int i = 0; i < 5; i++){
            Tree t = new Tree(i);
            t.info();
            t.info("перегруженный метод");
        }
        new Tree(); // перегруженный конструктор
        System.out.println();

        new f("сначала строка", 11);
        new f(99, "сначала число");
        System.out.println();

        Bird b = new Bird();
        System.out.println();

        Bird2 b2 = new Bird2(1);
        Bird2 b3 = new Bird2(1.0);
        System.out.println();

        Task3 t3 = new Task3();
        System.out.println();

        Task3 t4 = new Task3("Task4");
        System.out.println();

        Dog d = new Dog();
        d.bark();
        d.bark(1);
        d.bark(1.1);
        System.out.println();

        d.bark(1.1, 1);
        d.bark(1, 1.1);
        System.out.println();

        Task7 task7 = new Task7();
        System.out.println();

        Leaf x = new Leaf();
        x.increment().increment().increment().print();
        System.out.println();

        new Person().eat(new Apple());
        System.out.println();

        Task8 task8 = new Task8();
        task8.setNumber1(2);
        System.out.println(task8.number);
        task8.setNumber2(3);
        System.out.println(task8.number);
        System.out.println();

        156
    }
}
