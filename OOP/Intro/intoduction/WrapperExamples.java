package intoduction;

public class WrapperExamples {
    public static void main(String[] args) {
//        int a=10;
//        int b=20;

        Integer a=10;
        Integer b=20;
        swap(a,b);
        System.out.println(a+" "+b);
        final A obj=new A("radha");
        obj.name="Krishna";

//        When object  primitve is final , u can't reassign it
//        obj=new A("new oBJECT");

        A obj1;
        for(int i=0;i<1000000000;i++){
            obj1=new A("Random name");
        }

    }



    static  void swap(Integer a,Integer b){//not swapping possible
        Integer temp=a;//bcz in java object are pass by value not by reference
        a=b;
        b=a;
    }
}

class A{
    final int num=100;
    String name;

    public  A(String name){
        this.name=name;
    }

//we cant destroy object manually
    @Override
    protected void finalize() throws Throwable {
        System.out.println("objects destroyed");
    }
}

