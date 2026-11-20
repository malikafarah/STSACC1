
class Hamiltonian{
    static boolean check(int[][] graph, int[] path, int n){
        for (int i = 0; i < n-1; i++) {
            if(graph[path[i]][path[i+1]]==0) return false; 
        }

        if(graph[path[n-1]][path[0]]==0) return false;
        
        return true;
    }

    static boolean solve(int[][] graph, int[] path, boolean[] visited, int index, int n){
        if (index == n) {

            if (check(graph, path, n)) {
                for (int i = 0; i < n; i++)
                    System.out.print(path[i] + " ");

                System.out.println(path[0]);
                return true;
            }

            return false;
        }

        for(int i=1; i<n; i++){
            if(!visited[i]){
                path[index] = i;
                visited[i] = true;

                if(solve(graph, path, visited, index+1, n)) return true;
                visited[i] = false;
            }
        }
        return false;
    }
}