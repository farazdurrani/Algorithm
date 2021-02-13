package com.algorithm.tree16;

import java.util.List;

public class BSTTest {
    public static void main(String[] args) {
	BinarySearchTree<Integer> bst = new BinarySearchTree<>();
	List<Integer> l = List.of(15, 6, 18, 3, 7, 17, 20, 2, 4, 13, 9);
	System.out.println("Inserting");
	l.forEach(i -> System.out.print(i + " " + bst.insert(i) + " "));
	System.out.println();
	System.out.println("Level Order Traversal Iterative");
	bst.levelOrderTraversalIterative();
	
	System.out.println("MIN: " + bst.min());

	TreeNode<Integer> max = bst.max();

	System.out.println("MAX: " + max);
	
	TreeNode<Integer> root = bst.getRoot();
	
	TreeNode<Integer> successor = bst.successor(root);
	
	System.out.println("Successor of root " + root.data + ": " + successor.data);
	
	TreeNode<Integer> _13 = bst.search(Integer.valueOf(13));
	
	System.out.println("Found 13? " + _13);
	
	System.out.println("Successor of " + _13.data + ": " + bst.successor(_13));
	
	System.out.println("Predecessor of 15: " + bst.predecessor(bst.search(Integer.valueOf(15))));
	
	System.out.println("In-Order Traversal Iterative");
	bst.inorderTraversalInterative();
	
	System.out.println("Successor of 17: " + bst.successor(bst.search(Integer.valueOf(17))));
	
	System.out.println("Successor of 20: " + bst.successor(bst.search(Integer.valueOf(20))));
	
	System.out.println("Predecessor of 9: " + bst.predecessor(bst.search(Integer.valueOf(9))));
	
	System.out.println("Predecessor of 7: " + bst.predecessor(bst.search(Integer.valueOf(7))));
	
	System.out.println("Predecessor of 2: " + bst.predecessor(bst.search(Integer.valueOf(2))));
	
	System.out.println("BST contains 15? (yes) " + bst.contains(15));
	System.out.println("BST contains 999? (no) " + bst.contains(999));
	System.out.println("BST contains 6? (yes) " + bst.contains(6));
	System.out.println("BST contains -1? (no) " + bst.contains(-1));
	

	System.out.println("In-Order Traversal Iterative");
	bst.inorderTraversalInterative();
	System.out.println("Successor of 13 (without keeping track of parent): " + bst.successorWithoutTrackingParentUsingStack(13));
	System.out.println("Successor of 15 (without keeping track of parent): " + bst.successorWithoutTrackingParentUsingStack(15));
	System.out.println("Successor of 2 (without keeping track of parent): " + bst.successorWithoutTrackingParentUsingStack(2));
	System.out.println("Successor of 20 (without keeping track of parent): " + bst.successorWithoutTrackingParentUsingStack(20));
	
	System.out.println("In-Order Traversal Iterative");
	bst.inorderTraversalInterative();
	bst.successorWithoutTrackingParentWithoutAuxilaryStorage(2);
	bst.successorWithoutTrackingParentWithoutAuxilaryStorage(3);
	bst.successorWithoutTrackingParentWithoutAuxilaryStorage(4);
	bst.successorWithoutTrackingParentWithoutAuxilaryStorage(6);
	
	bst.successorWithoutTrackingParentWithoutAuxilaryStorage(7);
	bst.successorWithoutTrackingParentWithoutAuxilaryStorage(9);
	bst.successorWithoutTrackingParentWithoutAuxilaryStorage(13);
	bst.successorWithoutTrackingParentWithoutAuxilaryStorage(15);
	
	bst.successorWithoutTrackingParentWithoutAuxilaryStorage(17);
	bst.successorWithoutTrackingParentWithoutAuxilaryStorage(18);
	bst.successorWithoutTrackingParentWithoutAuxilaryStorage(20);
	
	System.out.println("In-Order Traversal Iterative");
	bst.inorderTraversalInterative();
	bst.predecessorWithoutTrackingParent(2);
	bst.predecessorWithoutTrackingParent(3);
	bst.predecessorWithoutTrackingParent(4);
	bst.predecessorWithoutTrackingParent(6);
	
	bst.predecessorWithoutTrackingParent(7);
	bst.predecessorWithoutTrackingParent(9);
	bst.predecessorWithoutTrackingParent(13);
	bst.predecessorWithoutTrackingParent(15);
	
	bst.predecessorWithoutTrackingParent(17);
	bst.predecessorWithoutTrackingParent(18);
	bst.predecessorWithoutTrackingParent(20);

	
//	System.out.println("Level Order Traversal Using Queue");
//	bst.levelOrderTraversalQueue();
//	System.out.println("In-Order Traversal Recursive");
//	bst.inorderTraversalResursive();

//	System.out.println("Preorder Traversal Recursive");
//	bst.preorderTraversalRecursive();
//	System.out.println("Preorder Traversal Iterative");
//	bst.preorderTraversalIterative();
//	System.out.println("Postorder Traversal Recursive");
//	bst.postorderTraversalRecursive();
//	System.out.println("Postorder Traversal Iterative");
//	bst.postorderTraversalIterative();
//	System.out.println("Root is: " + bst.getRoot());
//	System.out.println("BST contains 14? (yes) " + bst.contains(14));
//	System.out.println("BST contains 999? (no) " + bst.contains(999));
//	System.out.println("BST contains 85? (yes) " + bst.contains(85));
//	System.out.println("BST contains -1? (no) " + bst.contains(-1));
//	System.out.println("In-Order Traversal Recursive");
//	bst.inorderTraversalResursive();
//	System.out.println("removing 14 (exists)");
//	bst.remove(14);
//	bst.inorderTraversalResursive();
//	System.out.println("removing 55 (exists)");
//	bst.remove(55);
//	bst.inorderTraversalResursive();
//	System.out.println("removing 49 (exists)");
//	bst.remove(49);
//	bst.inorderTraversalResursive();
//	System.out.println("removing 64 (exists)");
//	bst.remove(64);
//	bst.inorderTraversalResursive();
//	System.out.println("removing 37 (exists)");
//	bst.remove(37);
//	bst.inorderTraversalResursive();
//	System.out.println("removing 35 (doesn't exist)");
//	bst.remove(35);
//	bst.inorderTraversalResursive();
//	System.out.println("Height : " + bst.height());
//	System.out.println("root: " + bst.getRoot());
//	System.out.println("Level Order Traversal ");
//	bst.levelOrderTraversalQueue();
//
//	System.out.println("New Tree");
//	BinarySearchTree<Integer> bst2 = new BinarySearchTree<>();
//	l.forEach(i -> bst2.insert(i));
//	System.out.println("Level Order Traversal");
//	bst2.levelOrderTraversalIterative();
//	System.out.println("Inverting Tree");
//	bst2.invertTree();
//	System.out.println("Level Order Traversal");
//	bst2.levelOrderTraversalQueue();
//	System.out.println("Descending Order");
//	bst2.inorderTraversalResursive();
//	System.out.println("Preorder Traversal Recursive");
//	bst2.preorderTraversalRecursive();
//	System.out.println("Preorder Traversal Iterative");
//	bst2.preorderTraversalIterative();
//	System.out.println("Postorder Traversal Recursive");
//	bst2.postorderTraversalRecursive();
//	System.out.println("Postorder Traversal Iterative");
//	bst2.postorderTraversalIterative();

    }
}
//l.forEach(i -> {
//if (i == 3) {
//	System.out.print(i + " " + bst.insert(i) + " ");
//} else {
//	bst.insert(i);
//}
//});
