package lesson15;

public class BinaryTreeDemo {
    
    public static void main(String[] args) {

        // The Binary Tree for the CS Classroom
        BinaryTreeNode CSclassroom = new BinaryTreeNode(true, "EC");
        CSclassroom.setLeft(new BinaryTreeNode(false, "JB"));
        CSclassroom.setRight(new BinaryTreeNode(false, "BS"));
        CSclassroom.getLeft().setLeft(new BinaryTreeNode(false, "FT"));
        CSclassroom.getRight().setRight(new BinaryTreeNode(false, "KP"));
        CSclassroom.getRight().getRight().setRight(new BinaryTreeNode(false, "CL"));
        CSclassroom.getRight().getRight().getRight().setLeft(new BinaryTreeNode(false, "D"));
        CSclassroom.getRight().getRight().getRight().setRight(new BinaryTreeNode(false, "Dim"));

        CSclassroom.Inorder();
    }
}