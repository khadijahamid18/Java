public class task4 {
    public static void main(String[] args) {
        // Total number of surveyed customers
        int totalCustomers = 12467;

        // Percentage of customers who purchase one or more energy drinks per week
        double percentEnergyDrinkConsumers = 0.14;

        // Percentage of energy drink consumers who prefer citrus flavor
        double percentCitrusDrinkConsumers = 0.64;

        // Calculating the approximate number of customers who purchase energy drinks
        // per week
        int energyDrinkConsumers = (int) (totalCustomers * percentEnergyDrinkConsumers);

        // Calculating the approximate number of customers who prefer citrus flavored
        // energy drinks
        int citrusDrinkConsumers = (int) (energyDrinkConsumers * percentCitrusDrinkConsumers);

        // Displaying the results
        System.out.println(
                "Approximate number of customers who purchase energy drinks per week: " + energyDrinkConsumers);
        System.out.println(
                "Approximate number of customers who prefer citrus flavored energy drinks: " + citrusDrinkConsumers);
    }
}
