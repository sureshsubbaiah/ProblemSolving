package Medium;

public class BST_Construction {
	
	static class Node{
		int key;
		Node left;
		Node right;
	}
	
	static Node newnode(int data){
		Node node = new Node();
		node.key=data;
		node.left = node.right =null;
		return node;
	}
	
	public static Node insert(Node root, int data) {
		if (root == null) {
			return newnode(data);
		} else {
			if (data <= root.key) {
				root.left = insert(root.left, data);
			} else {
				root.right = insert(root.right, data);
			}
			return root;
		}
	}
	
	public static void printInOrder(Node root) {
		if (root == null) {
			return;
		}
		printInOrder(root.left);
		System.out.println(root.key);
		printInOrder(root.right);
	}
	
	public static void printPreOrder(Node root) {
		if (root == null) {
			return;
		}

		System.out.println(root.key);
		printPreOrder(root.left);
		printPreOrder(root.right);
	}
	
	public static void printPostOrder(Node root) {
		if (root == null) {
			return;
		}
		
		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.println(root.key);
		
	}
	
	public static void main(String[] args) {
		Node root = insert(null, 50);
		insert(root, 30);
		insert(root, 20);
		insert(root, 40);
		insert(root, 70);
		insert(root, 60);
		insert(root, 80);
		
		printPreOrder(root);
		System.out.println(" ");
		printInOrder(root);
		System.out.println(" ");
		printPostOrder(root);
		
	}

}
