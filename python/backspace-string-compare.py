# https://leetcode.com/problems/backspace-string-compare
# 27 ms Beats 96.73% of users with Python3
# 16.57 MB Beats 62.52% of users with Python3


from collections import deque
class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        return self.backspace(s) == self.backspace(t)


    def backspace(self, s: str) -> str:
        stack = deque()
        for char in s:
            if char != "#":
                stack.append(char)
            elif len(stack) > 0: stack.pop()
        if len(stack) == 0 : return ""
        return ''.join(list(stack))       
