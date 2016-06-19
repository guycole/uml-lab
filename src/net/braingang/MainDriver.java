package net.braingang;

public class MainDriver {

    public static void main(String[] args) {
        System.out.println("start");

        ConcreteChild child = new ConcreteChild();
        child.method1(1, 2);
        child.method2("go away");

        System.out.println("stop");
    }
}
