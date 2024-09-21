import java.util.Arrays;
import java.util.Comparator;

public class Factionalknapsack {
    public static void main(String[] args) {
        int[] wt={10,20,30};
        int capacity=50;
        int[] value={60,100,120};
        int ans=fractionalsolve(wt,capacity,value);
        System.out.println(ans);
    }

    public static int fractionalsolve(int[] wt,int capacity,int[] value){
        double[][] ratio=new double[value.length][2];


        //0th col=>idx,1st col=>ratio
        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)wt[i];
        }

        //ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        int maxwt=capacity;
        int finalval=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(maxwt>=wt[idx]){
                finalval+=value[idx];
                maxwt-=wt[idx];
            }else{
                finalval+=(ratio[i][1]*maxwt);
                maxwt=0;
                break;
            }
        }
        return finalval;
    }
}
