package Question11_7.Practice01;

/**
 * Created by SiyuanZeng's on 10/15/2014.
 */
public class HeightWeight implements Comparable {
    private int wt;
    private int ht;

    public int getWt() {
        return wt;
    }

    public int getHt() {
        return ht;
    }

    public HeightWeight(int wt, int ht) {
        this.wt = wt;
        this.ht = ht;
    }

    @Override
    public int compareTo(Object another) {
        if (null == another || !(another instanceof HeightWeight)) return -1;
        // When I read, it makes sense to me, but now I just can't remember what happened. Read through it may be necessary.
        HeightWeight anotherHw = (HeightWeight)another;
        if (this.wt == anotherHw.wt) {
            return (this.ht) - (anotherHw.ht);
        } else {
            return (this.wt) - (anotherHw.wt);
        }
    }


    public boolean isLargerThan(HeightWeight another) {
        if (null == another) return false;
        if (this.wt > another.wt && this.ht > another.ht) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "HeightWeight{" +
                "wt=" + wt +
                ", ht=" + ht +
                '}';
    }
}

