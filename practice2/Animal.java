public class Animal {
    int pace;  // 1から5の歩調
    int speed;  // 歩行速度

    public Animal() {
        this.pace = 1;
        this.speed = 10;
    }

    public void paceChange(int afterPace) {
        this.pace = afterPace;

        switch (this.pace) {
            case 1:
                this.speed = 10;
                break;
            case 2:
                this.speed = 20;
                break;
            case 3:
                this.speed = 30;
                break;
            case 4:
                this.speed = 40;
                break;
            case 5:
                this.speed = 50;
                break;
            default:
                this.speed = 10;
                break;
        }
    }

    public void walk() {
        System.out.println("この動物は時速 " + this.speed + "kmで歩いています。");
    }
}
