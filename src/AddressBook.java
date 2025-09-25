import java.util.ArrayList;

//comment added from GitHUb

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        //added a comment just to make a commit
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
