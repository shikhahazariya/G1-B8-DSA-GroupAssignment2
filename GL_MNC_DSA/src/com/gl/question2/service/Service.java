package com.gl.question2.service;

public class Service {
	
	Node preNode=null;
	Node headNode=null;
	public Node binarytoSkewed(Node root) {
		if(root==null) {
			return null;
		}
		binarytoSkewed( root.left);
		
		Node rightNode=root.right;
		
		if(headNode==null) {
			headNode=root;
			root.left=null;
			preNode=root;
			
		}
		else {
			preNode.right=root;
			root.left=null;
			preNode=root;
		}
		binarytoSkewed( rightNode);
		return headNode;
	}
	public void traverseRightSkewedTree(Node root) {
		if(root==null) {
			return;
		}
			System.out.print(root.value +" ");
			traverseRightSkewedTree(root.right);
		
	}
	
	}


