public class Solution {
public int[] searchRange(int[] nums, int target) {
    int lo=0;
    int hi=nums.length-1;
    int[] range={-1,-1};
    int mid=-1;
    while (lo<=hi){
        mid = lo + (hi - lo)/2;
        if (target < nums[mid]) hi = mid -1;
        else if (target > nums[mid]) lo = mid + 1;
        else if (target == nums[mid]){
            range[0]=mid;range[1]=mid;
            while ((range[1] < nums.length-1) && nums[range[1]] == target) {
                if (nums[range[1]+1] == target) range[1]++;
                else break;
            }
            while (range[0] > 0 && nums[range[0]] == target) {
                if (nums[range[0]-1] == target) range[0]--;
                else break;
            }
            return range;
        }
    }
    return range;
}
}