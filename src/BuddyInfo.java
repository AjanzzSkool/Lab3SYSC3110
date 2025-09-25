public class BuddyInfo {


    private String name;


    private String address;

    private int phoneNumber;

    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        name = "Ajan";
        address = "Carleton University";
        phoneNumber = 2100;
    }

    public String getAddress() {
        return address;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        BuddyInfo buddyHolmer = new BuddyInfo("Holmer", "Simpson", 3200);
        System.out.println("Hello " + buddyHolmer.getName());
    }
}
