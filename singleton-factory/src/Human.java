public class Human extends Ennemy {
    int power;

    Human(int power) {
        this.power = power;
    }

    void attack() {
        System.out.println("Sword attack");
    }
}
