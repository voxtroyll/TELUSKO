
class A{
    public void show(){
        System.out.println("Show");
    }
    static class B{
        public void config(){
            System.out.println("Config");
        }
    }
}
public class StaticinnerClass {
    static void main(String[] args) {


        A.B obj1= new A.B ();
        obj1.config();

    }
}
