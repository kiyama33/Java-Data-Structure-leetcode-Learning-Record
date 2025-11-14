package DataStructure.LinkedList;

// 节点类：value为Object类型，支持任意数据
class Node {
    Object value; // 存储任意类型数据
    Node prev;    // 双向链表的前指针（单向链表只需next）
    Node next;    // 后指针

    public Node(Object value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}

// 测试：int节点指向String节点
public class DifferTEst {
    public static void main(String[] args) {
        // 创建存储int的节点（注意：int是基本类型，需装箱为Integer）
        Node intNode = new Node(100); // 自动装箱为Integer.valueOf(100)
        // 创建存储String的节点
        Node stringNode = new Node("hello");

        // 让int节点的next指向string节点
        intNode.next = stringNode;
        // 双向链表中，还可以让string节点的prev指向int节点
        stringNode.prev = intNode;

        // 访问数据（需要向下转型）
        int num = (Integer) intNode.value; // 强制转型为Integer，再自动拆箱为int
        String str = (String) stringNode.value; // 强制转型为String

        System.out.println("int节点的值：" + num); // 输出：100
        System.out.println("string节点的值：" + str); // 输出：hello
        System.out.println("int节点的下一个是：" + (String) intNode.next.value); // 输出：hello
    }
}

