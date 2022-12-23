package testservletjsp;

public class ModelServletJSP {
//        name quantity image status des dateadd

    private int id;
    private String name;
    private int quantity;
    private String image;
    private int status;
    private String des;
    private String dateadd;

    public ModelServletJSP() {
    }

    public ModelServletJSP(int id, String name, int quantity, String image, int status, String des, String dateadd) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.image = image;
        this.status = status;
        this.des = des;
        this.dateadd = dateadd;
    }

    public ModelServletJSP(String name, int quantity, String image, int status, String des, String dateadd) {
        this.name = name;
        this.quantity = quantity;
        this.image = image;
        this.status = status;
        this.des = des;
        this.dateadd = dateadd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getDateadd() {
        return dateadd;
    }

    public void setDateadd(String dateadd) {
        this.dateadd = dateadd;
    }

    @Override
    public String toString() {
        return "ModelServletJSP{" + "id=" + id + ", name=" + name + ", quantity=" + quantity + ", image=" + image + ", status=" + status + ", des=" + des + ", dateadd=" + dateadd + '}';
    }

}
