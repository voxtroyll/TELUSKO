class Calc{
    public int add(int n1, int n2){
        return n1+n2 ;
    }
}
class AdvCalc{
    public int add(int n1,int n2){
        return n1+n2+1 ;
    }
}

public class Demo {
    static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(1,2);
        System.out.println(r1);
    }
}
