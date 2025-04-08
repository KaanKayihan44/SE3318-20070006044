public class Warrior extends Hero implements Questable {
    public Warrior(String name, int level) {
        super(name, level);
    }

    public void attack() {
        System.out.println(name + " strikes with a sword!");
    }

    @Override
    public void acceptQuest(String questName) {
        System.out.println(name + " accepts the quest: " + questName);
    }
}
