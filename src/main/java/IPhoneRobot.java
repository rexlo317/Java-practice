public class IPhoneRobot{
    private String name;
    private Mobile mobile;
    public IPhoneRobot(String name, Mobile mobile){
        this.name = name;
        if (mobile.getClass().getName() != "IPhone")
            System.out.println("Construction failed, Robot cannot use Iphone");
        this.mobile = mobile;
    }
    public void robotMakeACall(String message){
        this.mobile.makeACall("I am Robot" + message);
    }

    public Mobile getMobile() {
        return mobile;
    }

    public String getName() {
        return name;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }
}
