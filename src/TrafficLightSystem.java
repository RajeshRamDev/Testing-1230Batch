import java.util.Scanner;

public class TrafficLightSystem {
    Scanner sc = new Scanner(System.in);
    int choice;
    public void trafficMethod()
    {
        System.out.println("Enter the Colour Choice: 1 for Red, 2 for Yellow, 3 for Green");
        choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("RED - TRAFFIC STOP");
                break;
            case 2 :
                System.out.println("YELLOW - TRAFFIC TO BE READY");
                break;
            case 3:
                System.out.println("GREEN - TRAFFIC CAN GO");
                break;

        }
    }

    public static void main(String[] args) {
        TrafficLightSystem tl = new TrafficLightSystem();
        tl.trafficMethod();
    }
}
