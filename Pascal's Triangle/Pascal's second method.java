//print rows
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
       ArrayList<Integer> list=new ArrayList<>();
       list.add(1);
       int ans=1;
       for(int i=1;i<r;i++){
           ans=ans*(r-i);
           ans=ans/i;
           list.add(ans);
       }
       for(int i=0;i<r;i++){
           System.out.print(list.get(i)+" ");
       }
      
       
    }
   
}