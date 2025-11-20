public class Solution {
    public int[] NumberOfLines(int[] widths, string s) {
        Dictionary<char, int> d = new Dictionary<char, int>();
        char ch = 'a';
        for(int i = 0; i < 26; i++){
            d[ch] = widths[i];
            ch++;
        }

        int[] ret = {1, 0};
        int sum = 0;
        for(int i = 0; i < s.Length; i++){
            if(sum + d[s[i]] > 100){
                ret[0]++;
                sum = 0;
            }

            sum += d[s[i]];
        }

        ret[1] = sum;
        return(ret);
    }
}
