package cityBike;

import java.util.*;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        //BIKE OBJECT
        bike bk1 = new bike("Rented", "BLUE");
        bike bk2 = new bike("NOT Rented", "GREEN");
        bike bk3 = new bike("In Service", "PINK");
        bike bk4 = new bike("Discarded", "RED");
        bike bk5 = new bike("Discarded", "WHITE");
        bike bk6 = new bike("NOT Rented", "GREY");
        bike bk7 = new bike("Rented", "ORANGE");
        bike bk8 = new bike("Rented", "BLACK");


        System.out.print("bike id:" + bk1.getBikeID() + " >>> " + "Color:" + " " + bk1.getColor() + "\t ||");
        System.out.print("bike id:" + bk2.getBikeID() + " >>> " + "Color:" + " " + bk2.getColor() + "\t ||");
        System.out.print("bike id:" + bk3.getBikeID() + " >>> " + "Color:" + " " + bk3.getColor() + "\t ||");
        System.out.print("bike id:" + bk4.getBikeID() + " >>> " + "Color:" + " " + bk4.getColor() + "\t ||");
        System.out.print("bike id:" + bk5.getBikeID() + " >>> " + "Color:" + " " + bk5.getColor() + "\t ||");
        System.out.print("bike id:" + bk6.getBikeID() + " >>> " + "Color:" + " " + bk6.getColor() + "\t ||");
        System.out.print("bike id:" + bk7.getBikeID() + " >>> " + "Color:" + " " + bk7.getColor() + "\t || ");
        System.out.println("bike id:" + bk8.getBikeID() + " >>> " + "Color:" + " " + bk8.getColor() + "\t");

        //HASHMAP
        HashMap<Integer, String> bkmap = new HashMap<>();
        System.out.print("BIKE ID AND STATE:" + "\t");
        bkmap.put(bk1.getBikeID(), bk1.getState());
        bkmap.put(bk2.getBikeID(), bk2.getState());
        bkmap.put(bk3.getBikeID(), bk3.getState());
        bkmap.put(bk4.getBikeID(), bk4.getState());
        bkmap.put(bk5.getBikeID(), bk5.getState());
        bkmap.put(bk6.getBikeID(), bk6.getState());
        bkmap.put(bk7.getBikeID(), bk7.getState());
        bkmap.put(bk8.getBikeID(), bk8.getState());


        //STATION
        Station st1 = new Station("EVERY");
        Station st2 = new Station("WHERE");
        Station st3 = new Station("LOCATION");

        HashMap<Integer, String> stmap = new HashMap<>();
        System.out.print("STATION ID AND LOCATION:" + "\t");
        stmap.put(st1.getStatID(), st1.getLocation());
        stmap.put(st2.getStatID(), st2.getLocation());
        stmap.put(st3.getStatID(), st3.getLocation());
        System.out.println(stmap);

        //USER
        user U1=new user(1,"John","Dosomething",bk1.getBikeID());
        user U2=new user(2,"George","Doessomething",bk7.getBikeID());
        user U3=new user(3,"Max","Hadtodo",bk8.getBikeID());
        System.out.println(U1+"\n"+U2+"\n"+U3);
    }
}

