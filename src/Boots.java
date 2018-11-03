public class Boots extends Product
{
    private String size;
    private boolean isNaturalSkin;

    public Boots(Long id, String productName, float price, float weight, String color, Long productCount, String size, boolean isNaturalSkin)
    {
        super(id, productName, price, weight, color,productCount);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    public String getSize()
    {
        return size;
    }

    public boolean getIsNaturalSkin() {
        return isNaturalSkin;
    }

}
