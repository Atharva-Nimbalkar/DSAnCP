package atharva.StringNStringBuilder;

public class Comparison {
    public static void main(String[] args) {
        String a="Atharva";
        String c="Atharva";

        System.out.println(a==c);//java giving warning in yellow shade


//        how to create diff obj of same value (see below)
        //expicitly we create diff obj
        String name1=new String("Atharva");
        String name2=new String("Atharva");//creating the value but outside the heap
      System.out.println(name1==name2);
    //to check value use .equals method
//        System.out.println(name1.equals(name2));

    }
}
