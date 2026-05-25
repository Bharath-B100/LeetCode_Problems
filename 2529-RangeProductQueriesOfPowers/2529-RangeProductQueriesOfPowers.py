# Last updated: 5/25/2026, 11:10:22 AM
class Solution:
    def productQueries(self, n: int, q: List[List[int]]) -> List[int]:
        p = [1<<i for i in range(31) if 1<<i&n]
        return [prod(p[l:r+1])%(10**9+7) for l,r in q]