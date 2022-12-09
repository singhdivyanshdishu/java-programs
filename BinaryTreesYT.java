//Build a Tree from its Preorder traversal
import java.util.*;
public class BinaryTreesYT {
    static class Node {
        int data;
        Node left;
        Node right;
  
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
  
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]); 
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
  
    
//Preorder 

public static void preorder(Node root) {
       if(root == null) {
           
           return;
       }
       System.out.print(root.data+" ");
       preorder(root.left);
       preorder(root.right);
   }
   public static void inorder(Node root) {//o(n)
    if(root == null) {
       // System.out.print(-1+" ");
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
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
public static void levelorder(Node root)
{
    if(root==null)
    {
        return;
    }
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    q.add(null);
    while(!q.isEmpty())
    {
        Node currNode=q.remove();
        if(currNode==null){
            System.out.println();
            if(q.isEmpty()){
                break;}
            else{
            q.add(null);
        }}
        else{
            System.out.print(currNode.data+ " ");
            if(currNode.left!=null)
            {
                q.add(currNode.left);
            }
            if(currNode.right!=null)
            {
                q.add(currNode.right);
            }
        }
    }
    }
    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int lh=height(root.left);
        int rh=height(root.right);
        return (Math.max(lh,rh)+1);
    }
    public static int count(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int lc=count((root.left));
        int rc=count((root.right));
        return lc+rc+1;
    }
    public static int sum(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int ls=sum(root.left);
        int rs=sum(root.right);
        return ls+rs+root.data;
    }
    //approach 1 O(n^2)
    public static int diameter(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int ld=diameter(root.left);
        int lh=height(root.left);
        int rd=diameter(root.right);
        int rh=diameter(root.right);

        int slfdia=rh+lh+1;
       return Math.max(slfdia,Math.max(ld,rd));
    }
    //approach 2 O(n)
    static class info
    {
        int diam;
        int ht;

        public info(int dia,int ht)
        {
            this.diam=dia;
            this.ht=ht;
        }
    }
    public static info diameter2(Node root)
    {
        if(root == null)
        {
            return new info(0,0);
        }
        info li=diameter2(root.left);
        info ri=diameter2(root.right);

        int diam= Math.max(Math.max(li.diam,ri.diam),li.ht+ri.ht+1);
        int ht=Math.max(li.ht,ri.ht)+1;
        return new info(diam, ht);
    }
    public static boolean isIdentical(Node root,Node subroot)
    {
        if(root==null&&subroot==null)
        {
            return true;

        }
        else if(root==null || subroot==null || root.data!=subroot.data)
        {
            return false;
        }
        if(!isIdentical(root.left, subroot.left))
        {
            return false;
        }
        if(!isIdentical(root.right, subroot.right))
        {
            return false;
        }
        return true;
    }
    public static boolean issubtree(Node root,Node subroot)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==subroot.data)
        {
            if(isIdentical(root,subroot))
            {
                return true;
            }
        }
        boolean la= issubtree(root.left, subroot);
        boolean ra= issubtree(root.right, subroot);
        return la||ra;
    }
   /*  1
      / \
     2   3
    / \   \
   4   5   6
    \
     null  */
    public static void main(String args[]) {
    int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildTree(nodes);
    preorder(root);System.out.println();
    inorder(root);System.out.println();
    postorder(root);System.out.println();
    levelorder(root);
    System.out.println(height(root));
    System.out.println(count(root));
    System.out.println(sum(root));
    System.out.println(diameter(root));
    System.out.println(diameter2(root).diam);
   // System.out.println(root.data);

}
}