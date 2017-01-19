public class Solution {
    public int reverse(int x) {
        if(x > 0){
            String xx = Integer.toString(x);
            return reverseStr(xx);
        }else{
            String xx = Integer.toString(0-x);
            return (0 - reverseStr(xx));
        }
        
    }
    public int reverseStr(String str){
        String resultStr = "";
        for (int i = str.length() - 1; i >= 0; i--){
            resultStr += str.charAt(i);
        }
        int result=0;
        try {
            result = Integer.parseInt(resultStr);
        }catch(NumberFormatException e){
            System.out.print("not number");
        }
        return result;
    }
}