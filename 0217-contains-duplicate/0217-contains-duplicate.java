class Solution {
    public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
        
//         for(int i=1; i<nums.length; i++){
//             if(nums[i] == nums[i-1]) return true;
//         }
//         return false;
        Map<Integer, Integer> hash = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hash.containsKey(nums[i])){
                return true;
            }
            else{
                hash.put(nums[i], 1);
            }
        }
        return false;
    }
}