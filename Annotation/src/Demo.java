class A{
    public void show(){
        System.out.println("A show");
    }
}
class B extends A{
    @Override // isi ko anotation bolte h
    public void show(){
        System.out.println("B show");
    }
}

public class Demo {
    static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
