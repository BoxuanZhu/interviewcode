# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

class BSTIterator
    # @param {TreeNode} root
    def initialize(root)
        @next = root
        @stack = []
    end

    # @return {Boolean}
    def has_next
        if(@next != nil)
            addToStack(@next)
            @next = nil
        end
        return !@stack.empty?
    end

    # @return {Integer}
    def next
        if (!has_next)
            return -1
        end
        cur = @stack.pop
        @next = cur.right
        return cur.val
        
    end
    def addToStack (node)
        while(node != nil)
            @stack.push node
            node = node.left
        end 
    end

end

# Your BSTIterator will be called like this:
# i, v = BSTIterator.new(root), []
# while i.has_next()
#    v << i.next
# end