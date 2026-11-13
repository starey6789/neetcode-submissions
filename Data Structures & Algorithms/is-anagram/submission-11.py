class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if(not len(s) == len(t)):
            return False

        hm = {}
        for i in s:
            hm[i] = hm.get(i, 0) + 1
        
        print(hm)
        for i in t:
            if ((i in hm) and (not hm.get(i) == 0)):
                hm[i] = hm.get(i) - 1
            else:
                return False

        return True
