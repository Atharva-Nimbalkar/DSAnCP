package atharva.StringNStringBuilder;

public class Main {
    public static void main(String[] args) {
        String a="atharva";//this will now go to garbage collector
        System.out.println(a);
        a="Nimbalkar";
        System.out.println(a);
    }
}
