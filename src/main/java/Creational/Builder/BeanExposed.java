package Creational.Builder;

public class BeanExposed {
    private String a, b,c,d;

    public BeanExposed(String a) {
        this.a = a;
    }

    public BeanExposed(String a, String b) {
        this(a);
        this.b = b;
    }


    public BeanExposed(String a, String b, String c) {
        this(a, b);
        this.c = c;
    }

    public BeanExposed(String a, String b, String c, String d) {
        this(a, b, c);
        this.d = d;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public String getD() {
        return d;
    }

}
