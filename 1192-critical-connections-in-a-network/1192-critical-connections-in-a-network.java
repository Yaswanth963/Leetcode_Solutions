class Solution {
    List<List<Integer>> bridges;
    int tin[];
    int low[];
    List<List<Integer>> graph;
    int time;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        bridges = new ArrayList<>();
        graph = new ArrayList<>();
        tin = new int[n];
        low = new int[n];
        boolean visited[]= new boolean[n];
        constructGraph(n,connections);
        time = 0;
        dfs(0,visited,-1);
        return bridges;
    }
    
    void constructGraph(int n, List<List<Integer>> connections){
        for(int i=0;i<n;i++)
            graph.add(new ArrayList<>());
        for(List<Integer> edge:connections){
            graph.get(edge.get(0)).add(edge.get(1));
            graph.get(edge.get(1)).add(edge.get(0));
        }
            
    }
    
    void dfs(int node,boolean visited[],int par){
       visited[node] = true;
        tin[node]=low[node]=time++;
        for(Integer child:graph.get(node)){
            if(child==par) continue;
            if(!visited[child]){
                dfs(child,visited,node);
                low[node] = Math.min(low[node],low[child]);
                if(low[child]>tin[node])
                    bridges.add(List.of(node,child));
            }
            else{
                low[node] = Math.min(low[node],low[child]);
            }
        }
    }
}
