public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage("Aria", 5);
        Warrior warrior = new Warrior("Thorin", 6);
        Enemy enemy = new Enemy("Zargoth", 4);

        mage.speak();
        mage.castSpell();

        warrior.speak();
        warrior.attack();

        QuestBoard questBoard = new QuestBoard();
        questBoard.assignQuest(mage, "Defeat the Goblin King");
        questBoard.assignQuest(warrior, "Protect the Village");

        BattleManager battleManager = new BattleManager();
        battleManager.startBattle(mage, enemy);
        battleManager.startBattle(warrior, enemy);
    }
}
