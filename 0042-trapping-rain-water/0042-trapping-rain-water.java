class Solution {
    public int trap(int[] height) {
      int l[]=new int[height.length];
      int r[]=new int[height.length];
      int maxW=0;
      l[0]=height[0];
      for(int i=1;i<l.length;i++){
          l[i]=Math.max(l[i-1],height[i]);
      }  
      r[r.length-1]=height[height.length-1];
      for(int i=r.length-2;i>=0;i--){
          r[i]=Math.max(r[i+1],height[i]);
      }
      for(int i=0;i<height.length;i++){
          int wl=Math.min(l[i],r[i]);
          maxW+=wl-height[i];
      }
      return maxW;
    }
}