package gr.aueb.cf.ch3;

import java.util.Scanner;

/*
 * Turn lights on, if it is raining
 * AND car is running (>100) OR is dark
 */
public class LightsOn {

    public static void main(String[] args) {
        final int MAX_CAR_SPEED = 100;
        Scanner in = new Scanner(System.in);
        boolean isDark = false;
        boolean isCarRunning = false;
        boolean  areLightsOn = false;
        boolean isRaining = false;
        int carSpeed;

        System.out.println("please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("please insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("please insert car speed");
        carSpeed = in.nextInt();

        isRaining = carSpeed > MAX_CAR_SPEED;

        areLightsOn = isRaining && (isDark || isCarRunning);

        System.out.println("Tuth lights on: " +areLightsOn);
    }
}
