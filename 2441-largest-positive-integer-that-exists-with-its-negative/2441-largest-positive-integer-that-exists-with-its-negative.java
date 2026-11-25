class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int min=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]== -nums[j] ){
                    min=nums[i];
                }
            }
        }
        return min;

    }
}