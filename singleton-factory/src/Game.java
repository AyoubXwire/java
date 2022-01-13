public class Game {
    public static void main(String[] args) {
        EnnemyFactory ennemyFactory = EnnemyFactory.getInstance();

        Ennemy e1 = ennemyFactory.getEnnemy(70);
        Ennemy e2 = ennemyFactory.getEnnemy(120);
        Ennemy e3 = ennemyFactory.getEnnemy(900);

        e1.attack();
        e2.attack();
        e3.attack();
    }
}
