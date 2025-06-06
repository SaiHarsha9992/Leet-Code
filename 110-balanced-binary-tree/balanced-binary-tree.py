# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        def dfs(node):
            if not node: return 0, True
            lh, lb = dfs(node.left)
            rh, rb = dfs(node.right)
            return 1 + max(lh, rh), lb and rb and abs(lh - rh) <= 1
        return dfs(root)[1]
        