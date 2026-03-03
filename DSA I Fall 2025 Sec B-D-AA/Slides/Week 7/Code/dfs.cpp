#include <iostream>
#include <queue>
#include<stack>

using namespace std;

#define MAX 10   // Maximum number of nodes allowed

// Breadth First Search function
void BFS(int graph[MAX][MAX], int nodes, int start) {

    int visited[MAX];   // Array to track visited nodes

    // Step 1: Initialize visited array manually
    for (int i = 0; i < nodes; i++) {
        visited[i] = 0; // 0 means not visited
    }

    stack<int> q;

    // Step 2: Start BFS from the starting node
    visited[start] = 1;
    q.push(start);

    cout << "\nBFS Traversal Order: ";

    // Step 3: Process nodes in the queue
    while (!q.empty()) {
        int current = q.top();
        q.pop();

        cout << current << " ";

        // Step 4: Check all neighbors of current node
        for (int i = 0; i < nodes; i++) {
            // If there is an edge and node is not visited
            if (graph[current][i] == 1 && visited[i] == 0) {
                visited[i] = 1;
                q.push(i);
            }
        }
    }

    cout << endl;
}

int main() {
    int nodes;
    int graph[MAX][MAX];

    cout << "Enter number of nodes: ";
    cin >> nodes;

    // Step 0: Initialize adjacency matrix manually
    for (int i = 0; i < nodes; i++) {
        for (int j = 0; j < nodes; j++) {
            graph[i][j] = 0;
        }
    }

    cout << "\nEnter adjacency matrix (0 or 1):\n";
    for (int i = 0; i < nodes; i++) {
        for (int j = 0; j < nodes; j++) {
            cin >> graph[i][j];
        }
    }

    int start;
    cout << "\nEnter starting node (0 to " << nodes - 1 << "): ";
    cin >> start;

    BFS(graph, nodes, start);

    return 0;
}
