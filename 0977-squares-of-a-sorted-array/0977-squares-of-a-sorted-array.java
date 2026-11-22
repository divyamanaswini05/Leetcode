class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] list = new int[nums.length];
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            res.add(nums[i]*nums[i]);
        }
        Collections.sort(res);
        for(int i=0;i<nums.length;i++){
            list[i] = res.get(i);
        }
        return list;

    }
}