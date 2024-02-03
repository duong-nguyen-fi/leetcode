# https://leetcode.com/problems/number-of-recent-calls/
#192 ms Beats 79.96% of users with Python3
# 22.42 MB Beats 53.45% of users with Python3

from collections import deque
class RecentCounter:
    
    def __init__(self):
        self.requests = deque()
        self.latest = 0

    def ping(self, t: int) -> int:
        if len(self.requests) > 0:
            self.latest = self.requests[len(self.requests)-1]
        if  t-self.latest > 3000:
            self.requests.clear()
        self.requests.append(t)
        while (self.requests[0] < t-3000):
            self.requests.popleft()
        return len(self.requests)


# Your RecentCounter object will be instantiated and called as such:
# obj = RecentCounter()
# param_1 = obj.ping(t)
