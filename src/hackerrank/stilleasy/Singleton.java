package hackerrank.stilleasy;

public final class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    public String str;

    private Singleton() {} //1:A private Singleton non parameterized constructor.

    public static Singleton getSingleInstance() {
        return INSTANCE;
    }

}
