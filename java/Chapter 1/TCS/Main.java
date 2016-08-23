package TCS;

public class Main {

    public static void main(String[] args) {
        // TODO: Insert the code here
//        BattleShip<Object> battleShip = new BattleShip<>();

    //    BattleShip<Shell> battleShip = new BattleShip<>();

   //*     BattleShip battleShip = new BattleShip();

   //     BattleShip<Missile> battleShip = new BattleShip<>();

        BattleShip<Projectile> battleShip = new BattleShip<>();

        battleShip.fire(new Projectile());
        battleShip.fire(new Missile());
        battleShip.fire(new Shell());
    }
}