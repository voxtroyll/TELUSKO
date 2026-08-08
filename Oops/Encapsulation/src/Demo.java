public class Demo {
    private int age ;
    private String name ;

    //Using getter - to get the values
    //using setter - to get values

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name ;
    }
    public void setName(String n){
        name = n ;
    }

    static void main(String[] args) {
        Demo d = new Demo();

        d.setAge(22);
        d.setName("Anish");
        System.out.println(d.getName() + " : " + d.getAge());

    }
}
