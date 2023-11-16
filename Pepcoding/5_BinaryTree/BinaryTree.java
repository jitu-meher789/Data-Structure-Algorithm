// import java.util.ArrayList;

// public class BinaryTree {
//     public static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data, Node left, Node right) {
//             this.data = data;
//             this.left = left;
//             this.right = right;
//         }

//         Node(int data) {
//             this(data, null, null); // constructor chaining
//             // this.data = data;
//             // this.left = null;
//             // this.rigth = null;
//         }

//         public static void preOrder(Node root, ArrayList<Integer> ans) {
//             if (root == null) {
//                 return;
//             }

//             ans.add(root.data);
//             preOrder(root.left, ans);
//             preOrder((root.right), ans);

//         }

//         public static void inOrder(Node root, ArrayList<Integer> ans) {
//             if (root == null) {
//                 return;
//             }

//             inOrder(root.left, ans);
//             ans.add(root.data);
//             inOrder((root.right), ans);

//         }

//         public static void postOrder(Node root, ArrayList<Integer> ans) {
//             if (root == null) {
//                 return;
//             }

//             postOrder(root.left, ans);
//             postOrder((root.right), ans);
//             ans.add(root.data);

//         }

//         public static int size(Node node) {
//             if(node == null){
//                 return 0;
//             }

//             int leftSize =  size(node.left);
//             int rightSize = size(node.right);

//             return leftSize + rightSize + 1;

//         }

//         public static int sum(Node node) {
//             if(node == null){
//                 return 0;
//             }

//             int leftSum = sum(node.left);
//             int rightSum = sum(node.right);

//             return leftSum + rightSum + node.data;
//         }

//         public static int max(Node node) {
//             if(node == null)
//              return -(int)1e9;

//             int leftMax  = max(node.left);
//             int rightMax = max(node.right);

//             return Math.max(Math.max(leftMax, rightMax), node.data);
//         }

//          public static int min(Node node) {
//             if(node == null)
//              return (int)1e9;

//             int leftMin  = min(node.left);
//             int rightMin = min(node.right);

//             return Math.min(Math.min(leftMin, rightMin), node.data);
//         }
//     }
// }

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
        if(root == null) return 0;

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
        if(root == null) return 0;

        int leftsum = sum(root.left);
        int rightsum = sum(root.right);

        return leftsum + rightsum + root.data;
    }
}