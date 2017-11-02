package animal;

public class Cat extends Animal {
    private String voice = "にゃーにゃー";

    public void bark() {
        System.out.println(this.voice);
    }
}