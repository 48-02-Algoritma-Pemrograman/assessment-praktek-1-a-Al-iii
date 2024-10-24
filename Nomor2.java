import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String namaDriver="", inputLagi="";
        int lamaTrip=0, totalTrip=0;
        double omzet=0;
    
        while (inputLagi=="Y") {
            namaDriver=scanner.nextLine().toLowerCase();
            lamaTrip=scanner.nextInt();
            inputLagi=scanner.nextLine().toUpperCase();
            
        switch (namaDriver) {
            case "beliau":
                totalTrip+=lamaTrip;
                break;
            
            case "mereka":
                totalTrip+=lamaTrip;
                break;

            case "kita":
                totalTrip+=lamaTrip;
                break;
        
            default:
                break;
        }

        switch (inputLagi) {
            case "Y":
                
                break;

            case "N":
                
                break;
        
            default:
                break;
        }
    }

    }
}
