package sdesheet;

public class Second_largest_element {

	public static void main(String[] args) {
		int i=0;
        int n=nums.length;
        int lar=nums[0];
        int seclar=0;
        for(int i=1;i<n;i++){
            if(nums[i]>lar){
                seclar=lar;
                lar=nums[i];
            }
            else if(nums[i]>seclar && nums[i]<lar){
                seclar=nums[i];
            }
        }
        return seclar;

	}

}
