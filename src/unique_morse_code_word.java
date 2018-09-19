import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class unique_morse_code_word {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] A = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
                ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] B= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q",
                "r","s","t","u","v","w","x","y","z"};
        Map<String,String> morse = new HashMap<String,String>();
        for(int i=0; i<26;i++){
            morse.put(B[i],A[i]);
        }

        HashSet<String> ans = new HashSet<String>();
        for(String word:words){
            String trans="";
            for(int i=0;i<word.length();i++){
                trans += morse.get(word.charAt(i)+"");
            }
            ans.add(trans);
        }
        return ans.size();
    }

    public static void main(String[] args) {
       int result= uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"});
       System.out.println(result);
    }
}

