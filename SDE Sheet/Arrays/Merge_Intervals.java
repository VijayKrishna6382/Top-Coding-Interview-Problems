package sdesheet;

class Solution {
    public int[][] merge(int[][] arr) {
        List<int[]> ans=new ArrayList<>();
        Arrays.sort(arr,(a,b)->(a[0]-b[0]));
        int n=arr.length;
        int i=0;
        while(i<n){
            int st=arr[i][0];
            int end=arr[i][1];
            int j=i+1;
            while(j<n && arr[j][0]<=end){
                end=Math.max(end,arr[j][1]);
                j++;
            }
            ans.add(new int[] {st,end});
            i=j;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}