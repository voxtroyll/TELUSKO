class A{
    public void show(){
        System.out.println("Show");
    }
}

public class Demo {
    static void main(String[] args) {
        A obj = new A(){
          public void show(){
                System.out.println("New Show");
          }
        };
        obj.show();
    }
}
