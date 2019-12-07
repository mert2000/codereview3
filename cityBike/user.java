package cityBike;

public class user {
    private int userID;
    private String name;
    private String surname;
    private int currentlyrent;

    public user(int userID, String name, String surname, int currentlyrent) {
        this.userID = userID;
        this.name = name;
        this.surname = surname;
        this.currentlyrent = currentlyrent;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCurrentlyrent() {
        return currentlyrent;
    }

    public void setCurrentlyrent(int currentlyrent) {
        this.currentlyrent = currentlyrent;
    }

    @Override
    public String toString() {
        return "USER ID:"+" "+getUserID()+" "+"NAME:"+" "+getName()+" "+"SURNAME:"+" "+getSurname()+" "+"BIKE ID:"+" "+getCurrentlyrent();
    }
}

