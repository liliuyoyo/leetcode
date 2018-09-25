public class reverse_string {
    /*class Solution {
        public String reverseString(String s) {
            StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString();
        }
    }*/

    /*public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }*/

    public String reverseString(String s) {
        char[] ss = s.toCharArray();
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            char tmp = ss[i];
            ss[i]=ss[j];
            ss[j]=tmp;
        }
        return new String(ss);
    }
}

