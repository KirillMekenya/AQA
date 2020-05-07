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
        product.installFirstPart(firstStep.buildProductPart(firstPartName));
        product.installSecondPart(secondStep.buildProductPart(secondPartName));
        product.installThirdPart(thirdStep.buildProductPart(thirdPartName));
        System.out.println("The laptop has been assembled");
        this.product=product;
        return this.product;
    }
}
