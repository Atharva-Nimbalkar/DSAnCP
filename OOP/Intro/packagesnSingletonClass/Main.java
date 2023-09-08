package packagesnSingletonClass;
//OOP 2
public class Main {
    public static void main(String[] args) {
        Singleton obj1=Singleton.getInstance();

        Singleton obj2=Singleton.getInstance();

        Singleton obj3=Singleton.getInstance();
//no way to create constructor if created only one object will be created
        //all 3 red variables are pointing to just one object;
    }
}
