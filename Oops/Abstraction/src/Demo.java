abstract class Shape {
    abstract void square();
}

abstract class Shape1 extends Shape {
    @Override
    void square() {
        System.out.println("Square");
    }

    abstract void rectangle();
}

class Shape2 extends Shape1 {
    @Override
    void rectangle() {
        System.out.println("Rectangle");
    }
}

public class Demo {
    public static void main(String[] args) {
        Shape1 s = new Shape2();

        s.rectangle();
        s.square();
    }
}