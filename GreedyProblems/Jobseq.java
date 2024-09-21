import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import  java.util.*;

public class Jobseq {

    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        System.out.println("enter total jobs");
        Scanner in = new Scanner(System.in);
        int N;
        N = in.nextInt();
        int jobsqu[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            System.out.println("enter job "+(i+1));
            jobsqu[i][0] = in.nextInt();
            jobsqu[i][1]=in.nextInt();
        }

        ArrayList<Job> jobs = new ArrayList<>(jobsqu.length);
        for (int i = 0; i < N; i++) {
            jobs.add(new Job(i, jobsqu[i][0], jobsqu[i][1]));
        }

        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);
        //descending order

        ArrayList<Integer>seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("no of jobs can perform is :  "+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.println(seq.get(i)+1+"th Job");
        }
        System.out.println();
    }
}
