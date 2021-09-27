package Creational.Builder;

public class BuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("test");

        stringBuilder.append("test");
        stringBuilder.append("test");
        System.out.println(stringBuilder.toString());
    }
}
