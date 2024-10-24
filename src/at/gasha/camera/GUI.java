package at.gasha.camera;

import java.util.*;

import at.gasha.camera.Camera.RESOLUTION;

public class GUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isGoing = true;
        ArrayList<SDCard> availableSDCards = new ArrayList<>();

        Manufacturer canon = new Manufacturer("Canon", "Japan");
        SDCard sdCard1 = new SDCard(16);
        SDCard sdCard2 = new SDCard(16);
        SDCard sdCard3 = new SDCard(32);
        Lens lens = new Lens(10, canon);
        Camera camera = new Camera(0.4, "#FF003A", RESOLUTION.HIGH, canon, sdCard1, lens);

        availableSDCards.add(sdCard1);
        availableSDCards.add(sdCard2);
        availableSDCards.add(sdCard3);

        while (isGoing) {
            System.out.println("Enter a number to make the following actions:");
            System.out.println("1 - Take a photo");
            System.out.println("2 - Print all files");
            System.out.println("3 - Change SD-Card");
            System.out.println("4 - Change Resoultion");
            System.out.println("404 - Turn off the camera");
            int selectionNumber = scanner.nextInt();
            switch (selectionNumber) {
                case 1:
                    camera.takePicture();
                    break;
                case 2:
                    camera.getSdCard().printAllFiles();
                    break;
                case 3:
                    System.out.println("Change SD-Card");
                    break;
                case 4:
                    changeResolution(camera);
                    System.out.println("Resolution has been changed.");
                    break;
                case 404:
                    isGoing = false;
                    System.out.println("Camera is turning off!");
                    break;
                default:
                    System.out.println("There is no such option. Please write down a valid number.");
                    break;
            }
        }
    }

    public static void changeResolution(Camera camera) {
        boolean isGoing = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("You can choose between the following resolutions:");
        System.out.println("1 - LOW");
        System.out.println("2 - MEDIUM");
        System.out.println("3 - HIGH");
        while (isGoing) {
            int selectionNumber = scanner.nextInt();

            switch (selectionNumber) {
                case 1:
                    camera.setCurrentResolution(RESOLUTION.LOW);
                    isGoing = false;
                    break;
                case 2:
                    camera.setCurrentResolution(RESOLUTION.MEDIUM);
                    isGoing = false;
                    break;
                case 3:
                    camera.setCurrentResolution(RESOLUTION.HIGH);
                    isGoing = false;
                    break;
                default:
                    System.out.println("The selection is not valid. Please write down a correct number.");
                    break;
            }
        }
    }
}
