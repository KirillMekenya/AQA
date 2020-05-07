public interface IAssemblyLine {
    IProduct assembleProduct(Product product, String firstPartName, String secondPartName, String thirdPartName);
}
