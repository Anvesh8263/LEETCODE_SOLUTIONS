class Solution {
    public void rotate(int[] nums, int k) {
//         int[] ans=new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             ans[(i+k)%nums.length]=nums[i];
//         }
//         for(int i=0; i<ans.length; i++){
//             nums[i]=ans[i];
//         }
//     }
// }
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    private void reverse(int[] nums,int start,int end){
        while(start<end){
            int tmp = nums[start];
            nums[start]=nums[end];
            nums[end]=tmp;
            start++;
            end--;
        }
    }
}
