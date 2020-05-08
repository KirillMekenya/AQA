public class Product implements IProduct {

    private String productName;
    private ProductPart firstPart;
    private ProductPart secondPart;
    private ProductPart thirdPart;

    public String getProductName() {
        return productName;
    }

    public Product (String name)
    {
        this.productName=name;
    }
    @Override
    public void installFirstPart(ProductPart productPart) {
        this.firstPart = productPart;
        System.out.println("The product part " + productPart.getName() + " has been installed");
    }

    @Override
    public void installSecondPart(ProductPart productPart) {
        this.secondPart = productPart;
        System.out.println("The product part " + productPart.getName() + " has been installed");
    }

    @Override
    public void installThirdPart(ProductPart productPart) {
        this.thirdPart = productPart;
        System.out.println("The product part " + productPart.getName() + " has been installed");
    }

    public ProductPart getFirstPart() {
        return firstPart;
    }

    public ProductPart getSecondPart() {
        return secondPart;
    }

    public ProductPart getThirdPart() {
        return thirdPart;
    }
}
