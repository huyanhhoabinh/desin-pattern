package Creational.Builder;

public class TestBuilder {
    public static void main(String[] args) {
        BeanExposedBuilder.Builder builder = new BeanExposedBuilder.Builder();
        builder.a("1").b("2").c("3").d("4");
        BeanExposedBuilder beanExposedBuilder = builder.build();
        System.out.println(beanExposedBuilder.toString());
    }
}
