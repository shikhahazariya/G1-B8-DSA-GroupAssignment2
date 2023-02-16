package com.gl.question1.service;

import java.util.PriorityQueue;

public class Service {
public void constructionTable(int floor[]) {
	//priority queue for ascending/descending order
	PriorityQueue<Integer> queue=new PriorityQueue<>(java.util.Collections.reverseOrder());
	int max=floor.length;
	System.out.println("the order of construction is as follows");
	for(int i=0;i<floor.length;i++) {
		System.out.println("Day :"+(i+1));
		queue.add(floor[i]);
		while(!queue.isEmpty() && queue.peek()==max) {
			System.out.println(queue.poll()+" ");
			max--;
		}
		System.out.println();
	}
}
}