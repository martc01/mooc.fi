package Part4.Ex17PersonalInformation;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();

        while(true) {
            System.out.print("First name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();
            
            System.out.print("Identification number: ");
            String id = scanner.nextLine();

            infoCollection.add(new PersonalInformation(name, lastName, id));
        } 
        
        for(PersonalInformation personalInformation : infoCollection) {
            System.out.println(personalInformation.getName() + " " + personalInformation.getLastName());
        }
    }
}