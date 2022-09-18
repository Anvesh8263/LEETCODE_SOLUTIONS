class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length+nums2.length;
        
        if(length%2 == 1) {
            return kth(nums1, nums2, length/2, 0, Math.min(nums1.length-1,length/2), 0, Math.min(nums2.length-1,length/2));
        }
        return (kth(nums1, nums2, length/2, 0, Math.min(nums1.length-1,length/2), 0, Math.min(nums2.length-1,length/2)) + 
                kth(nums1, nums2, length/2-1, 0, Math.min(nums1.length-1,length/2-1), 0, Math.min(nums2.length-1,length/2-1)))
                /(double)2;
    }
    
    public int kth(int[] nums1, int[] nums2, int k, int l1, int r1, int l2, int r2) {
        while(k > 1 && l1 <= r1 && l2 <= r2) {
            int mid1 = l1 + (r1-l1)/4;
            int mid2 = l2 + (r2-l2)/4;
            if(nums1[mid1] < nums2[mid2]) {
                k -= (mid1-l1+1);
                l1 = mid1+1;
            }
            else if(nums1[mid1] > nums2[mid2] || nums1[l1] > nums2[l2]) {
                k -= (mid2-l2+1);
                l2 = mid2+1;
            }
            else {
                k -= (mid1-l1+1);
                l1 = mid1+1;
            }
            
            r1 = Math.min(r1, l1+k);
            r2 = Math.min(r2, l2+k);
        }
        
        if(l1 > r1) {
            return nums2[l2+k];
        }
        else if(l2 > r2) {
            return nums1[l1+k];
        }
        
        if(k == 0) {
            return Math.min(nums1[l1], nums2[l2]);
        }
        
        List<Integer> list = new ArrayList<>();
        list.add(nums1[l1]);
        list.add(nums2[l2]);
        if(l1+1 <= r1) {
            list.add(nums1[l1+1]);
        }
        if(l2+1 <= r2) {
            list.add(nums2[l2+1]);
        }
        Collections.sort(list);
        return list.get(1);
    }
}