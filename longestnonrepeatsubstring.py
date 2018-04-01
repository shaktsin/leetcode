class Solution:

    def __init__(self):
        self.hash_table = dict()

    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        # max_len keeps length of max length non repeating substring
        # first_pointer - start point of non repeating string
        if len(s) is 0: return 0

        max_len, first_pointer = 0, 0
        for _index, ch in enumerate(s):
            if ch in self.hash_table and self.hash_table[ch] >= first_pointer:
                first_pointer = self.hash_table[ch] + 1
                #print(first_pointer)
            self.hash_table[ch] = _index
            _len = (_index - first_pointer)+1
            max_len = _len if _len > max_len else max_len
        return max_len

s = Solution()
# testing
print(s.lengthOfLongestSubstring('pwwkew'))
#print(s.lengthOfLongestSubstring('bbbbb'))
#print(s.lengthOfLongestSubstring('abcabcdebb'))
#print(s.lengthOfLongestSubstring('abba'))
