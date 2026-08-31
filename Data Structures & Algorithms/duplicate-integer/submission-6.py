class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        dupe = {}
        for i in range(len(nums)):
            if nums[i] not in dupe:
                dupe[nums[i]]=1
            elif nums[i] in dupe:
                return True
        return False