import java.util.Comparator;
import java.util.PriorityQueue;

public class Main
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.add(35);
        priorityQueue.add(22);
        priorityQueue.add(77);
        priorityQueue.add(55);
        priorityQueue.add(15);
        priorityQueue.add(77);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}