public class Ogre extends Ennemy {
    int power;

    Ogre(int power) {
        this.power = power;
    }

    void attack() {
        System.out.println("Fist attack");
    }
}
