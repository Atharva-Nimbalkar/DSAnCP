package atharva.StringNStringBuilder;
//Input: s = "aabcb"
//        Output: 5
//        Explanation: The substrings with non-zero beauty are ["aab","aabc","aabcb","abcb","bcb"], each with beauty equal to 1.
public class Beautystring {
    public static int beautySum(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            int[] charfreq=new int[26];
            for(int j=i;j<s.length();j++){
                char c=s.charAt(j);
                charfreq[c-'a']++;
                sum+=beautySum(charfreq);
            }
        }
        return sum;
    }

    private static int beautySum(int[] charfreq){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i:charfreq){
            if(i!=0){
                max=Math.max(max,i);
                min=Math.min(min,i);
            }
        }
        return max-min;
    }

    public static void main(String[] args) {
       String s="aabcb";
       System.out.println(beautySum(s));
    }
}
