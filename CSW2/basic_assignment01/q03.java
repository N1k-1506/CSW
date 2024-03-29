package basic_assignment01;

class MobileApp {
    private String simProvider;
    // Setter method
    public void setSimProvider(String simProvider) {
        this.simProvider = simProvider;
    }
    // Getter method
    public String getSimProvider() {
        return simProvider;
    }
    // Method to display SIM provider
    public void displaySimProvider() {
        System.out.println("SIM Provider: " + simProvider);
    }
}
public class q03{
    public static void main(String[] args) {
        // Create a MobileApp object
        MobileApp mobileApp = new MobileApp();
        mobileApp.setSimProvider("AT&T");
        // Display SIM provider
        mobileApp.displaySimProvider();
        // Change SIM provider and display again
        mobileApp.setSimProvider("Verizon");
        mobileApp.displaySimProvider();
    }
}

