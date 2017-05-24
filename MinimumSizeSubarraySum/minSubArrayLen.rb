# @param {Integer} s
# @param {Integer[]} nums
# @return {Integer}
def min_sub_array_len(s, nums)
    len = nums.length+1
    j = 0
    sum = 0# delcare on seperate lines
    nums.each_index{|i|
        sum += nums[i]
        while sum >= s && j <= i 
            len = len >= i - j+1? i-j+1:len
            sum -= nums[j]
            j += 1# ruby does not have ++
        end
    }
    len == nums.length+1? 0:len
end
