class Solution {
    public int numIdenticalPairs(int[] nums) {
        int arr[] = new int[101];
        int count = 0;
        for(int num:nums){
            count +=arr[num]++;
            
        }
        return count;
    }
}