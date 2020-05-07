public class LineStep implements ILineStep {

    @Override
    public ProductPart buildProductPart(String name) {
        System.out.println("The product part " + name + " has been built");
        return new ProductPart(name);
    }

}
