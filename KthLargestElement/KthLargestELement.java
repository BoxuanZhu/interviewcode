public class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length < 0)
            return 0;
        //System.out.println(nums.length - k +1);
        //since it's the k largest, quick sort sorts everything in front, hence do nums.length - k +1 to transfer to k smallest
        return helper(nums, nums.length - k +1, 0, nums.length - 1);
        
    }
    
    private int helper(int nums[], int k, int p, int r){
        //if(p == r)
          //  return nums[p];
        int s = (p + r)/2;// randomize a pivot position
        int q = partition(nums, p,r,s);
       // System.out.println("q is "+q);
        if(k < q+1)
            return helper(nums, k, p, q-1);
        else if (k > q+1)
            return helper(nums, k, q+1, r);
        else
            return nums[q];
    }
    private void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private int partition (int[] nums, int p, int r, int s){
        int pivot = nums[s];
        swap(nums, r,s);
        int j = p -1;
        for(int i = p; i < r; i ++){
            if(nums[i] <= pivot){
                j = j+1;
                swap(nums, j, i);
            }
        }
        swap(nums, j+1, r);
        //for(int x: nums)
          //  System.out.println(x);
        //System.out.println("j+1 is "+ (j+1)+" pivot is "+ pivot);
        return j+1;
        
    }
}