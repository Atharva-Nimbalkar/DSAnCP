public class DelCallthree {

    public static void main(String[] args) {
        //Deletion For LL
        Deletiontwo list1 = new Deletiontwo();
        list1.insertFirst(3);
        list1.insertFirst(5);
        list1.insertFirst(7);
        list1.insertLast(1000);
//      list1.insertMiddle(108,3);
        list1.display();
//Deletion for DLL remaining
        System.out.println(list1.deleteFirst());
        list1.display();
        System.out.println(list1.deleteLast());
        list1.display();
        System.out.println((list1.delete(1)));
        list1.display();


    }
}
