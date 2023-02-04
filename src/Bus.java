import java.util.ArrayList;

class Bus extends PublicTransportation {
    static int maxPassenger = 30;
    static int fee = 1000;

    private ArrayList<Integer> busnumbers = new ArrayList<>();

    public Bus() {
        this.number = (int) (Math.random() * 1000);
        while (busnumbers.contains(this.number)) {
            this.number = (int) (Math.random() * 1000);
        }
        busnumbers.add(this.number);
        this.fuel = 100;
        this.status = "운행";

        System.out.println(this.number + "번 버스 생성"+ "\n");
    }

    public Bus(int number) {
        if (busnumbers.contains(number)) {
            while (busnumbers.contains(this.number)) {
                this.number = (int) (Math.random() * 1000);
            }
            System.out.println("해당 번호는 이미 사용중입니다.");
            System.out.println("임의의 번호를 부여합니다.");
        } else {
            this.number = number;
        }
        busnumbers.add(this.number);
        System.out.println(this.number + "번 버스 생성"+ "\n");
    }

    public void increaseFuel(int fuel) {
        this.fuel += fuel;
        System.out.println("현재 주유량 : " + this.fuel + "\n");
    }

    public void decreaseFuel(int fuel) {
        this.fuel -= fuel;
        System.out.println("현재 주유량 : " + this.fuel);

        if (this.fuel < 10) {
            System.out.println("주유가 필요합니다.");
        }
        if (this.fuel < 0) {
            this.fuel = 0;
            this.status = "차고지행";
            System.out.println("기름이 없어 차고지로 돌아갑니다.");
        }
    }

    public void increasePassenger(int passengers) {
        if (this.passengers + passengers > maxPassenger) {
            System.out.println("최대 승객 수를 초과하였습니다"+ "\n");
        } else {
            System.out.println("탑승 승객 수 : " + passengers);

            this.passengers += passengers;
            System.out.println("잔여 승객 수 : " + (maxPassenger - this.passengers));

            System.out.println("요금 확인 : " + passengers * fee + "\n");
            income += passengers * fee;
        }
    }
    public void decreasePassenger(int passengers) {
        if(!(0 < passengers && passengers <= this.passengers)) {
            System.out.println("올바른 승객 수를 입력하세요.");
        } else {
            this.passengers -= passengers;
            System.out.println("하차 승객 수 : " + passengers);
            System.out.println("잔여 승객 수 : " + (maxPassenger - this.passengers) + "\n");
        }
    }

}