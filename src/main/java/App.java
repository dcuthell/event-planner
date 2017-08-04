import models.EventPlanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        EventPlanner eventPlanner = new EventPlanner();

        System.out.println("Welcome to the Event Planner!");

        boolean programRunning = true;

        while(programRunning){
            Integer userInput;
            System.out.println("Please Select from the Following Menu Items:\n1  -  Create a New Event\n0  -  Exit");
            try{
                userInput = Integer.parseInt(bufferedReader.readLine());
                if(userInput.equals(1)){
                    Integer numberOfGuests = 0;
                    Integer mealType = 0;
                    Integer beverageType = 0;
                    Integer entertainmentType = 0;
                    Integer discountType = 0;
                    System.out.println("Create a New Custom Event");
                    while(numberOfGuests.equals(0)){
                        System.out.println("How many people do you expect to attend this event?");
                        numberOfGuests = Integer.parseInt(bufferedReader.readLine());
                    }
                    while(mealType.equals(0)){
                        System.out.println("What type of meal service would you like?\n1  -  Light Snacks\n2  -  Hearty Snacks\n3  -  Simple Lunch\n4  -  Fancy Lunch\n5  -  Simple Dinner\n6  -  Fancy Dinner");
                        mealType = Integer.parseInt(bufferedReader.readLine());
                    }
                    while(beverageType.equals(0)){
                        System.out.println("What type of beverage service would you like?\n1  -  Non-Alcoholic Beverages Only\n2  -  Cheap Beer and Well Drinks\n3  -  Craft Brews and Top-Shelf Booze");
                        beverageType = Integer.parseInt(bufferedReader.readLine());
                    }
                    while(entertainmentType.equals(0)){
                        System.out.println("What type of entertainment would you like?\n1  -  Clown with Balloons\n2  -  Stand-up Comedian\n3  -  DJ with Laser Light Show\n4  -  Interpretive Dance Troupe\n5  -  Grateful Dead Cover Band\n6  -  Black-Tie Jazz Band");
                        entertainmentType = Integer.parseInt(bufferedReader.readLine());
                    }
                    while(discountType.equals(0)){
                        System.out.println("Please Enter a Discount Code, or Enter 1 to Continue");
                        discountType = Integer.parseInt(bufferedReader.readLine());
                    }
                    eventPlanner.addEvent(numberOfGuests, mealType, beverageType, entertainmentType, discountType);
                    System.out.println("Event Added!");


                }else if(userInput.equals(0)){
                    System.out.println("Goodbye!");
                    programRunning = false;
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
