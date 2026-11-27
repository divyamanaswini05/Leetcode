class Solution {
    public int[] applyOperations(int[] nums) {
        int left=0;
        int right=1;
        while(right<nums.length){
            if(nums[left]==nums[right]){
                nums[left] = 2*nums[left];
                nums[right]=0;
                left++;
                right++;
            }
            else{
                left++;
                right++;
            }
        }

        int l= 0;
        int r=1;
        while(r<nums.length){
            if(nums[l]!=0){
                l++;
                r++;
            }
            else if(nums[r]==0){
                r++;
            }
            else{
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
                r++;
            }

        }
        return nums;
    }
}