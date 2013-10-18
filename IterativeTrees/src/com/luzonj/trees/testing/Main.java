package com.luzonj.trees.testing;

import com.luzonj.trees.BinaryTrees.BinarySearchTree;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		
		bst.add(100);
		bst.add(50);
		bst.add(25);
		bst.add(37);
		bst.add(30);
		bst.add(75);
		bst.add(87);
		bst.add(200);
		bst.add(400);
		bst.add(300);
		bst.add(500);
		bst.inOrderTraversalIter();
		/**
		bst.add(4);
		bst.add(12);
		bst.add(23);
		bst.add(9);
		bst.add(15);
		bst.add(1);
		bst.inOrderTraversal();
		System.out.println();
		bst.clear();
		bst.addIter(4);
		bst.addIter(12);
		bst.addIter(23);
		bst.addIter(9);
		bst.addIter(15);
		bst.addIter(1);
		bst.inOrderTraversal();
		
		bst.clear();
		bst.add(10);
		bst.add(5);
		bst.preorderTraversalIter();
		*/
	}

}
