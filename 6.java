public class Solution {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[numRows];
        for(int i = 0; i< sb.length; i++){
            sb[i] = new StringBuffer();
        }
        int i = 0;
        while(i<len){
           //vertically
           for(int idx = 0; idx < numRows && i < len; idx++){
               sb[idx].append(c[i]);
               i++;
           }
           //obliquely
           for(int idx = numRows-2; idx > 0 && i< len; idx--){
               sb[idx].append(c[i]);
               i++;
           }
        }
        
        for(int idx = 1; idx< sb.length; idx++){
            sb[0].append(sb[idx]);
        }
        return sb[0].toString();

        
    }
}