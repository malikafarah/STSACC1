import java.util.*;

public class Hamiltonian {
    void findHamiltonianCycle(int[][] g){
        int n = g.length;
        int[] path = new int[n+1];
        Arrays.fill(path, -1);
        boolean[] visited = new boolean[n];

        path[0] = 0;
        visited[0] = true;

        if(!solve(g, path, visited, 1)){
            System.out.println("No solution");
            return;
    

        path[n] = 0;
        System.out.println("Solution found");
        System.out.print(Arrays.toString(path));
    }

    boolean solve(int[][] g, int[] path, boolean[] visited, int pos) {
        int n = g.length;
        if (pos == n) return g[path[pos - 1]][0] == 1;

        for (int v = 1; v < n; v++) {
            if (g[path[pos - 1]][v] == 1 && !visited[v]) {
                path[pos] = v;
                visited[v] = true;

                if (solve(g, path, visited, pos + 1)) return true;

                visited[v] = false; // backtrack
                path[pos] = -1;
            }
        }
        return false;
    }

    
}
