class Pet {
    private int age;
    private String type;

    Pet(int age, String type) {
        this.age = age;
        this.type = type;
    }

    public void move() {
        System.out.println(this.type + "가 움직입니다.");
    }

    public String getType() {
        return this.type;
    }

    public int getAge() {
        return this.age;
    }
}

public class ex29 {
    public static void main(String[] args) {
        Pet cat = new Pet(13, "고양이");
        Pet dog = new Pet(8, "강아지");

        System.out.println(cat.getType() + "가 움직입니다.");
        System.out.println(dog.getType() + "가 움직입니다.");
        System.out.println(cat.getType() + "는 " + cat.getAge() + "개월입니다.");
        System.out.println(dog.getType() + "는 " + dog.getAge() + "개월입니다.");

    }
}
