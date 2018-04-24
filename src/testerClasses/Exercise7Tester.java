package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;

public class Exercise7Tester {
	public static void main(String[] args) throws CloneNotSupportedException {
		LinkedTree<Integer> empty = Utils.buildExampleTreeAsLinkedTree();
		empty.display();
		LinkedTree<Integer> nuevo = empty.clone();
		nuevo.display();
		
		LinkedBinaryTree<Integer> otherEmpty = Utils.buildExampleTreeAsLinkedBinaryTree();
		otherEmpty.display();
		LinkedBinaryTree<Integer> otherNuevo = otherEmpty.clone();
		otherNuevo.display();
	}
}
