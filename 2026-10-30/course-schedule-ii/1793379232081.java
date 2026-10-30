class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];

        int[] indegree = new int[numCourses];

        ArrayList<Integer>[] graph = new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] preq : prerequisites) {
            graph[preq[1]].add(preq[0]);
            indegree[preq[0]]++;
        }

        int courseTaken = 0;