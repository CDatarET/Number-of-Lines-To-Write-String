class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char ch = 'a';
        for(int i = 0; i < 26; i++){
            map.put(ch, widths[i]);
            ch++;
        }

        int[] ret = {1, 0};
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if(sum + map.get(s.charAt(i)) > 100){
                ret[0]++;
                sum = 0;
            }

            sum += map.get(s.charAt(i));
        }

        ret[1] = sum;
        return(ret);
    }
}
