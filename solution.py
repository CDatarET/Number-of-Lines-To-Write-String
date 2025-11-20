class Solution:
    def numberOfLines(self, widths, s):
        d = {}
        ch = "a"
        for w in widths:
            d[ch] = w
            ch = chr(ord(ch) + 1)
        
        ret = [1, 0]
        sm = 0
        for c in s:
            if sm + d[c] > 100:
                ret[0] += 1
                sm = 0
            
            sm = sm + d[c]
        ret[1] = sm
        
        return(ret)
