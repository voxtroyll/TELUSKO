
abstract class A{
    public abstract void show();
    public abstract void config();
}

public class Demo {
    static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("New Show");
            }
            public void config(){
                System.out.println("New Config");
            }
        };
        obj.show();
        obj.config();
    }
}
