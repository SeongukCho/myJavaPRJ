package javaEx.ex33;

class Pet {
    public void move(){
        System.out.println("슈퍼클래스 move() : 애완동물이 움직입니다.");
    }
}

class Dog extends Pet{

}

class Bird extends Pet{
    @Override
    public void move() {
        System.out.println("서브클래스 move() : 새가 날아갑니다.");
    }
}

public class Main{
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Bird bird1 = new Bird();

        dog1.move();
        bird1.move();
    }
}
