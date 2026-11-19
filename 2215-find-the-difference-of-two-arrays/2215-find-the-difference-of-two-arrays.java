class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int nums:nums1){
            set1.add(nums);
        }
        for(int nums:nums2){
            set2.add(nums);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int n:set1){
            if(!set2.contains(n)){
                list1.add(n);
            }
        }
        for(int n:set2){
            if(!set1.contains(n)){
                list2.add(n);
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(list1);
        res.add(list2);

        return res;
    }
}