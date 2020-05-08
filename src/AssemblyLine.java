public class AssemblyLine implements IAssemblyLine {

    private Product product;
    private LineStep firstStep;
    private LineStep secondStep;
    private LineStep thirdStep;

    public AssemblyLine(LineStep firstStep, LineStep secondStep, LineStep thirdStep) {
        this.firstStep = firstStep;
        this.secondStep = secondStep;
        this.thirdStep = thirdStep;
    }

    @Override
    public Product assembleProduct(Product product, String firstPartName, String secondPartName, String thirdPartName) {
        this.product=product;
        this.product.installFirstPart(firstStep.buildProductPart(firstPartName));
        this.product.installSecondPart(secondStep.buildProductPart(secondPartName));
        this.product.installThirdPart(thirdStep.buildProductPart(thirdPartName));
        System.out.println("The "+product.getProductName()+" has been assembled");
        return this.product;
    }
}
