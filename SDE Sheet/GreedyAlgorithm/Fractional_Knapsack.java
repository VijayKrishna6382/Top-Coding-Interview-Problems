package GreedyAlgorithm;

class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int cap) {
        
        int n=wt.length;
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=val[i];
            arr[i][1]=wt[i];
        }
        Arrays.sort(arr,(a,b)->Double.compare((double)b[0]/b[1],(double)a[0]/a[1]));
        double maxval=0;
        int curw=0;
        for(int i=0;i<n;i++){
            if(arr[i][1]+curw<=cap){
                maxval+=arr[i][0];
                curw+=arr[i][1];
            }
            else{
                int ww=cap-curw;
                maxval+=((double)arr[i][0]/arr[i][1])*ww;
                break;
            }
        }
        return maxval;
        
        
        
    }
}
