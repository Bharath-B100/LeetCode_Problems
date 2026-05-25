# Last updated: 5/25/2026, 11:15:32 AM
class Solution(object):
    def isAnagram(self, s, t):
        return sorted(s)==sorted(t)
        