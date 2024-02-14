// https://leetcode.com/problems/lru-cache/description/


class LRUCache {
    class Node {
        int Key, Value;
        Node(int key, int value){
            Key = key;
            Value = value;
        }
    }
    LinkedList<Node> queue;
    Map<Integer, Node> map;
    public int cap;
    public LRUCache(int capacity) {
        queue = new LinkedList<Node>();
        map = new HashMap<>(capacity);
        cap = capacity;
    }
    
    public int get(int key) {
        Node node = map.getOrDefault(key, null);
        if (node != null){
            queue.remove(node);
            queue.addLast(node);
            return node.Value;
        }
        else {
            return -1;
        }
    }

    public void evict(){
        Node node = queue.peekFirst();
        int key = node.Key;
        queue.removeFirst();
        map.remove(key);
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)){
            Node node = map.getOrDefault(key, null);
            node.Value = value;
            queue.remove(node);
            queue.addLast(node);
        } else {
            if (map.size() == cap)
                evict();
            Node node = new Node(key, value);
            map.put(key, node);
            queue.addLast(node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
