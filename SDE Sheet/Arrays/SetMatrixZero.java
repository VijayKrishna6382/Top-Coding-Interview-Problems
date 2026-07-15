package sdesheet;

/*class Solution {
public void setZeroes(int[][] m) {
    int r=m.length;
    int c=m[0].length;
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(m[i][j]==0){
                row(i,r,c,m);
                col(j,r,c,m);
            }
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(m[i][j]==182645){
                m[i][j]=0;
            }
            System.out.print(m[i][j]+" ");
        }
        System.out.println();
    }
}
public static void row(int i,int r,int c,int[][] m){
    for(int j=0;j<c;j++){
        if(m[i][j]!=0){
        m[i][j]=182645;
        }
    }
}
public static void col(int j,int r,int c,int[][] m){
    for(int i=0;i<r;i++){
        if(m[i][j]!=0){
        m[i][j]=182645;
        }
    }

}
}
*/


/*
class Solution {
public void setZeroes(int[][] m) {
    int r=m.length;
    int c=m[0].length;
   int[] row=new int[r];
   int[] col=new int[c];
   for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        if(m[i][j]==0){
            row[i]=1;
            col[j]=1;
        }
    }
   }
   for(int i=0;i<r;i++){
       for(int j=0;j<c;j++){
           if(row[i]==1||col[j]==1){
            m[i][j]=0;
           }
       }
       }
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(m[i][j]+" ");
        }
        System.out.println();
       }
    }
   }
*/
class Solution {
public void setZeroes(int[][] m) {
      int r=m.length;
      int c=m[0].length;
      int col0=1;
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
           
            if(m[i][j]==0){
                m[i][0]=0;
                if(j!=0){
                m[0][j]=0;
                }
                else{
                    col0=0;
                }
            }
        }
      }
      for(int i=1;i<r;i++){
        for(int j=1;j<c;j++){
            if(m[i][j]!=0){
            if(m[i][0]==0||m[0][j]==0){
                m[i][j]=0;
            }
            }
        }
      }
      if(m[0][0]==0){
        for(int i=0;i<c;i++){
            m[0][i]=0;
        }
      }
      if(col0==0){
        for(int i=0;i<r;i++){
            m[i][0]=0;
        }
      }
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(m[i][j]+" ");
        }
        System.out.println();
      }
}
}

