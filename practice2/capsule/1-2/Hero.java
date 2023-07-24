public class Hero {
    private int hp;
    private String name;

    public int getHp() { return this.hp; }
    public void setHp(int hp) {
        if (hp < 0)
            { this.hp = 0; }
        else
            { this.hp = hp; }
    }

    public String getName() {return this.name; }
    public void setName(String name) {
        if(name == null || name.length() < 3) {
            throw new IllegalArgumentException("英雄に設定されている名前が異常です");
        } else {
            this.name = name;
        }
    }
}
