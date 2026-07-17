package GreedyAlgorithm;

class Solution {
    public int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n=arr.length;
        int cnt=0;
        int i=1;
        int j=0;
        int max=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                cnt++;
                i++;
            }
            else{
                cnt--;
                j++;
            }
            max=Math.max(cnt,max);
            
        }
        return max+1;
        
        
    }
}

