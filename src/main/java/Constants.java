public class Constants {
    private static Constants instance = new Constants();
    public static Constants getInstance() {
        return instance;
    }

    public int numberOfLayers = 4;

    public enum nodesInLayer{
        INPUT(100),
        SECOND(10),
        THIRD(10),
        OUTPUT(1);

        public int nodes;

        nodesInLayer(int nodes){
            this.nodes = nodes;
        }
    }
}
