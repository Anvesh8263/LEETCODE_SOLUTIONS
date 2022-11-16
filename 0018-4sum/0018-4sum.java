class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        long t = (long) target;
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-3; i++){
            for(int j=i+1; j<n-2; j++){
                int k = j+1;
                int l = n-1;
                while(k<l){
                    long sum = (long) nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==t){
                        set.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                    }else if(sum<t){
                        k++;
                    }else{
                        l--;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}