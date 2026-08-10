@FunctionalInterface
interface Addition{
    int add(int i , int j);

    //functional interface can have only one abstract method
    //but can have multiple default and static methods

    default void show(){
        System.out.println("Show");
    }

    static void sh(){
        System.out.println("Static");
    }
}
public class Demo {
    static void main(String[] args) {
//        Addition a = new Addition() {
//            @Override
//            public int add(int i, int j) {
//                return i+j ;
//            }
//        };

        //Lambda Expression :

        Addition a = (i ,j) ->  i+j ;

        int result = a.add(3,4) ;
        System.out.println(result);
    }
}
