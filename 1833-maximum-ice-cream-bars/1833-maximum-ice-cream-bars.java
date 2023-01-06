class Solution {
    public int maxIceCream(int[] costs, int coins) {
        //O(nlogn) approch;
        // Arrays.sort(costs);
        // int count=0;
        // for(int i=0;i<costs.length;i++){
        //     if(costs[i]<=coins){
        //         count++;
        //         coins-=costs[i];
        //     }
        //     else{
        //         return count;
        //     }
        // }
        // return count;
        
        int count=0;
        int max=0;
        for(int i=0;i<costs.length;i++){
            if(max<costs[i]){
                max=costs[i];
            }
        }
        int freq[]=new int[max+1];
        for(int i=0;i<costs.length;i++){
            freq[costs[i]]++;
        }
        for(int i=1;i<max+1;i++){
            if(freq[i]!=0 && i*freq[i]<=coins){
                count+=freq[i];
                coins-=i*freq[i];
            }
            else if(freq[i]!=0 && coins>=i){ 
                for(int j=1;j<=freq[i];j++){
                    if(coins>=i){
                        count++;
                        coins-=i;
                    }
                }
            }
            else if(coins<i){
                return count;
            }
        }
        return count;
        
    }
}