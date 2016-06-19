package net.braingang;

/**
 * Created by gsc on 6/19/16.
 */
public class ConcreteChild extends AbstractBase {

    public ConcreteChild() {
        super("testaroo");
    }

    public void method2(String arg) {
        System.out.println("ConcreteChild:" + arg);
    }
}
