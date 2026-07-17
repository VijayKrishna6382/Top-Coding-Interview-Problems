package GreedyAlgorithm;

class Solution {
    public ArrayList<Integer> jobSequencing(int[] d, int[] p) {
        int n=d.length;
        int[][] arr=new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=d[i];
            arr[i][1]=p[i];
            arr[i][2]=i+1;
        }
        ArrayList<Integer> list=new ArrayList<>();
        int maxd=0;
        for(int i=0;i<n;i++){
            if(d[i]>maxd){
                maxd=d[i];
            }
        }
        int curprof=0;
        int job=0;
        int[] hash=new int[maxd+1];
        Arrays.fill(hash,-1);
        Arrays.sort(arr,(a,b)->Integer.compare(b[1],a[1]));
        for(int i=0;i<n;i++){
            for(int j=arr[i][0];j>0;j--){
            if(hash[j]==-1){
                hash[j]=arr[i][2];
                curprof+=arr[i][1];
                job++;
                break;
            }
            }
        }
        list.add(job);
        list.add(curprof);
        return list;
        
    }
}