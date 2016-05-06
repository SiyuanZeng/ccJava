package Question3_7_AnimalQueue._166;

/**
 * Created by SiyuanZeng's on 9/10/2014.
 */
public class Animal {
    private int order;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal (){}

    public Animal (String name) {
        this.name = name;
    }


    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public boolean hasOrderBiggerthan(Animal animal) {
        return getOrder() > animal.getOrder();
    }
}

