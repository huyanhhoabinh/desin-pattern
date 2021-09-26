package Creational.Singleton;

public class DbSingleton {
    private static volatile DbSingleton instance = null;
    private DbSingleton() {
        if(instance != null) {
            throw new RuntimeException("Uset getInstance() method to create");
        }
    };
    public static DbSingleton getInstance() {
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    return new DbSingleton();
                }
            }
        }
        return instance;
    }
}
