class Voting{
    static void age(int age){
        if(age <= 18){
            throw new IllegalArgumentException(
                    "Age must be greater than or equal to 18."
            );
        }
        System.out.println("You can vote");
    }
}
public class ThrowExample {
    static void main(String[] args) {
        Voting v = new Voting();
        try{
            v.age(15);
        }catch (IllegalArgumentException i){
            System.out.println("Exception handled");
            System.out.println("Reason:" + i);
        }
        System.out.println("Voting Program Done");
    }
}
