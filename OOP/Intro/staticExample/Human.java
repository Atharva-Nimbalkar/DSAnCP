package staticExample;

public class Human {
        int age;
        String name;
        int salary;
        boolean married;

        static long population;

        public Human(int  age,String  name,int  salary,boolean married){
            this.age=age;
            this.name=name;
            this.salary=salary;
            this.married=married;
//            this.population+=1; but here this refers to object reference
            Human.population+=1;
//            static are those (properties)which are not directly connected/related to object
        }

}

