package Creational.Singleton;

public class Exercise1 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        System.out.println(runtime);

        Runtime anotherTime = Runtime.getRuntime();
        System.out.println(anotherTime);

        if(runtime == anotherTime) {
            System.out.println("The Same");
        }
    }
}
