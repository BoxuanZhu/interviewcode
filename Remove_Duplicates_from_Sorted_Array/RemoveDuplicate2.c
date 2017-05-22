int removeDuplicates(int* nums, int numsSize) {
    int i = 2;
    int end = 1;
    if(numsSize<3)
        return numsSize;
    for(;i<numsSize; i++){
        if(nums[i] != nums[end - 1])
            nums[++end] = nums[i];
    }
    return end +1;
}