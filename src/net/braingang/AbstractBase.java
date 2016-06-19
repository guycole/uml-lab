package net.braingang;

/**
 *
 */
public abstract class AbstractBase {

    public AbstractBase(String arg) {
        System.out.println("AbstractBaseClass ctor:" + arg);
    }

    public void method1(int arg1, int arg2) {
        System.out.println("AbstractBaseClass.method1");
    }
}
