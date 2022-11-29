
class Vehicle {
    int maxSpeed = 60;

    void move() {
        System.out.println("Vehicle move");
    }
}

class Bus extends Vehicle {
    String regularRoute = "98番と等しい";

    @Override
    void move() {
        System.out.println("Bus move");
    }

    void pickup() {
        System.out.println("pick up a passenger");
    }

    void dropoff() {
        System.out.println("drop off some passenger");
    }
}

class DumpCar extends Vehicle {
    int maxLoad = 2000;

    @Override
    void move() {
        System.out.println("Dump move");
    }
}

public class Main {
    public static void main(String[] args) {
        // 擬似コード2（ポリモーフィズムがある状況）
        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Bus();
        vehicles[1] = new Bus();
        vehicles[2] = new Bus();
        vehicles[3] = new DumpCar();
        vehicles[4] = new DumpCar();

        // どれだけサブクラスが増えたとしても、
        // シミュレータ側では下記ループ文だけで全オブジェクトを操作できる。
        for (var vehicle : vehicles) {
            vehicle.move();
            // オーバーライドにより、オブジェクト自身のメソッドが実行される。
        }
    }
}
