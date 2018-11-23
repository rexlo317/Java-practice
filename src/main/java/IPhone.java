public class IPhone extends Mobile {
    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void makeACall(String message) {
        if (message.length() <= 80)
            super.makeACall("<iPhone>" + message);
        else
            System.out.println("<iPhone> Message cannot be sent");
    }

    @Override
    public void getMobileInfo() {
        super.getMobileInfo();
    }
}
