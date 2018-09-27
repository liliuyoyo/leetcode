import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class subdomain_visit_count {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String s:cpdomains){
            String[] ss = s.split(" ");
            int value = Integer.parseInt(ss[0]);
            String subString = ss[1];
            if(! map.containsKey(subString)){
                map.put(subString,value);
            }else{
                map.put(subString,map.get(subString)+value);
            }
            for(int i=0; i<subString.length(); i++){
                String subSubString = "";
                if(subString.charAt(i)=='.'){
                    subSubString = subString.substring((i+1));
                    if(! map.containsKey(subSubString)){
                        map.put(subSubString,value);
                    }else{
                        map.put(subSubString,map.get(subSubString)+value);
                    }
                }
            }
        }
        List<String> result = new ArrayList<>();
        for(String k:map.keySet()){
            StringBuilder sb = new StringBuilder();
            sb.append(map.get(k));
            sb.append(" ");
            sb.append(k);
            result.add(sb.toString());
        }
        return result;
    }
}
