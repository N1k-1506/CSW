package basic_assignment01.q04;
class MobileApp {
    private String simProvider;
    public MobileApp(String simProvider) {
        this.simProvider = simProvider;
    }
    // Method to display SIM provider
    public void displaySimProvider() {
        System.out.println("SIM Provider: " + simProvider);
    }
}
public class Mobile{
    public static void main(String[] args) {
        // Create a MobileApp object
        MobileApp mobileApp = new MobileApp("Verizon");
        // Display SIM provider
        mobileApp.displaySimProvider();
    }
}