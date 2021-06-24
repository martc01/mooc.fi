package Part4.Ex18TelevisionPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> tvCollection = new ArrayList<>();

        while(true) {
            System.out.print("Name: ");
            String filmName = scanner.nextLine();

            if (filmName.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            int duration  = Integer.valueOf(scanner.nextLine());
            

            tvCollection.add(new TelevisionProgram(filmName, duration));
        } 

        System.out.println();
        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        
        for(TelevisionProgram _tvCollection : tvCollection) {
            if (_tvCollection.getDuration() <= maxDuration) {
                System.out.println(_tvCollection.toString());
            }
        }
    }
}