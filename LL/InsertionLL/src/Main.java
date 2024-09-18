public class Main {
    public static void main(String[] args) {

//        LL call
//        System.out.println("Hello world!");
        LLone list = new LLone();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertLast(1000);
//        list.insertMiddle(108,3);
        list.display();
        list.insertRec(18,3);
        list.display();
//        DLL call
//        DLLfour list = new DLLfour();
//        list.insertFirst(3);
//        list.insertFirst(5);
//        list.insertFirst(7);
//        list.insertLast(99);
//        list.insertMiddle(7,111);
//        list.display();


    }
}