class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
//         int n=nums.length;
//         int c=0;
//         int m = 0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==1){
//                 c++;
//             }
//             else{
//                  m=Math.max(c,m);
//                 c=0;
//         }
//     }
//     m=Math.max(c,m);
//     return m;
// }
// }
    
        int max = 0;
        int current_number_of_ones=0;
        
        for(int i=0;i<nums.length;i++){
           if(nums[i]==1){
        current_number_of_ones +=1;
               max=Math.max(max,current_number_of_ones);
           }else{
               current_number_of_ones=0;
           }
            
        }
        return max;
    }
}