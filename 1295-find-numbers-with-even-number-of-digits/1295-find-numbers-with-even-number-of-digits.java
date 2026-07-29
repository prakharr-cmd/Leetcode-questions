class Solution {
    public int findNumbers(int[] nums) {
        int c=0,d=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=0){
                int x=nums[i]%10;
                nums[i]/=10;
                c++;
            }
            if(c%2==0)
            d++;
            c=0;
        }
        return d;
    }
}