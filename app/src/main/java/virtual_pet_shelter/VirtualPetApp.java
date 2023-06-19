package virtual_pet_shelter;

import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        VirtualPetShelter currentPetShelterList = new VirtualPetShelter();
        System.out.println("");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Welcome to Shaggy & Scooby's Rescue!");
        System.out.println("It's no mystery that these pets need a home.");
        System.out.println("Please take a look at our available fuzzy friends.");
        System.out.println("");
        System.out.println("Name\t\t\tDescription\t\t\t\t\t\t\t\tHunger\tThirst\tBoredom");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------------------");
        for (VirtualPet pet : currentPetShelterList.getShelterPetList()) {
            System.out.println(pet.getPetName() + "\t\t" + pet.getPetDescription() + "\t\t" + pet.getPetHunger() + "\t"
                    + pet.getPetThirst() + "\t" + pet.getPetBoredom());
            System.out.println(
                    "---------------------------------------------------------------------------------------------------------------------------");
                    pet.tick();
        }
        do {
            System.out.println("Please enter a number to make a selection:");
            System.out.println("1 -- Feed all pets");
            System.out.println("2 -- Give all pets water");
            System.out.println("3 -- Play with a pet");
            System.out.println("4 -- Adopt a pet");
            System.out.println("5 -- Surrender an animal to the shelter");
            System.out.println("6 -- Exit");
            int userInput = input.nextInt();
            input.nextLine();
            if (userInput == 1) {
                currentPetShelterList.feedAllAdoptees();
                System.out.println("");
                System.out.println("Name\t\t\tDescription\t\t\t\t\t\t\t\tHunger\tThirst\tBoredom");
                System.out.println(
                        "---------------------------------------------------------------------------------------------------------------------------");
                for (VirtualPet pet : currentPetShelterList.getShelterPetList()) {
                    System.out.println(
                            pet.getPetName() + "\t\t" + pet.getPetDescription() + "\t\t" + pet.getPetHunger() + "\t"
                                    + pet.getPetThirst() + "\t" + pet.getPetBoredom());
                    System.out.println(
                            "---------------------------------------------------------------------------------------------------------------------------");
                }
            } else if (userInput == 2) {
                currentPetShelterList.waterForAllAdoptees();
                System.out.println("");
                System.out.println("Name\t\t\tDescription\t\t\t\t\t\t\t\tHunger\tThirst\tBoredom");
                System.out.println(
                        "---------------------------------------------------------------------------------------------------------------------------");
                for (VirtualPet pet : currentPetShelterList.getShelterPetList()) {
                    System.out.println(
                            pet.getPetName() + "\t\t" + pet.getPetDescription() + "\t\t" + pet.getPetHunger() + "\t"
                                    + pet.getPetThirst() + "\t" + pet.getPetBoredom());
                    System.out.println(
                            "---------------------------------------------------------------------------------------------------------------------------");
                }
            } else if (userInput == 3) {
                System.out.println("Please enter the name of the pet you wish to play with.");
                String userPetPlay = input.nextLine();
                currentPetShelterList.playWithSelectedAnimal(userPetPlay);
                System.out.println("");
                System.out.println("Name\t\t\tDescription\t\t\t\t\t\t\t\tHunger\tThirst\tBoredom");
                System.out.println(
                        "---------------------------------------------------------------------------------------------------------------------------");
                for (VirtualPet pet : currentPetShelterList.getShelterPetList()) {
                    System.out.println(
                            pet.getPetName() + "\t\t" + pet.getPetDescription() + "\t\t" + pet.getPetHunger() + "\t"
                                    + pet.getPetThirst() + "\t" + pet.getPetBoredom());
                    System.out.println(
                            "---------------------------------------------------------------------------------------------------------------------------");
                }
            } else if (userInput == 4) {
                System.out.println("Please enter the name of the pet you would like to adopt.");
                String adoptedPetName = input.nextLine();
                currentPetShelterList.removeAdoptedPet(adoptedPetName);
                System.out.println("");
                System.out.println("Name\t\t\tDescription\t\t\t\t\t\t\t\tHunger\tThirst\tBoredom");
                System.out.println(
                        "---------------------------------------------------------------------------------------------------------------------------");
                for (VirtualPet pet : currentPetShelterList.getShelterPetList()) {
                    System.out.println(
                            pet.getPetName() + "\t\t" + pet.getPetDescription() + "\t\t" + pet.getPetHunger() + "\t"
                                    + pet.getPetThirst() + "\t" + pet.getPetBoredom());
                    System.out.println(
                            "---------------------------------------------------------------------------------------------------------------------------");
                }
            } else if (userInput == 5) {
                System.out.println("Please enter the name of the animal");
                String surrenderedPetName = input.nextLine();
                System.out.println("Please enter a brief description");
                System.out.println("Template: Male/Female. X yrs old. Enjoys x, y , z.");
                String surrenderedPetDescription = input.nextLine();
                VirtualPet addedAnimal = new VirtualPet(surrenderedPetName, surrenderedPetDescription, 0, 0, 0);
                currentPetShelterList.addNewPetForAdoption(addedAnimal);
                System.out.println(surrenderedPetName + " has been accepted and will be cared for here.");
                System.out.println("");
                System.out.println("Name\t\t\tDescription\t\t\t\t\t\t\t\tHunger\tThirst\tBoredom");
                System.out.println(
                        "---------------------------------------------------------------------------------------------------------------------------");
                for (VirtualPet pet : currentPetShelterList.getShelterPetList()) {
                    System.out.println(
                            pet.getPetName() + "\t\t" + pet.getPetDescription() + "\t\t" + pet.getPetHunger() + "\t"
                                    + pet.getPetThirst() + "\t" + pet.getPetBoredom());
                    System.out.println(
                            "---------------------------------------------------------------------------------------------------------------------------");
                }
            } else if (userInput == 6) {
                System.out.println("Thank you for your interest.");
                System.out.println("Please come back if you're ever interested in adopting a furry friend!");
                quit = true;
            }
        } while (!quit);
        input.close();
        // don't forget about the tick()
        // don't forget to add a read me
    }
}
