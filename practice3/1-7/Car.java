public class Car {
  private int gear = 1;
  private int speed = 10;
  
  public void gearChange(int afterGear) {
      gear = afterGear;
      
      if(gear >= 1 && gear <= 5) {
          speed = gear * 10;
      } else {
          speed = 10;
      }
  }
  
    public void run() {
        System.out.println("現在の速度は" + speed + "kmです。");
    }
}