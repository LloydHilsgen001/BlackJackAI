

public class network {
    private Constants constants = Constants.getInstance();
    private InputComputation input = InputComputation.getInstance();

    private static network instance = new network();
    public static network getInstance() {
        return instance;
    }

    public void createNetwork() {
        input.numericizeInputs();

    }
}
