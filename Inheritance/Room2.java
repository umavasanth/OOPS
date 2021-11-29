package Inheritance;

import Inheritance.Home;

public class Room2 extends Home {

    @Override
    public void nooflights() {
       nooflights=3;
        System.out.println("Number of lights in Room 2: "+nooflights);
    }
}
