void sortColors(int* nums, int numsSize) {
    int left, right, tmp, i;
    i = 0;
    left = 0;
    right = numsSize -1;
    if(numsSize <= 1)
        return;
    while(i <= right){// when i = right, the array is sorted
        if(nums[i] == 0){
            tmp = nums[left];
            nums[left++] = nums[i];
            nums[i++] = tmp;
        }
        else if(nums[i] == 2){
            tmp = nums[right];
            nums[right--] = nums[i];
            nums[i] = tmp;
        }
        else
            i++;
    }
}