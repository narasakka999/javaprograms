package Nuts;

import java.util.scanner;
import java.util.PriorityQueue;

public class HeapExample {

	public static void main(String[] args) {
		PriorityQueue<Integer>min heap = New PriorityQueue<Integer>();
		minHeap.add(20);
		minHeap.add(5);
		minHeap.add(15);
		minHeap.add(10);
		System.out.println("MIN Heap Output");
		while(!minHeap.isEmpty())
		{
			System.out.println(minHeap.poll());
		}
		PriorityQueue<Integer>maxHeap = new PriorityQueue<>(Collections.reverse());
		maxHeap.add(20);
		maxHeap.add(5);
		maxHeap.add(15);
		maxHeap.add(10);
		System.out.println("MAX Heap Outout");
		while(!maxheap.isEmpty())
		{
			System.out.println(maxHeap.poll());
		}

	}

}
