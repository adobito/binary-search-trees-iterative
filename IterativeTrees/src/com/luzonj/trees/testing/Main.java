package com.luzonj.trees.testing;

import com.luzonj.trees.BinaryTrees.BinarySearchTree;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		
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
		
		
	}

}
