package DSA;
import java.lang.Math.*;
class Node {
    int key;
    Node left, right;
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

public class Tree { 
	Node root;
	Tree(){ root = null; }
	int Size() { return Size(root); }
	int Sum() { return Sum(root); }
	int max() { return max(root); }

	void Inorder(Node root) {
		if(root == null) 
			return;
		
		Inorder(root.left);
		System.out.print(root.key+" ");
		Inorder(root.right);
		
	}
	
	void Preorder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.key+" ");
		Preorder(root.left);
		Preorder(root.right);	
		
	}
	
	void Postorder(Node root) {
		if(root == null) {
			return;
		}
		Postorder(root.left);
		Postorder(root.right);
		System.out.print(root.key+" ");
		
	}

	 int Size(Node root)
	 {
	     if (root == null)
	         return 0;
	     else
	         return (Size(root.left) + Size(root.right) + 1);
	 }
	
	 int Sum(Node root)
	 {
	     if (root == null)
	         return 0;
	     else
	         return (Sum(root.left) + Sum(root.right) + root.key);
	 }
	 
	 int max(Node root)
	 {
	     if (root == null)
	         return Integer.MIN_VALUE;
	     else
	         return Math.max(Math.max(max(root.left),max(root.right)), root.key);
	 }
	 
	public static void main(String[] args) {								
        Tree tree = new Tree();											
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        
        System.out.print("Inorder traversal of binary tree is : ");
        tree.Inorder(tree.root);
        System.out.print("\nPreorder traversal of binary tree is : ");
        tree.Preorder(tree.root);
        System.out.print("\nPostorder traversal of binary tree is : ");
        tree.Postorder(tree.root);
        
        System.out.print("\nSize of binary tree is : "+tree.Size());
        System.out.print("\nSum of binary tree is : "+tree.Sum(tree.root));
        System.out.print("\nMax of binary tree is : "+ tree.max(tree.root));

        
	}

}
