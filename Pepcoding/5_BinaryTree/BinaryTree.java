
import java.util.ArrayList;

public class BinaryTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        Node(int data) {
            this(data, null, null); // constructor chaining
        }
    }

    public static void preOrder(Node root, ArrayList<Integer> ans) {
        if (root == null) {
            return;
        }

        ans.add(root.data);
        preOrder(root.left, ans);
        preOrder(root.right, ans);
    }

    public static void inOrder(Node root, ArrayList<Integer> ans) {
        if (root == null)
            return;

        inOrder(root.left, ans);
        ans.add(root.data);
        inOrder(root.right, ans);
    }

    public static void postOrder(Node root, ArrayList<Integer> ans) {
        if (root == null)
            return;

        postOrder(root.left, ans);
        postOrder(root.right, ans);
        ans.add(root.data);
    }

    public static int size(Node root) {
        if (root == null)
            return 0;

        int leftsize = size(root.left);
        int rightsize = size(root.right);

        return leftsize + rightsize + 1;
    }

    public static int max(Node root) {
        if (root == null)
            return -(int) 1e9;

        int leftmax = max(root.left);
        int rightmax = max(root.right);

        return Math.max(Math.max(leftmax, rightmax), root.data);

    }

    public static int min(Node root) {
        if (root == null)
            return (int) 1e9;

        int leftmin = min(root.left);
        int rightmin = min(root.right);

        return Math.min(Math.min(leftmin, rightmin), root.data);
    }

    public static int sum(Node root) {
        if (root == null)
            return 0;

        int leftsum = sum(root.left);
        int rightsum = sum(root.right);

        return leftsum + rightsum + root.data;
    }

    // heigth in terms of edges return -1 at null,
    // heigth in terms of nodes return 0 at null
    public static int height(Node root) {
        if (root == null)
            return -1;

        int leftHeigth = height(root.left);
        int rightHeigth = height(root.right);

        return Math.max(leftHeigth, rightHeigth) + 1;

    }

    public static int countLeaves(Node root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;

        // int countLeavesOfLeft = countLeaves(root.left);
        // int countLeavesOfRight = countLeaves(root.right);
        // return countLeavesOfLeft + countLeavesOfRight;

        return countLeaves(root.left) + countLeaves(root.right);
    }

    // print the node having exactly one child in a binary tree
    public static void countExaclyOneChild(Node root, ArrayList<Integer> ans) {
        if (root == null || (root.left == null && root.right == null))
            return;

        if (root.left == null || root.right == null)
            ans.add(root.data);

        countExaclyOneChild(root.left, ans);
        countExaclyOneChild(root.right, ans);

    }

    public static int countExaclyOneChild(Node root) {
        if (root == null || root.left == null || root.right == null)
            return 0;

        int leftC = countExaclyOneChild(root.left);
        int rightC = countExaclyOneChild(root.right);
        int sum = leftC + rightC;

        if (root.left == null || root.right == null) {
            sum += 1;
        }

        return sum;
    }

    public static boolean findData(Node node, int data) {
        if (node == null)
            return false;

        if (node.data == data)
            return true;

        return findData(node.left, data) || findData(node.right, data);
    }



    // node to root path -1
    public static boolean nodeToRootPath(Node node, int data, ArrayList<Node> ans) {
        if (node == null)
            return false;

        if (node.data == data) {
            ans.add(node);
            return true;
        }

        boolean res = nodeToRootPath(node.left, data, ans) || nodeToRootPath(node.right, data, ans);

        if (res)
            ans.add(node);

        return res;
    }
    public static ArrayList<Node> nodeToRootPath(Node node, int data) {
        ArrayList<Node> ans = new ArrayList<>();

        boolean a = nodeToRootPath(node, data, ans);

        return ans;
    }



    // node to root path - 2
    public static ArrayList<Node> nodeToRootPath_2_helper(Node node, int data) {
        if(node == null) return null;

        if(node.data == data) {
            ArrayList<Node> list = new ArrayList<>();
            list.add(node);
            return list;
        }

        ArrayList<Node> left = nodeToRootPath_2_helper(node.left, data);
        if(left != null) {
            left.add(node);
            return left;
        }


         ArrayList<Node> right = nodeToRootPath_2_helper(node.right, data);
        if(right != null) {
            right.add(node);
            return right;
        }
        return null;
    }
    public static ArrayList<Node> nodesToRootPath_2(Node node, int data) {
        ArrayList<Node> ans = nodeToRootPath_2_helper(node,data);

        return ans != null ? ans : new ArrayList<Node>();
    }


    public static void printKLeveDown(Node node, int k, Node block, ArrayList<Integer> ans) {
        if(node == null || k < 0 || node == block) {
            return;
        }

        if(k == 0){
            ans.add(node.data);
            return;
        }

        printKLeveDown(node.left, k-1,block, ans);
        printKLeveDown(node.right, k-1, block, ans);
    }

    public static ArrayList<Integer> kaway(Node node, int target, int k) {
        ArrayList<Node> list = new ArrayList<Node>();
        nodeToRootPath(node, target, list);

        ArrayList<Integer> ans = new ArrayList<>();
        Node block = null;
        for(int i = 0; i < list.size(); i++) {
            printKLeveDown(list.get(i), k - i, block, ans);
            block = list.get(i);
        }
        return ans;
    }
}