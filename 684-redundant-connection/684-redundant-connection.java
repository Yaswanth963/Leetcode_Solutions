class Solution {
    int par[];
    int rank[];
    public int[] findRedundantConnection(int[][] edges) {
        int len = edges.length;
        par = new int[len+1];
        rank = new int[len+1];
        for(int i=0;i<=len;i++)
            par[i]=i;
        for(int edge[]:edges){
            int u = edge[0];
            int v = edge[1];
            if(getPar(u) == getPar(v))
                return new int[]{u,v};
            else
                union(u,v,par);
        }
        return new int[]{-1,-1};
    }
    
    void union(int u, int v,int par[]){
        u=getPar(u);v=getPar(v);
        if(rank[u]<rank[v]){
            par[u]=par[v];
            rank[v]++;
        }else if(rank[u]>rank[v]){
            par[v]=par[u];
            rank[u]++;
        }
        else{
            par[u]=par[v];
            rank[v]++;
        }
    }
    
    int getPar(int i){
        while(par[i]!=i){
            i=par[i];
        }
        return i;
    }
}