int removeDuplicates(int* nums, int numsSize) {
    int * index = nums, i, count = 0;
    for (i = 1; i < numsSize; i++){
        if(nums[i] != index[count]){
            index[count +1] = nums[i];
            count ++;
        }
    }
    
    return numsSize == 0 ? 0 :count + 1; //if it was empty array return 0 instead
}