class A{
    public void show(){
        System.out.println("Show");
    }
    class B{
        public void config(){
            System.out.println("Config");
        }
    }
}

public class Demo {
    static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();
    }
}
