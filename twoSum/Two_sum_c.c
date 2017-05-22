int* twoSum(int* nums, int numsSize, int target) {
    int * result = malloc(2*sizeof(int) );
    //int * dummy = calloc(1000, sizeof(int) );
    int i, j, flag = 0;
    for (i = 0; i < numsSize - 1 && flag == 0; i ++){
        for(j = i + 1; j <numsSize && flag == 0; j++){
            if(target - nums[i] == nums[j]){
                result[0] = i;
                result[1] = j;
                flag = 1;
            }
        }
    }
    /*mapping does not work since the numbers inside array can be negative*/
   /* temp = target - nums[result[1]];
    //printf("result[1] = %d, temp = %d\n", result[1], temp);
    for (i = 0 ; i < numsSize && flag == 0; i ++){
        if(nums[i] == temp){
            result[0] = i;
            //printf("i =  %d, nums[i]= %d\n", i, nums[i]);
            flag = 1;
        }
    }
    //printf("result[0] = %d, result[1]= %d\n", result[0], result[1]);
    //free(dummy);*/
    return result;
}