import java.util.Scanner;

public class praktek {
    public static void main(String[] args) {
        int jamLembur = 0;
        double honorLembur = 0;
        Scanner scanner= new Scanner(System.in);

        jamLembur= scanner.nextInt();

        for (int i = 1; i<=jamLembur; i++){
        if (i<=16) {
            honorLembur+=10000;
        } else if (i>16) {
            honorLembur+=15000;
        }
    }
    System.out.println("Total jam lembur: "+ jamLembur);
    System.out.println("Honor lembur: " + honorLembur);
    
    scanner.close();
    }
}
