public class InputComputation {
    private static InputComputation instance = new InputComputation();
    public static InputComputation getInstance() {
        return instance;
    }

    double[] inputArray = new double[Constants.nodesInLayer.INPUT.nodes];

    public void numericizeInputs(){
        for (int i = 0; i < Constants.nodesInLayer.INPUT.nodes; i++) {
            if(inputArray[i] < 14){
                inputArray[i] = (.05*inputArray[i]);
            } else {
                inputArray[i] = 1;
            }
        }
    }

}
