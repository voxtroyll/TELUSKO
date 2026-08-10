
enum Statuss{
    Running , Pending , Success , Failed ;
}
public class enum_WITH_Switch {
    static void main(String[] args) {
        Statuss sc = Statuss.Pending ;

        switch(sc){
            case Success:
                System.out.println("All Success");
                break ;
            case Failed:
                System.out.println("Failed");
                break;
            case Pending:
                System.out.println("Pendingggg");
                break;
            case Running:
                System.out.println("Runninggg");
                break;
        }
    }



}
