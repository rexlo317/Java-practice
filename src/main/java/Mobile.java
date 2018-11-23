public class Mobile {
    private String name;
    private String color;
    private String brand;
    public Mobile (String name, String color, String brand){
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void makeACall(String message){
        System.out.println("Message : " + message );
    }

    public void getMobileInfo(){
        System.out.println("name: " + this.name + ", color: " + this.color + ", brand: " + this.brand);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
