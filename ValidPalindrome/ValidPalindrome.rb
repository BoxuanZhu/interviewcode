# @param {String} s
# @return {Boolean}
def is_palindrome(s)
    arr = s.scan(/[a-zA-Z0-9]/)
    if arr.empty?
        return true
    end
    s1 = arr.reverse
    i = 0
    arr.each{|x|
        if x.upcase != s1[i].upcase
            return false
        end
        i = i + 1
    }
    return true
end