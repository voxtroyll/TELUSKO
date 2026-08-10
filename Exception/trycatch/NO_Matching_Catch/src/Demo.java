public class Demo {
    static void main(String[] args) {
        try{
            String name = null;
            System.out.println(name.length());
        }
//        catch (ArithmeticException e){
//            System.out.println("Arithmetic Exception" );
//        }
        catch (NullPointerException n){
            System.out.println("NO name ");
        }
        finally{
            System.out.println("Finally executes..");
        }
    }
}
