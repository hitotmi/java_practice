public class Main {
    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        wizard.setName("majo");
        wizard.setHp(100);
        wizard.setMp(50);

        Wand wand = new Wand();
        wand.setName("niwatoco");
        wand.setPower(10.0);

        wizard.setWand(wand);

        Hero hero = new Hero();
        hero.setName("hero");
        hero.setHp(80);

        wizard.heal(hero);
    }
}
