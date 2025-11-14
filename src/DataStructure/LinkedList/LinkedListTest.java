package DataStructure.LinkedList;

public class LinkedListTest {
    int val;
    LinkedListTest next;
    LinkedListTest(int x){
        val = x;
    }
    void insert(LinkedListTest n0,LinkedListTest p){
        LinkedListTest n1 = n0.next;
        p.next = n1;
        n0.next = p;
    }
    void delete(LinkedListTest n0){
        LinkedListTest p = n0.next;
        LinkedListTest n1 = p.next;
        n0.next = n1;
    }
    LinkedListTest access(LinkedListTest head,int index){
        for (int i=0;i<index;i++){
            head=head.next;
        }
        return head;
    }// access to a node,O(n)
    int find(LinkedListTest head,int target){
        int index = 0;
        while(head!=null){
            if (head.val == target){
                return index;
            }
            index++;
            head=head.next;
        }
        return -1;
    }//find,O(n)
    public static void main(String[] args){
        LinkedListTest node1 = new LinkedListTest(1);
        LinkedListTest node2 = new LinkedListTest(2);
        LinkedListTest node3 = new LinkedListTest(3);
        LinkedListTest node4 = new LinkedListTest(4);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
    }
}
