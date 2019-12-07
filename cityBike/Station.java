package cityBike;

import java.util.ArrayList;

public class Station{


    public static int ct=0;
    int id;
    private int statID;
    private String location;
    private int  bikes;

    public Station(String location) {
        ct=ct+1;
        id=ct;
        this.statID = statID;
        this.location = location;
        this.bikes = bikes;
    }

    public int getStatID() {
        return id;
    }

    public void setStatID(int statID) {
        this.statID = statID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public int getBikes()
    {
        return getBikes();
    }

    public void setBikes(int  bikes) {
        this.bikes = bikes;
    }
}

