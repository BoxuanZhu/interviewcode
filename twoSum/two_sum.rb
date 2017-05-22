def two_sum(nums, target)
    map = nums.map{|x| target - x}
    i = 0
    while i < nums.length
        if nums.index[ map[i]] != nil
            result = [nums.index[map[i]] , i]
            return result
        end
    end
end