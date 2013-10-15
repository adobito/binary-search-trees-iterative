package com.luzonj.trees.BinaryTrees;

public abstract class BinaryTree<E> {
	protected BinaryTreeNode<E> root;
	
	public BinaryTree(BinaryTreeNode<E> root) {
		this.root = root;
	}
	
	public BinaryTree() {
		this(null);
	}
	
}
