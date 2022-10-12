public class Medicine {
	
    private String  name;
    private String date;
    private int  id;
    private double price;
    private int stockCount;
    private String category;

    public Medicine(int id,String  name,String category,String date, int stockCount,double price) {
        this.date = date;
        this.category = category;
        this.name=name;
        this.id =id;
        this.stockCount=stockCount;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
