package virtual_pet_shelter;

import java.util.Scanner;

public class VirtualPetApp {
        private static VirtualPetShelter currentPetShelterList = new VirtualPetShelter();

        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                boolean quit = false;
                // VirtualPetShelter petShelterAnimalDescriptionList = new
                // VirtualPetShelter(null, null);
                VirtualPet firstAdopteeDescription = new VirtualPet("Shortcake",
                                "White long haired cat that enjoys being brushed");
                currentPetShelterList.addNewPet(firstAdopteeDescription);
                VirtualPet secondAdopteeDescription = new VirtualPet("Peppermint",
                                "Black short haired cat that loves playing with string toys");
                currentPetShelterList.addNewPet(secondAdopteeDescription);
                VirtualPet thirdAdopteeDescription = new VirtualPet("Charlotte",
                                "Chocolate lab that enjoys daily walks in the park");
                currentPetShelterList.addNewPet(thirdAdopteeDescription);
                VirtualPet fourthAdopteeDescription = new VirtualPet("Clementine",
                                "Gray pitbull that enjoys jogs and belly rubs");
                currentPetShelterList.addNewPet(fourthAdopteeDescription);
                VirtualPet fifthAdopteeDescription = new VirtualPet("Zoolander",
                                "Russian blue cat that enjoys short walks outside");
                currentPetShelterList.addNewPet(fifthAdopteeDescription);
                System.out.println("");
                System.out.println(
                                "---------------------------------------------------------------------------------------------------------------------------");
                System.out.println("");
                System.out.println("Welcome to Shaggy & Scooby's Rescue!");
                System.out.println("It's no mystery that these pets need a home.");
                System.out.println("Please take a look at our available fuzzy friends.");
                System.out.println("");
                System.out.println("Name\t\t\t\t\tHunger\tThirst\tBoredom");
                System.out.println(
                                "---------------------------------------------------------------------------------------------------------------------------");
                for (VirtualPet pet : currentPetShelterList.getShelterPetList()) {
                        System.out.println(pet.getPetName() + "\t\t\t\t"
                                        + pet.getPetHunger() + "\t"
                                        + pet.getPetThirst() + "\t" + pet.getPetBoredom());
                        System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------------------");
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
                        for (VirtualPet pet : currentPetShelterList.getShelterPetList()) {
                                pet.tick();
                        }
                        if (userInput == 1) {
                                currentPetShelterList.feedAllAdoptees();
                                screenDisplay();
                        } else if (userInput == 2) {
                                currentPetShelterList.waterForAllAdoptees();
                                screenDisplay();
                        } else if (userInput == 3) {
                                System.out.println("Here is our current pet list with descriptions:");
                                System.out.println("Name\t\t\tDescription");
                                for (VirtualPet animal : currentPetShelterList.getShelterPetList()) {
                                        System.out.println("");
                                        System.out.println(animal.getPetName() + "\t\t" + animal.getPetDescription()
                                                        + "\t\t");
                                        System.out.println(
                                                        "---------------------------------------------------------------------------------------------------------------------------");
                                }
                                System.out.println("Please enter the name of the pet you wish to play with");
                                String userPetPlay = input.nextLine();
                                currentPetShelterList.playWithSelectedAnimal(userPetPlay);
                                screenDisplay();
                        } else if (userInput == 4) {
                                System.out.println("Here is our current pet list with descriptions:");
                                System.out.println("Name\t\t\tDescription");
                                for (VirtualPet animal : currentPetShelterList.getShelterPetList()) {
                                        System.out.println("");
                                        System.out.println(animal.getPetName() + "\t\t" + animal.getPetDescription()
                                                        + "\t\t");
                                        System.out.println(
                                                        "---------------------------------------------------------------------------------------------------------------------------");
                                }
                                System.out.println("Please enter the name of the pet you would like to adopt.");
                                String adoptedPetName = input.nextLine();
                                currentPetShelterList.removeAdoptedPet(adoptedPetName);
                                screenDisplay();
                        } else if (userInput == 5) {
                                System.out.println("Please enter the name of the animal");
                                String surrenderedPetName = input.nextLine();
                                System.out.println("Please enter a description of the pet:");
                                System.out.println(
                                                "Format: color and breed + brief description about what the animal enjoys");
                                String surrenderedPetDescription = input.nextLine();
                                VirtualPet addedAnimal = new VirtualPet(surrenderedPetName, surrenderedPetDescription);
                                currentPetShelterList.addNewPet(addedAnimal);
                                System.out.println(
                                                surrenderedPetName + " has been accepted and will be cared for here.");
                                screenDisplay();
                        } else if (userInput == 6) {
                                System.out.println("Thank you for your interest.");
                                System.out.println(
                                                "Please come back if you're ever interested in adopting a furry friend!");
                                quit = true;
                        }
                } while (!quit);
                input.close();
        }

        public static void screenDisplay() {
                System.out.println("");
                System.out.println("Name\t\t\t\t\tHunger\tThirst\tBoredom");
                System.out.println(
                                "---------------------------------------------------------------------------------------------------------------------------");
                for (VirtualPet pet : currentPetShelterList.getShelterPetList()) {
                        System.out.println(
                                        pet.getPetName() + "\t\t\t\t"
                                                        + pet.getPetHunger() + "\t" + pet.getPetThirst()
                                                        + "\t" + pet.getPetBoredom());
                        System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------------------");
                }
        }
}
