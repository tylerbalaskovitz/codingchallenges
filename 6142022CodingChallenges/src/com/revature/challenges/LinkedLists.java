package com.revature.challenges;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class LinkedLists {

	

	
	    public static void main(String[] args) {
	        //Creating three linked lists with data that has been hardcoded
	        List<Integer> linkedList1 = new LinkedList<Integer>(Arrays.asList(12,1,7,3,5));
	        
	        List<Integer> linkedList2 = new LinkedList<Integer>(Arrays.asList(7,2,6,3,4));
	        
	        List<Integer> linkedList3= new LinkedList<Integer>(Arrays.asList(3,4,5,6,3));

	        List<Integer>[] newLinkedLists = new LinkedList[3];

	        newLinkedLists[0] = linkedList1;
	        newLinkedLists[1] = linkedList2;
	        newLinkedLists[2] = linkedList3;

	        //Creating another linked list that uses the .add method to take in all of the numbers from the above linked lists
	        List<Integer> finalLinkedList = new LinkedList<>();

	        //the number from the list equating to the newLinkedLists above is instantiating as list, and the integer called number will be added to the finalLinkedList
	        for(List<Integer> list : newLinkedLists)
	            for(Integer number : list)
	                finalLinkedList.add(number);

	        //Using the .sort() method to sort the list
	        Collections.sort(finalLinkedList);

	        
	        System.out.println(finalLinkedList);
	        //the following will be rendered into the console [1, 2, 3, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 12]

	    }

	}

