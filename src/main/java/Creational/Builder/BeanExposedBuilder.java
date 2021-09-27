package Creational.Builder;

public class BeanExposedBuilder {
    public static class Builder {
        private String a,b,c,d;
        public Builder() {

        }

        public BeanExposedBuilder build() {
            return new BeanExposedBuilder(this);
        }

        public Builder a(String a) {
            this.a = a;
            return this;
        }
        public Builder b(String b) {
            this.b = b;
            return this;
        }
        public Builder c(String c) {
            this.c = c;
            return this;
        }
        public Builder d(String d) {
            this.d = d;
            return this;
        }

    }
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    private BeanExposedBuilder(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
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

    @Override
    public String toString() {
        return "BeanExposedBuilder{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }
}
