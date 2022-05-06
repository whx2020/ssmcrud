package crud.bean;

public class Product {
    private Integer productId;

    private String productName;

    private Integer productBrand;

    private Double productPrice;

    private String productImg;

    private String productDesc;

    private Brand brand;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Product() {
    }

    public Product(Integer productId, String productName, Integer productBrand, Double productPrice, String productImg, String productDesc) {
        this.productId = productId;
        this.productName = productName;
        this.productBrand = productBrand;
        this.productPrice = productPrice;
        this.productImg = productImg;
        this.productDesc = productDesc;
    }

    public Integer getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(Integer productBrand) {
        this.productBrand = productBrand;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg == null ? null : productImg.trim();
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc == null ? null : productDesc.trim();
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productBrand=" + productBrand +
                ", productPrice=" + productPrice +
                ", productImg='" + productImg + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", brand=" + brand +
                '}';
    }
}