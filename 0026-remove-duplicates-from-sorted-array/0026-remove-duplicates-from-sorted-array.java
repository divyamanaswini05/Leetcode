class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set =new LinkedHashSet<>();
        int count=0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int x:set){
            nums[index]=x;
            count++;
            index++;
        }
        return count;
    }
}