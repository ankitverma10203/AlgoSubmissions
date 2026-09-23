class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];

        ArrayList<Integer>[] graph = new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] preq : prerequisites) {
            int need = preq[1];
            int toTake = preq[0];

            graph[need].add(toTake);
            indegree[toTake]++;
        }

        Queue<Integer> courses = new ArrayDeque<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) courses.offer(i);
        }

        while (!courses.isEmpty()) {
            int currCourse = courses.poll();

            for (int toTake : graph[currCourse]) {
                indegree[toTake]--;

                if (indegree[toTake] == 0) courses.offer(toTake);
            }
        }


        for (int indeg : indegree) {
            if (indeg != 0) return false;
        }

        return true;
    }
}