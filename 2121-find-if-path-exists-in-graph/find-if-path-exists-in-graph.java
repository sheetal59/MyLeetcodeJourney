class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i=0; i<n; i++){
            graph[i] = new ArrayList<Integer>();
        }
        for(int i=0;i<edges.length;i++){
            graph[edges[i][0]].add(edges[i][1]);
            graph[edges[i][1]].add(edges[i][0]);
        }
        return hasPath(graph, source, destination, new boolean[n]);
    }
    boolean hasPath(ArrayList<Integer>[]graph, int src, int dest, boolean vis[]){
        if(src==dest){
            return true;
        }
        vis[src]= true;
        for(int i: graph[src]){
            if(!vis[i] && hasPath(graph,i, dest, vis)){
                return true;
            }
        }
        return false;
    }

}