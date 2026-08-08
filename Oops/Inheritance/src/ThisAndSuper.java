class A{
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in Int A");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }
    public B(int n){
//        super(n);
        this();
        System.out.println("in int B");
    }
}


public class ThisAndSuper {
    static void main(String[] args) {
        B obj = new B(5);
    }
}
