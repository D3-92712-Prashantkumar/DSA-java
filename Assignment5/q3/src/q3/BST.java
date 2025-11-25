package q3;

public class BST {
	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data = d;
			left=null;
			right=null;
		}
	}
	public BST() {
		root = null;
	}
	public boolean isEmpty() {
		return root==null;
	}
	
	public void add(int d) {
		Node nnode = new Node(d);
		
		if(root==null) {
			root=nnode;
			return;
		}
		Node trav = root;
		while(true) {
			if(d < trav.data) {
				if(trav.left==null) {
					trav.left = nnode;
					break;
				}
				else
					trav=trav.left;
			}
			else {
				if(trav.right==null) {
					trav.right=nnode;
					break;
				}
				else
					trav=trav.right;
			}
		}
	}
	
	public int getLevel(Node input) {
		if(input==root)
			return 0;
		int level=0;
		Node trav = root;
		while(true) {
			if(trav==null)break;
			if(trav.data==input.data) return level;
			else if(trav.data<input.data) {
				level++;
				trav = trav.right;
			}
			else {
				level++;
				trav = trav.left;
			}
		}
		System.out.println("Enter Valid Node! Node is not in the tree!!");
		return -1;
	}
	
	public Node binarySearch(int key) {
		return binarySearch(root, key);
	}
	private Node binarySearch(Node trav,int key) {
		if(trav==null) return null;
		if(trav.data<key) {
			return binarySearch(trav.right, key);			
		}
		else {			
			if(trav.data==key) {
				return trav;
			}
			else {
				return binarySearch(trav.left, key);				
			}
		}
	}
	public void inorder() {
		System.out.print("Inorder : ");
		inorder(root);
		System.out.println("");
	}
	private void inorder(Node trav) {
		if(trav==null) {
			return;
		}
		inorder(trav.left);
		System.out.print(" "+ trav.data);
		inorder(trav.right);
	}
}
