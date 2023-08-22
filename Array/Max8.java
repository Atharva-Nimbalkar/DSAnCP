package atharva.com;

public class Max8 {
    public static void main(String[] args) {
        int[] abc = {1000, 3, 67, 89, 99};
        System.out.println(max(abc,1,4));
    }

    //work on egde cases here ,like array being null
    static int max(int[] abc,int start,int end) {

        if(start>end){
            return -1;
        }

        if(abc==null){
            return -1;
        }
        int maxValue = abc[start];
        for (int j = start; j <=end; j++) {
            if (abc[j] > maxValue) {
                maxValue = abc[j];
            }
        }
        return maxValue;
    }
}