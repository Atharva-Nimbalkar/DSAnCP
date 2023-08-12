package atharva.StringNStringBuilder;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));
        System.out.println("A"+123);
//        this is same as after a few ste ps : "a" + "1"
//        integer will be converted to Integer that will call tostirng()
    }
}
