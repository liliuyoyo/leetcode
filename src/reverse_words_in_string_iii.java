public class reverse_words_in_string_iii {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuffer buff= new StringBuffer();
        for(int j=0;j<arr.length;j++){
            StringBuilder sb = new StringBuilder();
            for(int i=arr[j].length()-1; i>=0;i--){
                sb.append(arr[j].charAt(i));
            }
            buff.append(sb.toString());
            if(j != arr.length-1){
                buff.append(" ");
            }
        }
        return buff.toString();
    }
}
