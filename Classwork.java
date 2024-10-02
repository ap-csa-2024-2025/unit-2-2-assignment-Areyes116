public class Classwork
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for item type, number of items, and weight
        System.out.println("What type of item are you buying?");
        String itemType = scanner.nextLine();

        System.out.println("How many are you buying?");
        int quantity = scanner.nextInt();

        System.out.println("How much does each one weigh?");
        double weight = scanner.nextDouble();

        // Calculate the total weight
        double totalWeight = quantity * weight;

        // Output the result in a sentence
        System.out.println(quantity + " " + itemType + " at " + weight + " pounds each will weigh " + totalWeight + " pounds total.");
    }

    public static void main(String[] args)
    {
        // Output the quote including quotation marks
        System.out.println("\"That brain of mine is something more than merely mortal; as time will show.\"\nAda Lovelace\nThe first computer programmer");
    }
    
    public static void main(String[] args)
    {
        // Output the quote including quotation marks
        System.out.println("\"That brain of mine is something more than merely mortal; as time will show.\"\nAda Lovelace\nThe first computer programmer");
    }

    public static void main(String[] args)
    {
        // Output the rabbit ASCII art
        System.out.println("(\\(\\");
        System.out.println("( - -)");
        System.out.println("((') (')");
    }
}