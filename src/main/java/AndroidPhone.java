public class AndroidPhone extends Mobile{
    public AndroidPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void makeACall(String message) {
        if (message.length() <= 80)
            super.makeACall("<Android>" + message);
        else
            System.out.println("<Android> Message cannot be sent");
    }

    @Override
    public void getMobileInfo() {
        super.getMobileInfo();
    }
}
