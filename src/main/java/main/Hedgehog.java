package main;

public class Hedgehog {
    private String name;
    private int age;

    public Hedgehog() {
        name = "Pikseli";
        age = 5;
    }

    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak(String variable) {
        if (variable != "") {
            System.out.println(name + ": " + variable);
        } else {
            System.out.println("Olen " + name + " ja ikäni on " + age + " vuotta, mutta antaisitko silti syötteen?");
        }
    }

    public void run(int number) {
        int i = 0;
        while (i < number) {
            System.out.println(name + " juoksee kovaa vauhtia!");
            i = i + 1;
            
        }
    }
}
