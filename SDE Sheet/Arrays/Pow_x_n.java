package sdesheet;

class Solution {
    public double myPow(double x, int n) {
       /*
        long N = n;
        double ans = 1;

        if (N < 0) {
            N = -N;
        }

        for (long i = 0; i < N; i++) {
            ans *= x;
        }

        if (n < 0) {
            ans = 1 / ans;
        }

        return ans;
        */
        long nn = n;
        double ans = 1;

        if (nn < 0) {
            nn = -nn;
        }
        while(nn>0){
            if(nn%2==1){
                ans=ans*x;
                nn=nn-1;
            }
            else{
                x=x*x;
                nn=nn/2;
            }
        }
       if(n<0){
        return (double)1.0/(double)ans;
       }
       return ans;

    }
}