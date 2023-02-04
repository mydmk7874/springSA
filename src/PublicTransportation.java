public class PublicTransportation {
    static int maxPassenger;
    int passengers;
    int number;
    static int fee;
    int fuel;
    String status;
    int income;
    int currentVelocity;

    public void changeStatus() {
        if (status.equals("운행")) {
            status = "차고지행";
        } else if (status.equals("차고지행")) {
            status = "운행";
        }
        System.out.println("상태 : " + status+ "\n");
    }

    public void viewStatus() {
        System.out.println("현재 상태 : " + status);
        System.out.println("현재 주유량 : " + fuel+ "\n");
    }

    public void setCurrentVelocity(int velocity) {
        if (velocity >= 0) {
            currentVelocity = velocity;
        }
        System.out.println("현재 속도 : " + currentVelocity + "\n");
    }
}
