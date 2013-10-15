package com.luzonj.trees.BinaryTrees;

public class BinaryTreeNode<E> {
	private E element;
	private BinaryTreeNode<E> parent;
	private BinaryTreeNode<E> leftChild;
	private BinaryTreeNode<E> rightChild;

	public BinaryTreeNode(E element,BinaryTreeNode<E> parent, BinaryTreeNode<E> leftChild, BinaryTreeNode<E> rightChild) {
		this.element = element;
		this.parent = parent;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	public BinaryTreeNode(E element, BinaryTreeNode<E> parent) {
		this(element,parent,null,null);
	}
	public BinaryTreeNode(BinaryTreeNode<E> parent) {
		this(null,parent,null,null);
	}
	public BinaryTreeNode(E element) {
		this(element,null,null,null);
	}
	public BinaryTreeNode() {
		this(null,null,null,null);
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public BinaryTreeNode<E> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BinaryTreeNode<E> leftChild) {
		this.leftChild = leftChild;
	}

	public BinaryTreeNode<E> getParent() {
		return parent;
	}

	public void setParent(BinaryTreeNode<E> parent) {
		this.parent = parent;
	}


	public BinaryTreeNode<E> getRightChild() {
		return rightChild;
	}

	public void setRightChild(BinaryTreeNode<E> rightChild) {
		this.rightChild = rightChild;
	}


}
