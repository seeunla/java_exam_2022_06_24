public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.maxSpeed = 230;
        car2.maxSpeed = 210;

        car1.달리다();
        car2.달리다();
    }
}

class Car {
    public int maxSpeed;
    void 달리다() {
        System.out.println("자동차가 최고속력" + this.maxSpeed + "로 달립니다 ");
    }
}