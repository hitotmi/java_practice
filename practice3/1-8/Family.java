public abstract class Family {
    public String familyName;
    public String givenName;
    public String address;

    public void commonIntroduce() {
        System.out.println("私の名前は " + familyName + " " + givenName + "で、住所は " + address + " です。");
    }

    public abstract void eachIntroduce();

    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }
}