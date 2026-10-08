import java.util.*;
/* 
//Activity Selection.
//->You are given n activities with their start and end times. Select the maximum number of activities
//->that can be performed by a Single person, assuming that a person can by a Single person,
//assuming that a person can only work on a single activity at a time. Activities are sorted according to end time.
public class GreedyAlgo {
    public static void main(String[] args){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for(int i=0; i<end.length; i++){
            if(start[i] >= lastEnd){
                //activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("max activities = " + maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A" + ans.get(i) +" ");
        }
        System.out.println();
    }
}
*/
/* 
//Fractional Knapsack
public class GreedyAlgo{
    public static void main(String[] args){
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int w =50;

        double ratio[][]=new double[val.length][2];
        //0th col =>idx; 1st => ratio
        for(int i=0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double)weight[i];
        }
        //ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finalVal =0;
        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int) ratio[i][0];
            if(capacity >=weight[idx]){
                finalVal += val[idx];
                capacity -= weight[idx];
            }else{
                //include fractional item
                finalVal += (ratio[i][1] * capacity);
                capacity =0;
                break;
            }
        }
        System.out.println("Final Value = "+ finalVal );
    }
}
*/
/* 
//Min Absolute Difference Pairs
//->Given two arrays A and B of equal length n, Pair each element of array A to an element
//in array B , such that sum S of absolute differences of all the pairs is minimum .
public class GreedyAlgo{
    public static void main(String[] args){
        int A[] ={1,2,3};
        int B[] ={2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for(int i=0; i<A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println(minDiff);

    }
}
*/
/* 
//Max length chain of pair
//-> You are given n pairs of numbers.in every pair, the first number is always smaller than the Second number.
//A pair(a,b) if b<c.
//Find the longest chain which can be formed from a given set of pairs.
public class GreedyAlgo{
    public static void main(String[] args){
        int pairs[][] = {{5,24} , {39,60}, {5,28},{27,40},{50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o ->o[1]));

        int chainLen =1;
        int chainEnd = pairs[0][1];

        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("max length = " + chainLen);
    }
}
*/
/* 
//Indian Coins
//-> we are given an infinite supply of denomination [1,2,5,10,20,50,100,500,1000,2000]
//Find min no. of coins/notes to make change for a value v.
public class GreedyAlgo{
    public static void main(String[] args){
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins , Comparator.reverseOrder());
        int countOfCoins =0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("total (min) coins used = " + countOfCoins);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
*/
/* 
//Job Sequencing Problem
//->Given an array of jobs where every job has a deadline and profit if the job is finished before the
//deadline. It is also given that everyjob takes a single unit of time, so the minimum possible deadline for any job is 1.
//Mazimize the total profit if only one job can be scheduled at a time.
public class GreedyAlgo{
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String[] args){
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();
        for(int i=0; i<jobsInfo.length; i++){
            jobs.add(new Job (i, jobsInfo[i][0],jobsInfo[i][1]));
        }
        Collections.sort(jobs,(obj1 , obj2) -> obj2.profit -obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time =0;
        for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }
        //print seq.
        System.out.println("max Jobs = "+ seq.size());

        for(int i=0; i<seq.size(); i++){
            System.out.print(seq.get(i)+ " ");
        }
        System.out.println();
    }
}
*/
//Chocola Problem
//->We are given a bar of chocolate composed of mxn square pieces. one should break of a part of the chocolate is charged a cost expressed
//by a positive integer. This cost does not depend in the size of the part that is bring broken but only depends in the line the break goes
//along. let us denote the costs of x1,x2...xm-1 and along horizontal lines with y1,y2....yn-1.
//Compute the minimal cpst of breaking the whole chocolate into single squares.
public class GreedyAlgo{
    public static void main(String[] args){
        int n=4, m=6;
        Integer costVer[] ={2,1,3,1,4};
        Integer costHor[] ={4,1,2};

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h=0, v=0;
        int hp=1,vp=1;
        int cost=0;

        while(h<costHor.length && v<costVer.length){
            if(costVer[v] <= costHor[h] ){
                cost += (costHor[h] * vp);
                hp++;
                h++;
            }else{
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while(h<costHor.length){
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        while(v<costVer.length){
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }
        System.out.println("main cost if cuts = " + cost);
    }
}