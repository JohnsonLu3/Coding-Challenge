import java.util.HashSet;

public class main {

    /**
     *  O(N) method
     *  1 loop of O(N) to find length of linked list
     *  and 1 loop of O(N-k) to find the kth element
     */

    public static Node returnKthelement(Node n, int k){
        if(n == null) return null;

        Node temp = n;
        Node kth;

        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }

        int index = 0;
        while(index < (length-k) && n != null){
            n = n.next;
            index++;
        }

        return n;
    }

    public static Node printIntersection(Node n, Node b){
        if(n == null || b == null) return null;

        HashSet<Node> nodes = new HashSet<>();

        while(n != null){
                nodes.add(n);
                n = n.next;
        }

        while(b != null){
            if(nodes.contains(b))
                return b;

            b = b.next;
        }

        return null;
    }

    public static void main(String args[]){

        Node n1 = new Node(2);
        Node n2 = new Node(6);
        Node n3 = new Node(7);
        Node n4 = new Node(3);

        Node b1 = new Node(2);
        Node b2 = new Node(2);
        Node b3 = new Node(3);
        Node b4 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = n3;

        System.out.println(returnKthelement(n1, 2).val);
        System.out.println(printIntersection(n1, b1).val);
    }
}
