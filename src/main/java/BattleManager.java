public class BattleManager {
    public void startBattle(Hero hero, Enemy enemy) {
        System.out.println(hero.name + " engages in battle with " + enemy.name + "!");
        if (hero.level >= enemy.level) {
            System.out.println(hero.name + " wins!");
        } else {
            System.out.println(enemy.name + " wins!");
        }
    }
}
