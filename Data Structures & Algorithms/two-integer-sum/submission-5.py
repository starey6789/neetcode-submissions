class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        result = []
        for i in range(len(nums)):
            r = target - nums[i]
            rp = len(nums) - 1

            while (i < rp):
                if nums[rp] == r:
                    result = [i, rp]
                    return result
                
                rp -= 1
            

        return result