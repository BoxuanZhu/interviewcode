# @param {Integer} x
# @return {Integer}
def my_sqrt(x)
    if x == 1 || x == 0
        return x
    end
    start = 1
    last = x
    while(start + 1 < last)
        mid = (start + last)/2
        if mid*mid > x then last = mid else start = mid
        end
    end
    
    return start
    
        
end