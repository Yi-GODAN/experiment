package setup6.Tree;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/08 16:29
 */
public class BinaryBalancedTree<Key extends Comparable<Key>, Value> {

    private Node root;

    private class Node {
        Key key;
        Value value;
        Node left, right;
        int height;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }

        public String toString() {
            return "[" + key + "," + value + "," + height + "]";
        }
    }

    private int height(Node h) {
        return h == null ? -1 : h.height;
    }

    private int updateHeight(Node h) {
        return Math.max(height(h.left), height(h.right)) + 1;
    }

    // 右旋
/*    private Node rotateRight(Note h) {

    }*/
}
