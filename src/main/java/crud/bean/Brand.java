package crud.bean;

public class Brand {
    private Integer brandId;

    private String brandName;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public Brand(Integer brandId, String brandName) {
        this.brandId = brandId;
        this.brandName = brandName;
    }

    public Brand() {
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}