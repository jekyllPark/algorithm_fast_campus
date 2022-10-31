package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Edge implements Comparable<Edge> {
    public int distance;
    public String vertex;

    public Edge(int distance, String vertex) {
        this.distance = distance;
        this.vertex = vertex;
    }

    public String toString() {
        return "vertex: " + this.vertex + ", distance: " + this.distance;
    }

    @Override
    public int compareTo(Edge edge) {
        return this.distance - edge.distance;
    }

    public static void main(String[] args) {
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Edge(2, "A"));
        priorityQueue.add(new Edge(5, "B"));
        priorityQueue.add(new Edge(1, "C"));
        priorityQueue.add(new Edge(7, "D"));

        System.out.println("priorityQueue = " + priorityQueue);
        priorityQueue.peek(); // 얘는 실제로 꺼내는 건 아니고 확인 용
        Edge edge1 = priorityQueue.poll();
        System.out.println("edge1 = " + edge1);
        System.out.println("priorityQueue = " + priorityQueue);
        int size = priorityQueue.size();
        System.out.println("size = " + size);

        HashMap<String, ArrayList<Edge>> graph = new HashMap<>();
        graph.put("A", new ArrayList<Edge>(Arrays.asList(new Edge(8, "B"), new Edge(1, "C"), new Edge(2, "D"))));
        graph.put("B", new ArrayList<Edge>());
        graph.put("C", new ArrayList<Edge>(Arrays.asList(new Edge(5, "B"), new Edge(2, "D"))));
        graph.put("D", new ArrayList<Edge>(Arrays.asList(new Edge(3, "E"), new Edge(5, "F"))));
        graph.put("E", new ArrayList<Edge>(Arrays.asList(new Edge(1, "F"))));
        graph.put("F", new ArrayList<Edge>(Arrays.asList(new Edge(5, "A"))));


        for (String key : graph.keySet()) {
            System.out.println("key = " + key);
            System.out.println("graph.get(key) = " + graph.get(key));
        }

        ArrayList<Edge> nodeList = graph.get("A");
        for (int index = 0; index < nodeList.size(); index++) {
            System.out.println(nodeList.get(index));
        }


    }
}
