class Solution {
    public int pascalTriangleI(int r, int c) {
          return pt(r-1,c-1);
    }
    static int pt(int r,int c){
        int ans=1;
        for(int i=0;i<c;i++){
            ans=ans*(r-i);
            ans=ans/(i+1);
        }
        return ans;
    }
}