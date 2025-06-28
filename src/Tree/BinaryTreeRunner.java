package src.Tree;

/*
 * it's a Binary Tree but the difference is in the way of adding the values.
 * Making sure that the smaller elements on the left side and bigger elements on the right side.
 * Elements from the left side of the root nodes is smaller and elements to the right side of root node is higher.
 * Tree Traversal Types
 *  - In-Order : Left → Root → Right
 *  - Pre-Order : Root → Left → Right
 *  - Post-Order : Left → Right → Root
 */

public class BinaryTreeRunner {

    public static void main(String[] args) {
        BinaryTreeSample btSample = new BinaryTreeSample();
        btSample.insert(8);
        btSample.insert(7);
        btSample.insert(12);
        btSample.insert(15);
        btSample.insert(2);
        btSample.insert(5);

        System.out.println("In-Order traversal of Binary Tree");
        btSample.inorder();
        System.out.println();
        System.out.println("Pre-Order traversal of Binary Tree");
        btSample.preorder();
        System.out.println();
        System.out.println("Post-Order traversal of Binary Tree");
        btSample.postorder();
    }
}
