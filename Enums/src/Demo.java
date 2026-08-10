enum Status{
    Running , Pending , Success , Failed ;
}
public class Demo {
    static void main(String[] args) {
        Status ss = Status.Running ;
        System.out.println(ss);

        // ordinal-> used to return index
        System.out.println(ss.ordinal());

        //.values() => returns the value
        Status[] s = Status.values();

        //print all named constants at once with their index
        for (Status st : s){
            System.out.println(s[0] + ":" + st.ordinal());
        }

    }
}
