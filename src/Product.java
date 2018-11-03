public class Product
{
    private Long id;
    private String productName;
    private float price;
    private float weight;
    private String color;
    private Long productCount;

    public Product(Long id, String productName, float price, float weight, String color, Long productCount)
    {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.productCount = productCount;
    }

    public Long getId()
    {
        return id;
    }

    public String getProductName()
    {
        return productName;
    }

    public double getPrice()
    {
        return price;
    }

    public double getWeight()
    {
        return weight;
    }

    public String getColor()
    {
        return color;
    }

    public Long getProductCount()
    {
        return productCount;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    public void setProductCount(Long productCount)
    {
        this.productCount = productCount;
    }


}
