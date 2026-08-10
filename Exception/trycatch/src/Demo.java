
public class Demo {
    static void main(String[] args) {
        int i = 5;
        int j = 0 ;

        //try block m critical code likho jahan exception aane ki possibility ho
        //exception aate hi java try block skip krke catch pr chala jta h
        //catch exception receive krta h aur handle krta h
        //finally hamesa execute hoga
        try{
            int result = i/j ;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero..");
            System.out.println("Error Message: " + e.getMessage());
        }finally{
            System.out.println("Finally executes...");
        }
    }
}
