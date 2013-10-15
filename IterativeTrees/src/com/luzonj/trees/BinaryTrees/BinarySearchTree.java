package com.luzonj.trees.BinaryTrees;


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

		preOrderTraversalRec(root.getLeftChild());
		preOrderTraversalRec(root.getRightChild());
		System.out.println(root.getElement());
	}
	public void inOrderTraversal() {
		inOrderTraversalRec(root);

	}
	private void inOrderTraversalRec(BinaryTreeNode<E> root) {
		if(root == null)
			return;

		preOrderTraversalRec(root.getLeftChild());
		System.out.println(root.getElement());
		preOrderTraversalRec(root.getRightChild());

	}

	public void clear() {
		this.root = null;
	}


}
