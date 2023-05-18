package ex32;

class Pet {
    public void move(){
        System.out.println("애완동물이 움직입니다.");
    }
}

class Dog extends Pet {
    String name;
    int weight;

    int getWeight() {
        return this.weight;
    }
}

class Bird extends Pet {
    String type;
    boolean flight;

    boolean canFlight() {
        return flight;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Bird bird1 = new Bird();

        dog1.name = "누렁이";
        dog1.weight = 10;

        bird1.type = "앵무새";
        bird1.flight = true;

        dog1.move();
        bird1.move();

        System.out.println("강아지의 이름은 " + dog1.name + "이고, 몸무게는 " + dog1.getWeight() + "KG입니다.");
        System.out.println("새의 종류는 " +bird1.type+"고, 날 수 " + (bird1.canFlight() ? "있":"없")+"습니다");
    }
}