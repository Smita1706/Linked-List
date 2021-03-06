package com.bridgelabz.linkedlist;

import org.junit.Assert;
import org.junit.Test;
public class MyLinkedListTest {

	@Test
	public void given3NumberWhenAddedToLinkedList_ShouldBeAddedToTop() {
		System.out.println("Test Case 2 : Ability to add 30 and 56 to 70 ");
		MyNode<Integer> myFirstNode = new MyNode(70);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(56);
		MyLinkedList mylinkedlist = new MyLinkedList();
		mylinkedlist.add(myFirstNode);
		mylinkedlist.add(mySecondNode);
		mylinkedlist.add(myThirdNode);
		mylinkedlist.printMyNodes();
		boolean result =  mylinkedlist.head.equals(myThirdNode) &&
				mylinkedlist.head.getNext().equals(mySecondNode) &&
				mylinkedlist.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumberWhenAppendedToLinkedList_ShouldBeAddedLast() {
		System.out.println("Test Case 3 : Ability to append 30 and 70 to 56 ");
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);
		MyLinkedList mylinkedlist = new MyLinkedList();
		mylinkedlist.add(myFirstNode);
		mylinkedlist.apend(mySecondNode);
		mylinkedlist.apend(myThirdNode);
		mylinkedlist.printMyNodes();
		boolean result =  mylinkedlist.head.equals(myFirstNode) &&
				mylinkedlist.head.getNext().equals(mySecondNode) &&
				mylinkedlist.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
	@Test
	public void given3NumberWhenAppendedToLinkedList_OneNumberShouldBeInsertedInMiddle() {
		System.out.println("Test Case 4 : Ability to insert 30 between 56 and 70");
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);
		MyLinkedList mylinkedlist = new MyLinkedList();
		mylinkedlist.add(myFirstNode);
		mylinkedlist.apend(myThirdNode);
		mylinkedlist.Insert(myFirstNode, mySecondNode);
		mylinkedlist.printMyNodes();
		boolean result =  mylinkedlist.head.equals(myFirstNode) &&
				mylinkedlist.head.getNext().equals(mySecondNode) &&
				mylinkedlist.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumberWhenAppendedToLinkedList_FirstNumberShouldBeDeleted() {
		System.out.println("Test Case 5 : Ability to delete first element");
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);
		MyLinkedList mylinkedlist = new MyLinkedList();
		mylinkedlist.add(myFirstNode);
		mylinkedlist.apend(myThirdNode);
		mylinkedlist.Insert(myFirstNode, mySecondNode);
		mylinkedlist.pop();
		mylinkedlist.printMyNodes();
		boolean result =  mylinkedlist.head.equals(mySecondNode) &&
				mylinkedlist.head.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumberWhenAppendedToLinkedList_LastNumberShouldBeDeleted() {
		System.out.println("Test Case 6 : Ability to delete last element");
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);
		MyLinkedList mylinkedlist = new MyLinkedList();
		mylinkedlist.add(myFirstNode);
		mylinkedlist.apend(myThirdNode);
		mylinkedlist.Insert(myFirstNode, mySecondNode);
		mylinkedlist.popLast();
		mylinkedlist.printMyNodes();
		boolean result =  mylinkedlist.head.equals(myFirstNode) &&
				mylinkedlist.head.getNext().equals(mySecondNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumberWhenAppendedToLinkedList_ShouldSearch30() {
		System.out.println("Test Case 7 : Ability to search 30 in to linked list");
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);
		MyLinkedList mylinkedlist = new MyLinkedList();
		mylinkedlist.add(myFirstNode);
		mylinkedlist.apend(myThirdNode);
		mylinkedlist.Insert(myFirstNode, mySecondNode);
		mylinkedlist.printMyNodes();
		boolean result = mylinkedlist.search(mySecondNode);
		mylinkedlist.search(myThirdNode);
		Assert.assertTrue(result);		
	}

	@Test
	public void givenSearch30InLinkedList_ShouldBeInserted40After30() {
		System.out.println("Test Case 8 : Ability to insert 40 after 30");
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);
		MyNode<Integer> myFourthNode = new MyNode(40);
		MyLinkedList mylinkedlist = new MyLinkedList();
		mylinkedlist.add(myFirstNode);
		mylinkedlist.apend(myThirdNode);
		mylinkedlist.Insert(myFirstNode, mySecondNode);
		mylinkedlist.searchAndInsert(mySecondNode, myFourthNode);
		mylinkedlist.printMyNodes();
		boolean result = mylinkedlist.head.equals(myFirstNode) &&
				mylinkedlist.head.getNext().equals(mySecondNode) && 
				mylinkedlist.tail.equals(myThirdNode);
		Assert.assertTrue(result);		
	}

	@Test
	public void givenSearch40InLinkedList_ShouldBeDeleted40() {
		System.out.println("Test Case 9 : Ability to delete 40 from linked list and show the size of linked list");
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);
		MyNode<Integer> myFourthNode = new MyNode(40);
		MyLinkedList mylinkedlist = new MyLinkedList();
		mylinkedlist.add(myFirstNode);
		mylinkedlist.apend(myThirdNode);
		mylinkedlist.Insert(myFirstNode, mySecondNode);
		mylinkedlist.searchAndDelete(myFourthNode);
		System.out.println("Size of linked list is : " + mylinkedlist.size());
		mylinkedlist.printMyNodes();
		boolean result = mylinkedlist.head.equals(myFirstNode) &&
				mylinkedlist.head.getNext().equals(mySecondNode) &&
				mylinkedlist.tail.equals(myThirdNode);
		Assert.assertTrue(result);		
	}


	@Test
	public void given_ShouldReturn() {
		System.out.println("Test Case 10 : Ability to create ordered linked list in assending order");
		OrderedLinkedList<Integer> linkedList = new OrderedLinkedList<>();
		linkedList.add(56);
		linkedList.add(30);
		linkedList.add(70);
		linkedList.add(40);
		linkedList.printMyNodes();
		int head =linkedList.head.data;
		Assert.assertEquals(30, head);
	}
}
