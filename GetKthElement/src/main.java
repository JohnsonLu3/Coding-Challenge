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


    public static void main(String args[]){

        Node n1 = new Node(2);
        Node n2 = new Node(6);
        Node n3 = new Node(1);
        Node n4 = new Node(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        System.out.println(returnKthelement(n1, 2).val);
    }
}
