package Question3_7_AnimalQueue._165;

public abstract class Animal {
    private int order;
    protected String name; 	 // What is this for?
    public Animal (String n) { this.name = n;}

    public abstract String name();

    public void setOrder(int ord) { order = ord;}

    public int getOrder() {
        return order;
    }
    public boolean isOlderThan (Animal a ) {
        return this.order < a.getOrder() ;
    }
}
