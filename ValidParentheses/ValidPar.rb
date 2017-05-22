# @param {String} s
# @return {Boolean}
def is_valid(s)
    st = []
    line = s.split("")
    line.each{|x|
        if (x =~ /[{\(\[]/) != nil
            st.push x
        else
            if (st.empty?) || (((st.pop + x) =~ /^(\(\))?({})?(\[\])?$/) == nil)# without ^ and $ would read empty string
                return false
            end
        end
    }
    st.empty?
end