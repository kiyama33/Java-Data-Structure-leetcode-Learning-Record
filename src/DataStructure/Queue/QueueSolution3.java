package DataStructure.Queue;

import java.util.ArrayDeque;

class Checkout {
    private ArrayDeque<Integer> cart;
    private ArrayDeque<Integer> findmax;
    public Checkout() {
        cart = new ArrayDeque<>();
        findmax = new ArrayDeque<>();
    }
    public int get_max() {
        if (cart.isEmpty()) {
            return -1;
        }
        return findmax.peekFirst();
    }
    public void add(int value) {
        cart.addLast(value);
        while (!findmax.isEmpty()&&value>findmax.peekLast()) {
            findmax.pollLast();
        }
        findmax.addLast(value);
    }
    public int remove() {
        if (cart.isEmpty()) {
            return -1;
        }
        int res = cart.pollFirst();
        if (findmax.peekFirst()==res){
            findmax.pollFirst();
        }
        return res;
    }
}
