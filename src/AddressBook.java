import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public static void main(String[] args){
        System.out.println("Address Book");
    }
    public AddressBook() {
        buddies = new ArrayList<>();
    }


    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy);
        }
    }


    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }
}
