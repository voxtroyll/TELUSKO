@FunctionalInterface
interface A{
    void show();
}
//class B implements A{
//    public void show(){
//        System.out.println("in Show");
//    }
//}

public class Demo {
    static void main(String[] args) {
        A obj = new A(){
            //Anonymous Inner Class
            public void show(){
                System.out.println("IN Anonymous Inner Class");
            }
        };
        obj.show();
    }
}
