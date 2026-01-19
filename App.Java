import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna auton merkki: ");
        String brand = scanner.nextLine();

        System.out.print("Anna auton malli: ");
        String model = scanner.nextLine();

        
        Car car = new Car();
        car.setBrand(brand);
        car.setModel(model);

        boolean running = true;

        while (running) {
            
            System.out.println("1) Näytä auton tila");
            System.out.println("2) Muokkaa auton merkkiä ja mallia");
            System.out.println("3) Kiihdytä autoa");
            System.out.println("4) Hidasta autoa");
            System.out.println("0) Lopeta ohjelma");

            
            String choiceLine = scanner.nextLine();
            int choice;

            try {
                choice = Integer.parseInt(choiceLine);
            } catch (NumberFormatException e) {
                System.out.println("Syöte oli väärä");
                continue;
            }

            switch (choice) {
                case 1:
                    car.status();
                    break;

                case 2:
                    System.out.print("Anna uusi auton merkki: ");
                    String newBrand = scanner.nextLine();
                    System.out.print("Anna uusi auton malli: ");
                    String newModel = scanner.nextLine();
                    car.setBrand(newBrand);
                    car.setModel(newModel);
                    break;

                case 3:
                    System.out.print("Kuinka monta km/h haluat kiihdyttää? ");
                    String accLine = scanner.nextLine();
                    try {
                        int amount = Integer.parseInt(accLine);
                        if (amount < 0) {
                            System.out.println("Nopeuden täytyy olla positiivinen luku.");
                        } else {
                            car.accelerate(amount);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Syöte oli väärä");
                    }
                    break;

                case 4:
                    System.out.print("Kuinka monta km/h haluat hidastaa? ");
                    String decLine = scanner.nextLine();
                    try {
                        int amount = Integer.parseInt(decLine);
                        if (amount < 0) {
                            System.out.println("Nopeuden täytyy olla positiivinen luku.");
                        } else {
                            car.decelerate(amount);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Syöte oli väärä");
                    }
                    break;

                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    running = false;
                    break;

                default:
                    System.out.println("Syöte oli väärä");
                    break;
            }
        }

        scanner.close();
    }
}
