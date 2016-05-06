package Question11_8.Practice01;

/**
 * Created by SiyuanZeng's on 10/19/2014.
 */
public class RankNode{
    int leftSize = 0;
    RankNode left;
    RankNode right;
    int data;

    public RankNode(int data) {
        this.data = data;
    }

    public int getLeftSize() {
        return leftSize;
    }

    public void setLeftSize(int leftSize) {
        this.leftSize = leftSize;
    }

    public RankNode getLeft() {
        return left;
    }

    public void setLeft(RankNode left) {
        this.left = left;
    }

    public RankNode getRight() {
        return right;
    }

    public void setRight(RankNode right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    // When do I need to return boolean?
    //http://programmers.stackexchange.com/questions/147669/why-does-the-add-method-of-a-linkedlist-return-true-in-java
    public void insert(int data) {
        if (data <= this.data) {
            if (null != left) {
                left.insert(data);
            } else {
                left = new RankNode(data);
            }
            leftSize++;
        } else {
            if (null != right) {
                right.insert(data);
            } else {
                right = new RankNode(data);
            }
        }
    }

    public int getRank(int data) {
        if (data == this.data) {
            return leftSize + 1;
        } else if (data < this.data) {
            return left == null ? -1 : left.getRank(data);
        } else {
            int rightSize = right == null? -1 : right.getRank(data);
            return rightSize==-1? -1 : leftSize + 1 + rightSize;
        }
    }


}
