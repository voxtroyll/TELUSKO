 class student{
    int roll_no ;
    String name ;
    static String University = "Vtu";

    void display(){
        System.out.println(name + ": " + roll_no +" : " + University);
    }
    student(int roll_no , String name){
        this.name=name;
        this.roll_no=roll_no;
    }

 }

public class Demo {
    static void main(String[] args) {
        student s1 = new student(2 , "Manish");
//        s1.roll_no = 1;
//        s1.name = "Manish";

        s1.display();
    }
}
