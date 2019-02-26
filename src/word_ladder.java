import java.util.*;

public class word_ladder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {

        if(!wordList.contains(endWord)) return 0;

        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int distance = 0;

        while(!q.isEmpty()){
            String curWord = q.remove();
            if(curWord.equals(endWord)) return distance;
            char[] charArray = curWord.toCharArray();
            boolean added = false;
            for(int i=0; i<charArray.length; i++){
                for(char ch='a'; ch < 'z'; ch++) {
                    charArray[i] = ch;
                    String newWord = String.valueOf(charArray);
                    if (!newWord.equals(curWord) && wordList.contains(newWord)) {
                        added = true;
                        q.add(newWord);
                        wordList.remove(newWord);
                    }
                }
                charArray = curWord.toCharArray();
            }
            if(added){
                distance++;
                added = false;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        String[] arr = {"hot","dot","dog","lot","log","cog"};
        int result = ladderLength("hit","cog", new ArrayList<String>(Arrays.asList(arr)));
        System.out.print(result);
    }
}
