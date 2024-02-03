#https://leetcode.com/problems/time-needed-to-buy-tickets
#52 ms Beats 40.71% of users with Python3
#16.60 MB Beats 61.26% of users with Python3
from collections import deque
class Solution:
    def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
        line = deque(range(len(tickets)))
        timer = 0

        while (tickets[k] > 0):
            if (tickets[line[0]]) <= 0:
                line.popleft()
            else:
                tickets[line[0]] -= 1
                #print(str(line[0]) + "-" + str(tickets[line[0]]))
                line.append(line.popleft())
                timer +=1

        return timer
