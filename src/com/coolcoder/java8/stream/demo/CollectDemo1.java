package com.coolcoder.java8.stream.demo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo1 {
	
	public static void main(String[] args) {
		
		Stream<Integer> numberStream = Stream.of(3,1,3,1,6,7,8,10);
		
		//i want convert this stream to collection
		
		LinkedList<Integer> linkedList = numberStream.collect(Collectors.toCollection(LinkedList :: new));//3,1,3,1,6,7,8,10
		
		System.out.println(linkedList);
		
		Stream<Integer> numberStream1 = Stream.of(3,1,3,1,6,8,7,10);
		
		HashSet<Integer> hashSet = numberStream1.collect(Collectors.toCollection(HashSet :: new));// 3 ,1,6,7,8,10 avoid duplicates
		System.out.println(hashSet);
		
		Stream<Integer> numberStream2 = Stream.of(3,1,3,1,6,8,7,10);
		
		TreeSet<Integer> treeSet = numberStream2.collect(Collectors.toCollection(TreeSet :: new));//1,3,6,7,8,10 sorting
		System.out.println(treeSet);
		
	}

}
