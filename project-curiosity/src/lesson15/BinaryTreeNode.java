package lesson15;

public class BinaryTreeNode {
    
    // Data
    private boolean isRoot;

    private boolean isVisted;

    private String key; // In here we are storing "P", "C"

    private BinaryTreeNode left;

    private BinaryTreeNode right;
    
    // light ui dependecy
    StringBuffer buffer = new StringBuffer();

    // Constructor
    public BinaryTreeNode(boolean isRoot, String key) {
        this.isRoot = isRoot;
        this.key = key;
    }

    // Methods
    public boolean isLeafNode() {
        if (this.left == null && this.right == null) return true;
        return false;
    }

    public boolean isRoot() {
        return this.isRoot;
    }

    public boolean isParent(){
        if (this.left == null || this.right == null) {return false;}
        else{
            return true;
        }
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public BinaryTreeNode getLeft(){
        return this.left;
    }

    public BinaryTreeNode getRight(){
        return this.right;
    }

    public void visit(){
        this.buffer.append(this.key);
        isVisted = true;
    }

    /**
     * Tree Node Traversals
     */
    public StringBuffer Inorder()
    {
        if(this.isVisted == true) return buffer;

        /* Recur on the left as much as you can */
        if (this.left != null) {
            this.left.Inorder();
        }
        
        // call visit
        visit();
        
        /* Recur on the right */
        if (this.right != null) {
            this.right.Inorder();
        }

        return buffer;
    }

    public StringBuffer postOrder() {
        if(this.isVisted == true) return buffer;

        if (this.left != null) {
            this.left.postOrder();
        }

        /* Recur on the right */
        if (this.right != null) {
            this.right.postOrder();
        }

        // call visit
        visit();

        return buffer;
    }

    // preOrder
    public StringBuffer preOrder() {
        if(!isVisted == true){
            // call visit
            visit();
        }

        /* Recur on the left as much as you can */
        if (this.left != null) {
            this.left.preOrder();
        }

        /* Recur on the right */
        if (this.right != null) {
            this.right.preOrder();
        }
        return buffer;
    }
}