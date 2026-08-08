class A{

    public void show(){
        System.out.println("In A Show");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}

public class Demo {
    static void main(String[] args) {
        A obj = new B();
        obj.show();

        obj = new A();
        obj.show();
    }
}
