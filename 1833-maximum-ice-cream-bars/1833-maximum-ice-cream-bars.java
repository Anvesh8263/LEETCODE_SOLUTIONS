class Solution {
    public int maxIceCream(int[] costs, int coins) {
        //O(nlogn) approch;
        Arrays.sort(costs);
        int count=0;
        for(int i=0;i<costs.length;i++){
            if(costs[i]<=coins){
                count++;
                coins-=costs[i];
            }
            else{
                return count;
            }
        }
        return count;
    }
}