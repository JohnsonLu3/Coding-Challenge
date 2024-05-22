public class Node {

    int val;
    Node left;
    Node right;
    boolean visited = false;

    public Node(int val){
        this.val = val;
    }

    public int val(){
        return val;
    }
}
