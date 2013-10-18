package com.luzonj.trees.BinaryTrees;

import java.util.EmptyStackException;
import java.util.Stack;


public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E>{


	public void add(E element) {
		addRec(element,root);
	}
	public void addIter(E element) {
		if(this.root == null) {
			this.root = new BinaryTreeNode<E>(element);
			return;
		}
		BinaryTreeNode<E> currNode = this.root;
		while(true) {
			if(currNode.getElement().compareTo(element) < 0) {
				if(currNode.getRightChild() == null) {
					currNode.setRightChild(new BinaryTreeNode<E>(element, currNode));
					return;
				}else
					currNode = currNode.getRightChild();
			}
			else 
				if(currNode.getLeftChild() == null) {
					currNode.setLeftChild(new BinaryTreeNode<E>(element, currNode));
					return;
				}else currNode = currNode.getLeftChild();
		}

	}
	private void addRec(E element, BinaryTreeNode<E> root) {
		if(this.root == null) {
			this.root = new BinaryTreeNode<E>(element);
			return;
		}
		if(root.getElement().compareTo(element) < 0) {
			if(root.getRightChild() == null) {
				root.setRightChild(new BinaryTreeNode<E>(element, root));
			}
			else
				addRec(element,root.getRightChild());
		}
		else {
			if(root.getLeftChild() == null) {
				root.setLeftChild(new BinaryTreeNode<E>(element,root));
			}
			else
				addRec(element,root.getLeftChild()); 
		}
	}


	public void preOrderTraversal() {
		preOrderTraversalRec(root);

	}
	private void preOrderTraversalRec(BinaryTreeNode<E> root) {
		if(root == null)
			return;
		System.out.println(root.getElement());
		preOrderTraversalRec(root.getLeftChild());
		preOrderTraversalRec(root.getRightChild());
	}
	public void postOrderTraversal() {
		postOrderTraversalRec(root);

	}
	private void postOrderTraversalRec(BinaryTreeNode<E> root) {
		if(root == null)
			return;

		postOrderTraversalRec(root.getLeftChild());
		postOrderTraversalRec(root.getRightChild());
		System.out.println(root.getElement());
	}
	public void inOrderTraversal() {
		inOrderTraversalRec(root);

	}
	private void inOrderTraversalRec(BinaryTreeNode<E> root) {
		if(root == null)
			return;

		inOrderTraversalRec(root.getLeftChild());
		System.out.println(root.getElement());
		inOrderTraversalRec(root.getRightChild());

	}


	public void inOrderTraversalIter() {
		Stack<BinaryTreeNode<E>> st = new Stack<BinaryTreeNode<E>>();

		st.push(this.root);
		boolean isDone = false;

		while(!isDone) {
			if(st.peek().hasLeftChild()) {
				st.push(st.peek().getLeftChild());
			} else {
				while(!isDone) {
					try {
						System.out.println(st.peek().getElement());
						if(st.peek().hasRightChild()) {
							st.push(st.peek().getRightChild());
							break;
						}
						else 
							while(st.pop() == st.peek().getRightChild());
					}
					catch (EmptyStackException e) {
						isDone = true;
					}
				}
			}
		}	
	}

	public void preOrderTraversalIter() {
		Stack<BinaryTreeNode<E>> st = new Stack<BinaryTreeNode<E>>();
		st.push(this.root);
		BinaryTreeNode<E> currNode;
		while(!st.isEmpty()) {
			currNode = st.peek();
			System.out.println(currNode.getElement());
			if(currNode.hasLeftChild()) {
				st.push(currNode.getLeftChild());
			}
			else {
				while(true) {
					if(currNode.hasRightChild()) {
						st.push(currNode.getRightChild());
						break;
					}
					else { 
						do {
							if(st.isEmpty())
								return;
							currNode = st.pop();
							if(!st.isEmpty()) {
								if(currNode == st.peek().getRightChild());
								continue;
							}
							break;
						}
						while(true);
					}
				}
			}
		}
	}

	public void clear() {
		this.root = null;
	}


}
