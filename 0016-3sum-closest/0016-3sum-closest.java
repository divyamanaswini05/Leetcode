class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        int closest = nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int i = 0;i < n;i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int l = i+1;
            int r = n-1;
            while(l < r){
                sum = nums[i] + nums[l] + nums[r];
                if(Math.abs(target-sum)<Math.abs(target-closest)){
                    closest = sum;
                }
                if(sum<target){
                    l++;
                }
                else if (sum>target){
                    r--;
                }
                else{
                    return sum;
                }
            }
        }
        return closest;
    }
}