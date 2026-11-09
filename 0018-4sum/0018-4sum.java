class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int l=j+1;
                int h=n-1;

                while(l<h){
                long sum = (long)nums[i]+nums[j]+nums[l]+nums[h];
                if(sum == target){
                    res.add(Arrays.asList(nums[i],nums[j],nums[l],nums[h]));
                    while(l<h && nums[l]==nums[l+1]){
                        l++;
                    }
                    while(l<h && nums[h]==nums[h-1]){
                        h--;
                    }
                    l++;
                    h--;
                }
                else if(sum<target){
                    l++;
                }
                else{
                    h--;
                }
            }
            }
           
            
        }
        return res;
            
    }
}