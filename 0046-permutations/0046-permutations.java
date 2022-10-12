class Solution {
public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> al = new ArrayList<>();
		
        generate(nums, 0, nums.length-1, al);
        return al;    
    }


static void generate(int a[], int i, int l, List<List<Integer>> al)
    {
        if(i==l)
        {
            ArrayList<Integer> cl = new ArrayList<>();
		
            for(int x: a)
            {
                cl.add(x);
            }
            al.add(cl); 
        }
        else
        {
            for(int j = i; j<=l; j++) 
            {
                a = swap(a, i, j);
                generate(a, i+1, l, al); 
                a = swap(a, j, i); 
            }
            
        }
    }
	
	static int[] swap(int a[], int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j]= temp;
        return a;
    }
}