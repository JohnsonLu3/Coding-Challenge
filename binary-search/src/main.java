import java.util.LinkedList;
import java.util.Random;

public class main {

    public static void main(String args[]){
        Node root = new Node(2);
        createRandomTree(root, 5);
        BFS(root);

        System.out.println("---------------------------");

        DFS(root);

    }

    public static void createRandomTree(Node n, int count){
        if(count <= 0) return;

        n.left = new Node(new Random().nextInt(10));
        n.right = new Node(new Random().nextInt(10));

        createRandomTree(n.left, count-2);
        createRandomTree(n.right, count-2);

        return;
    }

    public static void BFS(Node n){
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(n);

        while(!queue.isEmpty()){
            Node curr = queue.poll();
            System.out.println(curr.val);
            if(curr.left != null) queue.add(curr.left);
            if(curr.right != null) queue.add(curr.right);
        }
    }

    public static void DFS(Node n){
        if(n == null) return;

        System.out.println(n.val);
        DFS(n.left);
        DFS(n.right);
    }
}
