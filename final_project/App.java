
import java.util.Scanner;

public class App {

    private static Composite globalRoot = null;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Organization management system");
            System.out.println("------------------------------");
            System.out.println("");
            System.out.println("1. Create and print hard coded organization");
            System.out.println("2. Print organization, add person to it and finally print it");
            System.out.println("3. Print organization, remove person from it and finally print it");
            System.out.println("Q. Quit the application");
            System.out.println("");
            System.out.print("Your choice: ");
            String choice = scanner.nextLine();

            switch (choice.toLowerCase()) {
                case "1":
                    createAndPrintOrg();
                    break;
                case "2":
                    printOrgAndAddPerson();
                    break;
                case "3":
                    printOrgAndRemovePerson();
                    break;
                case "q":
                    scanner.close();
                    return;
                default:
                    System.out.println("ERROR: Invalid input. Please enter 1, 2, 3, q or Q.");
                    break;
            }
        }
    }

    public static void createAndPrintOrg() {
        globalRoot = new Composite("Top management", "Scrooge McDuck");

        Composite marketing = new Composite("Marketing", "Donald Duck");
        Composite softwareDev = new Composite("Software Development", "Daisy Duck");
        Composite customerSupport = new Composite("Customer Support", "Gladstone Gander");

        globalRoot.add(new Leaf("Grandma Duck (secretary)"));
        globalRoot.add(marketing);
        globalRoot.add(softwareDev);
        globalRoot.add(customerSupport);

        marketing.add(new Leaf("Gus Goose"));
        softwareDev.add(new Leaf("Huey Duck"));
        softwareDev.add(new Leaf("Dewey Duck"));
        softwareDev.add(new Leaf("Louie Duck"));
        customerSupport.add(new Leaf("Gyro Gearloose"));
        customerSupport.add(new Leaf("Magica De Spell"));
        customerSupport.add(new Leaf("Launchpad McQuack"));

        globalRoot.print(0);
        System.out.println("");
    }

    public static void printOrgAndAddPerson() {
        if (globalRoot == null) {
            System.out.println("\nERROR: Organization is not created yet. Create it first in step 1.");
            return;
        }

        globalRoot.print(0);
        System.out.println("");

        System.out.print("Give unit name: ");
        String unitName = scanner.nextLine();
        System.out.print("Give person name: ");
        String personName = scanner.nextLine();
        System.out.println("");

        if (!personName.matches("^[A-Z][a-z]+ [A-Z][a-z]+$")) {
            System.out.println("ERROR: Invalid name. Please enter a valid name like John Smith.");
            System.out.println("");
            return;
        }

        Composite group = findGroupByName(globalRoot, unitName);
        if (group != null) {
            group.add(new Leaf(personName));
            globalRoot.print(0);
            System.out.println("");
        } else {
            System.out.println("ERROR: Organization not found. Give it again.");
            System.out.println("");
        }
    }

    public static void printOrgAndRemovePerson() {
        if (globalRoot == null) {
            System.out.println("\nERROR: Organization is not created yet. Create it first in step 1.\n");
            return;
        }
        globalRoot.print(0);
        System.out.println("");

        System.out.print("Give person name: ");
        String personName = scanner.nextLine();

        if (!personName.matches("^[A-Z][a-z]+ [A-Z][a-z]+$")) {
            System.out.println("\nERROR: Invalid name. Please enter a valid name like John Smith.");
            System.out.println("");
            return;
        }

        if (removePersonByName(globalRoot, personName)) {
            globalRoot.print(0);
            System.out.println("");

        } else {
            System.out.println("\nERROR: Person not found. Give it again.");
            System.out.println("");
        }
    }

    public static Composite findGroupByName(Composite composite, String name) {
        if (composite.getGroupName().equals(name)) {
            return composite;
        }

        for (Component child : composite.getChildren()) {
            if (child instanceof Composite) {
                Composite found = findGroupByName((Composite) child, name);
                if (found != null) {
                    return found;
                }
            }
        }
        return null;
    }

    private static boolean removePersonByName(Component component, String name) {
        if (!(component instanceof Composite)) {
            return false;
        }

        Composite composite = (Composite) component;

        // Use iterator to safely remove while iterating
        for (int i = 0; i < composite.getChildren().size(); i++) {
            Component child = composite.getChildren().get(i);

            // Only remove workers (Leaf nodes), not bosses
            if (child instanceof Leaf && ((Leaf) child).getName().equalsIgnoreCase(name)) {
                composite.remove(child);
                return true;
            } else if (child instanceof Composite) {
                // Check if worker is in a sub-department
                if (removePersonByName(child, name)) {
                    return true;
                }
            }
        }

        return false;
    }
}
