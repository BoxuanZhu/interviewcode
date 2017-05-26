# @param {Integer[]} nums
# @param {Integer} k
# @return {Integer}
def find_kth_largest(nums, k)
    r = nums.length  - 1
    return helper(nums, r-k+2, 0,r)
end

def helper(nums, k, p,r)
    #puts k
    if p == r
        return nums[p]
    end
    s = (p+r)/2
    q = partition(nums, p , r,s)
    #nums.each{|x|
    #    print x, " "
    #}
    #puts q
    if(k > q+1)
        helper(nums, k, q+1,r)
    elsif (k < q+1)
        helper(nums, k , p, q -1)
    else
        nums[q]
    end
end

def swap (nums, i , j)
    temp = nums[i]
    nums[i] = nums[j]
    nums[j] = temp
end

def partition (nums, p, r,s)
    pivot = nums[s]
    swap(nums, r,s)
    j = p -1
    i = p
    while (i < r)
        if(nums[i] <= pivot)
            j = j+1
            swap(nums,i , j)
        end
        i = i +1
    end
    j = j+1
    swap(nums, r, j)
    return j
end
    
    
    
    
    
    