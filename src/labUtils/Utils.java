package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		t.addRoot(4);
		Position<Integer> rootChild;
		rootChild = t.addChild(t.root(), 9);
		t.addChild(rootChild, 7);
		t.addChild(rootChild, 10);
		rootChild = t.addChild(t.root(), 20);
		Position<Integer> rootGrandchild = t.addChild(rootChild, 15);
		t.addChild(rootGrandchild, 12);
		rootGrandchild = t.addChild(rootGrandchild, 17);
		t.addChild(rootGrandchild, 19);
		rootGrandchild = t.addChild(rootChild, 21);
		rootGrandchild = t.addChild(rootGrandchild, 40);
		t.addChild(rootGrandchild, 30);
		t.addChild(rootGrandchild, 45);
		
		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		t.addRoot(4);
		Position<Integer> rootChild;
		rootChild = t.addLeft(t.root(), 9);
		t.addLeft(rootChild, 7);
		t.addRight(rootChild, 10);
		rootChild = t.addRight(t.root(), 20);
		Position<Integer> rootGrandchild = t.addLeft(rootChild, 15);
		t.addLeft(rootGrandchild, 12);
		rootGrandchild = t.addRight(rootGrandchild, 17);
		t.addLeft(rootGrandchild, 19);
		rootGrandchild = t.addRight(rootChild, 21);
		rootGrandchild = t.addRight(rootGrandchild, 40);
		t.addLeft(rootGrandchild, 30);
		t.addRight(rootGrandchild, 45);

		
		return t; 
	}


}
