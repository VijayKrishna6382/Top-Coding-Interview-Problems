package sdesheet;

/*///they give row and column and we have to find the elemnt present on that place.
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int res=1;
		int i=1;
		while(c>0){
		    res=res*r;
		    res=res/(i);
		    c--;
		    r--;
		    i++;
		}
		System.out.print(res);
	}
}
*/



//code to generate nth row.
/*
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList<>();
        ans.add(1);
        long res=1;
        rowIndex++;;
        for(int i=1;i<rowIndex;i++){
            res=res*(rowIndex-i);
            res=res/i;
            ans.add((int)res);
        }
        return ans;
    }
}

*/


//we have generate entire pascals triangle.
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> totans=new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
              List<Integer> ans=new ArrayList<>();
              totans.add(nthrow(i,ans,totans));
              
        }
        return totans;
    }
    public static List<Integer> nthrow(int row,List<Integer> ans,List<List<Integer>> totans){
            long res=1; 
            ans.add(1);   
            row++;
            for(int i=1;i<row;i++){
            res=res*(row-i);
            res=res/i;
            ans.add((int)res);
        }
        
        
        
        return ans;

    }
}