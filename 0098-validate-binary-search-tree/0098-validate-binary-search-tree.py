# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        def helper(node, min_val, max_val):
            if not node:
                return True

            if not (min_val < node.val < max_val):
                return False
            left_is_bst = helper(node.left, min_val, node.val)
            right_is_bst = helper(node.right, node.val, max_val)

            return left_is_bst and right_is_bst

        return helper(root, float('-inf'), float('inf'))