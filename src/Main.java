public class Main {

    public static void main(String[] args) {

        AssemblyLine assemblyLine = new AssemblyLine(new LineStep(), new LineStep(), new LineStep());
        assemblyLine.assembleProduct(new Product("laptop"), "corpus", "motherboard", "monitor");

    }
}
