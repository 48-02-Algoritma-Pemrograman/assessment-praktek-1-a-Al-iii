import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String namaDriver="", inputLagi="";
        int totalTrip=0, tripBeliau=0, tripKita=0, tripMereka=0;
        double omzet=0;
    
        for (int i=1;i<=4;i++) {
        namaDriver=scanner.nextLine();   
            
        switch (namaDriver) {
            case "Beliau":
                tripBeliau+=scanner.nextInt();
                omzet=tripBeliau*13000;
                break;
            
            case "Mereka":
                tripMereka=scanner.nextInt();
                totalTrip+=tripMereka;
                break;

            case "Kita":
                tripKita=scanner.nextInt();
                totalTrip+=tripKita;
                break;
        
            default:
                break;
        }

        inputLagi=scanner.nextLine().toUpperCase();
    
    }
    totalTrip+=tripBeliau+tripMereka+tripKita;  
    System.out.println(totalTrip);
    System.out.println(omzet);

    scanner.close();
    }
}
