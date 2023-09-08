package intoduction;
//OOP1

public class Main {
        public static void main(String args[]) {
            Info atharva;//just declaring
//          atharva=new Info();//intialized
            atharva=new Info(18,"virat",99.2f);


//Note: primitve data mebers are not implemented as objet hence pritive data value stores in stack

//            atharva.rn=56;
//            atharva.name="Atharva Nimbalkar";
//            atharva.marks=788;
//            atharva.changeName("Anil");
//            System.out.println(atharva);
//            System.out.println(atharva.rn);
//            System.out.println(atharva.name);
//            System.out.println(atharva.marks);

            Info random=new Info(atharva);
            System.out.println(random.name);
////
            Info arpit=new Info();
            System.out.println(arpit.name);
////
//            Info one=new Info();
//            Info two=one;
//            one.name="Something something";
//            System.out.println(two.name);
        }
    }

class Info {
    int rn,rn1;
    String name,name1;
    float marks,marks1;

    //constructor is special function ,that runs when you create
    //an object and it allocates some variable.

//    void changeName(String name){
//        this.name=name;
//    }

//    Info(){//no argument default constructor
//        this.rn=7;
//        this.name="MSD";
//        this.marks=99.3f;
//    }


    //this will call that particular value
    //note in below if paramter are same then use this keyword otherwise change the variable name like...
    Info(int rn,String name,float marks){//passing argument parameterized constructor
        this.rn=rn;
        this.name=name;
        this.marks=marks;
    }

    Info(Info other){//info constructor take value from differenrt object/constructor
        this.name= other.name;//this will replace random and other will replace atharva
        this.rn=other.rn;
        this.marks=other.marks;
    }

    Info(){
//        this is how you  call construtor form another constructor
//        internally:  new Info()
        this(18,"smirti",100.00f);
    }



    //if u want to change without this keyword just change vaiable name
    //like changeName,ChangeMarks
//    Info(int rollno,String changeName,float changeMarks){
//        rn=rollno;
//        name=changeName;
//        marks=changeMarks;
//    }


}
