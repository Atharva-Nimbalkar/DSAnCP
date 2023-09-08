package staticExample;

public class InnerClasses {
    //only nested class can be static because it can depend on instance of Innerclass n also we get o/p

    static class Test{
        String name;
        public Test(String name){
            this.name=name;
        }
    }

    public static  void main(String[] args){
        Test a= new Test("kunal");
        Test b=new Test("Rahul");

        System.out.println(a.name);
        System.out.print(b.name);


    }
}
//outside class can not be static only the class inside main class can.`