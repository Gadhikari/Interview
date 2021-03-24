public class BinaryTreeImpl {
    public  static void main(String args[]){
            BinaryTree tree = new BinaryTree();
            tree.root = new Node(20);
            tree.root.left = new Node(15);
            tree.root.right = new Node(30);
            tree.root.left.left = new Node(10);
            tree.root.left.right = new Node(16);
            tree.root.right.left = new Node(25);
            tree.root.right.right = new Node(35);
            System.out.println("inorder");
            printInorder(tree.root);
            System.out.println("preorder");
            printPreorder(tree.root);
            System.out.println("printPostorder");
            printPostorder(tree.root);
    }

    public static void  printInorder(Node node)
    {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.println(node.data + " ");
        printInorder(node.right);
    }
    public static void  printPreorder(Node node)
    {
        if (node == null)
            return;
        System.out.println(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    public static void  printPostorder(Node node)
    {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.println(node.data + " ");
    }
}
