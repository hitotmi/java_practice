public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(name + "は" + food + "を食べています");
    }

    public void sleep() {
        System.out.println(name + "は寝ています");
    }
    
    public abstract void makeSound();
}