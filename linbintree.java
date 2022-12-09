import java.util.*;

class TreeNode
    {
        int data;
        TreeNode left,right;
        TreeNode(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    class ListNode
    {
        int data;
        ListNode next;
        ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public class linbintree {
        public static ListNode push(ListNode head, int data) {
            ListNode node = new ListNode(data);
            node.next=head;
            node.data=data;
            return node;  
        }
        public static void preorder(TreeNode root)
        {
            if(root==null)
            {
                return;
            }
            System.out.println(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    public static TreeNode cltbt(ListNode head)
    {
        if(head==null)
        {
            return null;
        }
        TreeNode root=new TreeNode(head.data);
        head=head.next;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(head!=null)
        {
            TreeNode front=q.poll();
            front.left= new TreeNode(head.data);
            q.add(front.left);
            head=head.next;
            if(head!=null)
            {
                front.right=new TreeNode(head.data);
                q.add(front.right);
                head=head.next;
            }
        }
        return root;
    }
    public static void main(String[] args) {
        ListNode head=null;
        head=push(head,1);
        head=push(head,2);
        head=push(head,5);
        head=push(head,3);
        head=push(head,6);
        head=push(head,10);
        head=push(head,154);
        head=push(head,164);
        head=push(head,1);
        TreeNode root = cltbt(head);
        preorder(root);
    }
}
