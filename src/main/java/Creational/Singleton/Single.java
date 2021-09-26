package Creational.Singleton;

public class Single {
    private static Single instance = null;

    private Single() {
        System.out.println("test");
    }

    public static synchronized Single getInstance() {
        if(instance == null) {
            instance = new Single();
        }
        return instance;
    }
}
