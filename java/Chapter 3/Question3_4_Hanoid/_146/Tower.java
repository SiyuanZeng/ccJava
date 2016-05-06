package Question3_4_Hanoid._146;

import java.util.Stack;

public class Tower {
    public Stack<Integer> disks = new Stack<Integer>();
    public int index;


    public Tower(int index) {
        this.index = index;
    }

    public int index() {
        return index;
    }

    public void moveTop(Tower dest) {
        if (!disks.isEmpty()) {
            int v = disks.pop();
            dest.add(v);
        }
    }

    public void add(int v){
        if (!(disks.isEmpty())&& disks.peek() <= v) {
            System.out.println("Error placing disk " + v);
        } else {
            disks.push(v);
        }
    }

    public void print() {
        System.out.println("Contents of Tower " + index() + ": " + disks.toString());
    }

    public void moveTo(int n, Tower destination, Tower buffer) {
        if (n > 0) {
            String tag = "move_" + n + "_disks_from_" + this.index + "_to_" + destination.index + "_with_buffer_" + buffer.index;
            System.out.println("<" + tag + ">");
            moveTo(n - 1, buffer, destination);
            System.out.println("<move_top_from_" + this.index + "_to_" + destination.index + ">");
            System.out.println("<before>");
            System.out.println("<source_print>");
            this.print();
            System.out.println("</source_print>");
            System.out.println("<destination_print>");
            destination.print();
            System.out.println("</destination_print>");
            System.out.println("</before>");
            moveTop(destination);
            System.out.println("<after>");
            System.out.println("<source_print>");
            this.print();
            System.out.println("</source_print>");
            System.out.println("<destination_print>");
            destination.print();
            System.out.println("</destination_print>");
            System.out.println("</after>");
            System.out.println("</move_top_from_" + this.index + "_to_" + destination.index + ">");
            buffer.moveTo(n - 1, destination, this);
            System.out.println("</" + tag + ">");
        }
    }
}