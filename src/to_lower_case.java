public class to_lower_case {
    public String toLowerCase(String str) {
        StringBuilder temp = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char x = str.charAt(i);
            if(x >= 'A' && x <= 'Z' ){
                temp.append((char)(x-'A'+'a'));
            }else{
                temp.append(x);
            }
        }
        return temp.toString();
    }
}
