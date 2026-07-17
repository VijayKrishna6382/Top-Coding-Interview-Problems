package GreedyAlgorithm;

class Solution {
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        ArrayList<Integer> Index=new ArrayList<>();
        int n=s.length;
        int[][] arr=new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=s[i];
            arr[i][1]=f[i];
            arr[i][2]=i+1;
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));
        int ind=0;
        int maxind=arr[0][1];
        Index.add(arr[0][2]);
        for(int i=1;i<n;i++){
            if(maxind<arr[i][0]){
                Index.add(arr[i][2]);
                maxind=arr[i][1];
            }
        }
        Collections.sort(Index);
        return Index;
        
    }
}
