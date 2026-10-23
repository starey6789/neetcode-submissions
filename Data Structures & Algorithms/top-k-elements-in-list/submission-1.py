class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}

        countInstances = [[] for i in range(len(nums) + 1)]
        for num in nums:
            count[num] = count.get(num, 0) + 1

        for num, c in count.items():
            countInstances[c].append(num)
        
        result = []
        for i in range(len(countInstances)-1, 0, -1):
            for n in countInstances[i]:
                result.append(n)
                if (len(result) == k):
                    return result
