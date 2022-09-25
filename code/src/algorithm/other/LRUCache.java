package algorithm.other;
import java.util.HashMap;

class DLinkedNode {
    int key;
    int val;
    DLinkedNode prev;
    DLinkedNode next;
    
    public DLinkedNode() {}

    public DLinkedNode(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class LRUCache {
    private int compacity;
    private int size;
    private HashMap<Integer, DLinkedNode> cache;
    private DLinkedNode head;
    private DLinkedNode tail;

    public LRUCache(int compacity) {
        this.compacity = compacity;
        this.size = 0;
        this.cache = new HashMap<>();
        this.head = new DLinkedNode();
        this.tail = new DLinkedNode();
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public int get(int key) {
        DLinkedNode target = cache.get(key);

        if(target==null) {
            return -1;
        }

        moveToHead(target);

        return target.val;
    }

    public void put(int key, int value) {
        DLinkedNode target = cache.get(key);

        if(target!=null) {
            removeNode(target);
            target.val = value;
            addToHead(target);
        } else {
            target = new DLinkedNode(key, value);
            if(size>=compacity) {
                int last = removeTail();
                cache.remove(last);
                size--;
            }
            addToHead(target);
            cache.put(key, target);
            size++;
        }
    }

    public void removeNode(DLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void addToHead(DLinkedNode node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    public void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    public int removeTail() {
        DLinkedNode target = tail.prev;
        removeNode(target);

        return target.key;
    }
}