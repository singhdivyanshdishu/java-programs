import java.util.*;

public class BST
{
    static class Node
    {
        int data;
        Node right;
        Node left;
        Node(int data)
        {
            this.data=data;
            this.right=null;
            this.left=null;

        }

    }
    public static Node insert(Node root,int val)
    {
        if(root==null)
        {
            root =new Node(val);
            return root;
        }
        if(root.data>val)
        {
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right, val);
        }
        return root;
    } 
    public static void inorder(Node root) {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void preorder(Node root) {
        if(root == null) {
            
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root) {
        if(root == null) {
            //System.out.print(-1+" ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static boolean search(Node root,int val)
    {
        if(root==null)
        {
            return false; 
        }
        if(root.data>val)
        {
            return (search(root.left,val));
        }
        if(root.data==val)
        {
            return true;
        }
        else
        {
            return(search(root.right, val));
        }
    }
    public static Node delete(Node root ,int val)
    {
        if (root == null) {
            return null;  // value not found, return null
        }
        if(root.data>val)
        {
            root.left=delete(root.left, val);
        }
        else if(root.data<val)
        {
            root.right=delete(root.right, val);
        }
        else
        {
            if(root.left==null&&root.right==null)
            {
                return null;
            }
            if(root.left==null)
            {
                return root.right;
            }
            else if (root.right==null) {
                return root.left;
            }
            Node IS = inOrderSuccessor(root.right);
            root.data=IS.data;
            root.right= delete(root.right, IS.data);
        }

        return root;

    }
    public static Node inOrderSuccessor(Node root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }
    public static void printInRange(Node root,int x, int y)
    {
        if(root==null)
        {
            return;
        }
        if(root.data>=x&&root.data<=y)
        {
            printInRange(root.left, x, y);
            System.out.print(root.data+" ");
            printInRange(root.right, x, y);
        }
        else if(root.data>=y)
        {
            printInRange(root.left, x, y);
        }
        else 
        {
            printInRange(root.right, x, y);
        }
    }
    // public static void printRoot2leaf(Node root,ArrayList<Integer> path)
    // {
    //     if(root==null)
    //     {

    //     }
    // }
    public static void main(String[] args) {
        int values[]={1,5,2,3,7,6,8,3};
        Node root=null;
        for (int i = 0; i < values.length; i++) {
            root=insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);System.out.println();
        System.out.println(search(root, 1));
        delete(root, 30);
        inorder(root);
        System.out.println();
        printInRange(root, 2, 6);
    }
}