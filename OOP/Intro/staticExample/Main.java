package staticExample;

public class Main {
    //static belong to class not to object we need main function before creating the main's class
    //object that's why need static keyword.
    public static void main(String[] args) {
        Human atharva=new Human(20,"atharva", 100000,false);
    //main not import human class bcz both class are in same package
        Human raj=new Human(25,"raj",100000,true);
        Human arpit=new Human(25,"arpit",100000,true);
        System.out.println(raj.name);
    System.out.println(atharva.name);
    System.out.println(atharva.salary);
    System.out.println(Human.population);
    System.out.println(Human.population);

        Main funn=new Main();
        funn.fun2();//called function not statically
        Main.fun();//called function statically
    }

    //this is not dependant on object
    static void fun(){
//            greeting(); u can't use this bcz it requires an instance
//        but the function you are using it in does not depend on instances

//          u can't access non static stuff wihtout reference their instances in a
//          in a static context

//        hence here i am referencing it
        Main obj=new Main();
        obj.greeting();
    }

//    if it not static at last it directly called see line 16
    void fun2(){
        greeting();
    }
    //we know that something which is not static,belongs to an object.
    void greeting(){
//            fun();
        System.out.println("Hello World");
    }
}
