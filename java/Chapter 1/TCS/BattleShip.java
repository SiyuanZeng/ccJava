package TCS;

public class BattleShip<E>
{
    public <T extends E> void fire(T t) {
        if (t.getClass() == Missile.class) {
            System.out.println("Launch");
        } else if (t.getClass() == Shell.class) {
            System.out.println("Fire");
        }
    }
}
