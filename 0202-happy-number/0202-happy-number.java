class Solution {
    public boolean isHappy(int n) {
//         List<Integer> arr =new ArrayList<Integer>();
//         while(n!=1)
//         {
//             int temp = n;
//             n=0;
//             while(temp>0)
//             {
//                 n=n + (int)Math.pow((temp%10),2);
//                 temp = temp/10;
//             }
//             if(arr.contains(n))
//             {
//                 return false;
//             }
//             else
//             {
//                 arr.add(n);
//             }
//         }
//         return true;
//         }
// }
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) { 
            seen.add(n);
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
