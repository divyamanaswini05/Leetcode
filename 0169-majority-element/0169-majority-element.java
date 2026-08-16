class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int scount = 0;

        for(int num:nums){
            if(count==0){
                scount=num;

            }
            if(scount == num){
                count++;
            }
            else{
                count--;
            }
        }
        return scount;
    }
}