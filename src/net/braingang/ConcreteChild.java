package net.braingang;

/**
 *
 */
public class ConcreteChild extends AbstractBase implements InterfaceExample {

    public ConcreteChild() {
        super("testaroo");
    }

    public void method2(String arg) {
        System.out.println("ConcreteChild:" + arg);
    }
}
