package animal;

public class Dog extends Animal {
    private String voice = "わんわん";

    public void bark() {
        System.out.println(this.voice);
    }
}