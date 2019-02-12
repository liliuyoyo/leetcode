import java.util.*;

public class evaluate_division {
    public static double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        HashMap<String, HashMap<String, Double>> graph = new HashMap<>();
        for(int i=0;i<equations.length;i++){
            String[] e = equations[i];
            double val = values[i];
            if(e[0].equals(e[1])) continue;
            if(!graph.containsKey(e[0])) graph.put(e[0], new HashMap<String,Double>());
            if(!graph.containsKey(e[1])) graph.put(e[1], new HashMap<String,Double>());
            graph.get(e[0]).put(e[1],values[i]);
            graph.get(e[1]).put(e[0],1/values[i]);
        }

        double[] res = new double[queries.length];
        for(int i=0; i<queries.length;i++){
            String[] q = queries[i];
            res[i] = dfs(graph,q[0],q[1],new HashSet<String>());
        }
        return res;
    }

    public static double dfs(HashMap<String,HashMap<String,Double>> graph,String start, String dest,HashSet<String> visited){
        if(!graph.containsKey(start) || !graph.containsKey(dest) || visited.contains(start)) return -1.0;
        if(start.equals(dest)) {
            visited.add(dest);
            return 1.0;
        }
        visited.add(start);
        double res = 0;
        for(String s: graph.get(start).keySet()){
            if(visited.contains(dest)) break;
            res = graph.get(start).get(s) * dfs(graph,s,dest,visited);
        }
        return res;
    }

    public static void main(String[] args) {
        String[][] equations = {{"a","b"},{"e","f"},{"b","e"}};
        double[] values = new double[]{3.4,1.4,2.3};
        String[][] queries = {{"b","a"},{"a","f"}};
        double[] res = calcEquation(equations,values,queries);
        for(double d:res){
            System.out.println(d);
        }

    }
}
