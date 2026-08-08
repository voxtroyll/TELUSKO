class Calc{
    public int add(int n1 ,int n2){
        return n1+n2 ;
    }
    public int sub(int n1 ,int n2){
        return n1-n2 ;
    }
}
class AdvDemo extends Calc {
    public int mult(int n1 , int n2){
        return n1*n2 ;
    }
    public int div(int n1 , int n2){
        return n1/n2 ;
    }
}
public class Demo {
    static void main(String[] args) {
        AdvDemo c1 = new AdvDemo();
        int r1= c1.add(1,23);
        int r2= c1.mult(1,3);
        System.out.println(r1 + "  " +r2);

    }
}
