import java.util.Scanner;

public class Nomor1 {
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
    }System.out.println(honorLembur);
    
    scanner.close();
    }
}
