/* Class BinSearchTree */
class BinSearchTree {
    private BinTreeNode root;

    public BinSearchTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int val) {
        root = insert(root, val);
    }

    private BinTreeNode insert(BinTreeNode btnode, int val) {
        /* write your code here */
        if (btnode == null) {
            btnode = new BinTreeNode(val);
            return btnode;
        } else if (btnode.val > val) {
            btnode.leftChild = insert(btnode.leftChild, val);
        } else if (btnode.val < val) {
            btnode.rightChild = insert(btnode.rightChild, val);
        }
        return btnode;
    }

    public void delete(int k) {
        if (isEmpty())
            System.out.println("Tree is Empty");
        else if (search(k) == false)
            System.out.println("Sorry " + k + " is not there in the tree");
        else {
            root = delete(root, k);
            System.out.println(k + " is deleted");
        }
    }

    private BinTreeNode delete(BinTreeNode root, int k) {

        if (root.val < k) {
            root.rightChild = delete(root.rightChild, k);
        } else if (root.val > k) {
            root.leftChild = delete(root.leftChild, k);
        } else {
            if (root.leftChild == null) {
                return root.rightChild;
            } else if (root.rightChild == null) {
                return root.leftChild;
            }

            root.val = minvalue(root.rightChild);

            root.rightChild = delete(root.rightChild, root.val);
        }

        return root;
    }

    public int minvalue(BinTreeNode root) {
        int min = root.val;
        while (root.leftChild != null) {
            min = root.leftChild.val;
            root = root.leftChild;
        }

        return min;
    }

    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(BinTreeNode r) {
        if (r == null)
            return 0;
        else {
            int c = 1;
            c += countNodes(r.getLeftChild());
            c += countNodes(r.getRightChild());
            return c;
        }
    }

    public boolean search(int val) {
        return search(root, val);
    }

    private boolean search(BinTreeNode r, int val) {
        boolean result = false;

        /* write your code here */
        if (r == null) {
            result = false;
        } else {
            if (r.val == val) {
                result = true;
                // System.exit(1);
            } else if (r.val < val) {
                return search(r.rightChild, val);
            } else if (r.val > val) {
                return search(r.leftChild, val);
            }
        }
        return result;
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(BinTreeNode r) {
        if (r != null) {
            inorder(r.getLeftChild());
            System.out.print(r.getVal() + " ");
            inorder(r.getRightChild());
        }
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(BinTreeNode r) {
        if (r != null) {
            System.out.print(r.getVal() + " ");
            preorder(r.getLeftChild());
            preorder(r.getRightChild());
        }
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(BinTreeNode r) {
        if (r != null) {
            postorder(r.getLeftChild());
            postorder(r.getRightChild());
            System.out.print(r.getVal() + " ");
        }
    }
}
