package sdesheet;

class Solution {
    public boolean searchMatrix(int[][] m, int tar) {
       /* int i=0;
        int n=m.length;
        int j=m[0].length-1;
        while(i<n && j>=0){
            if(m[i][j]==tar){
                return true;
            }
            if(m[i][j]>tar){
                j--;
            }
            else{
                i++;
            }

        }
        return false;
        */




        int mm=m.length;
        int nn=m[0].length;
        int left=0;
        int right=mm*nn-1;
        while(left<=right){
            int mid=(right+left)/2;
            if(m[mid/nn][mid%nn]==tar){
                return true;
            }
            else if(m[mid/nn][mid%nn]>tar){
                 right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return false;
    }
}
