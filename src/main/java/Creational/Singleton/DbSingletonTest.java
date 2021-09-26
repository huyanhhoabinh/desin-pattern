package Creational.Singleton;

import java.lang.reflect.Constructor;

public class DbSingletonTest {
    public static void main(String[] args) {
        DbSingleton first = DbSingleton.getInstance();
        System.out.println(first);
        DbSingleton second = null;
        try {
            // Below code will change constructor access level from private to public
            Constructor constructor = DbSingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);

            // Creating second instance
            second = (DbSingleton) constructor.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("instanceOne HashCode : " + first.hashCode());
        System.out.println("instanceTwo HashCode : " + second.hashCode());

        System.out.println(second);
    }
}
