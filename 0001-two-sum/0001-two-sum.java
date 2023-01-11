class Solution {
public int[] twoSum(int[] nums,int target){
//     HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
//    for(int i=0;i<nums.length;i++){
//        int complement=target-nums[i];
// if(map.containsKey(complement)){
//     return new int[]{
// map.get(complement),i};
//                      }
//                     else{
//                         map.put(nums[i],i);
//                     }
//                      }
//                      throw new IllegalArgumentException("No two sum solution");
//                      }
//                      }
    int[] ans = new int[2];
    for(int i=0;i<nums.length-1;++i){
         for(int j=i+1;j<nums.length;++j){
             if(nums[i]+nums[j]==target){
ans[0]=i;
             ans[1]=j;
             break;
             }
         }
}
             return ans;
             }
         }
//         int[] result = new int[2];
//     Map map = new HashMap();
//     for(int i=0;i<numbers.length;i++){
// if(!map.containsKey(target-numbers[i])){
//     map.put(numbers[i],i);
// }else{
//     result[1]=i;
//     result[0]=map.get(target-numbers[i]);
// }
//     }
//     return result;
// }
// }

       