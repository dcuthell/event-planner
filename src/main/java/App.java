import models.EventPlanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        EventPlanner eventPlanner = new EventPlanner();

        System.out.println("Welcome to the Event Planner!");

        boolean programRunning = true;

        while(programRunning){
            Integer userInput;
            System.out.println("Please Select from the Following Menu Items:\n1  -  Create a New Event\n2  -  Create Random Event\n3  -  Create a Prebuilt Event\n0  -  Exit");
            try{
                userInput = Integer.parseInt(bufferedReader.readLine());
                if(userInput.equals(1)){
                    Integer numberOfGuests = 0;
                    Integer mealType = 0;
                    Integer beverageType = 0;
                    Integer entertainmentType = 0;
                    Integer discountType = 0;
                    System.out.println("Create a New Custom Event");
                    while(numberOfGuests <= 0){
                        System.out.println("How many people do you expect to attend this event?");
                        numberOfGuests = Integer.parseInt(bufferedReader.readLine());
                    }
                    while(mealType < 1 || 6 < mealType){
                        System.out.println("What type of meal service would you like?");
                        System.out.println(eventPlanner.listMeals());
                        mealType = Integer.parseInt(bufferedReader.readLine());
                    }
                    while(beverageType < 1 || 3 < beverageType){
                        System.out.println("What type of beverage service would you like?");
                        System.out.println(eventPlanner.listBeverages());
                        beverageType = Integer.parseInt(bufferedReader.readLine());
                    }
                    while(entertainmentType < 1 || 6 < entertainmentType){
                        System.out.println("What type of entertainment would you like?");
                        System.out.println(eventPlanner.listEntertainment());
                        entertainmentType = Integer.parseInt(bufferedReader.readLine());
                    }
                    while(discountType < 1 || 6 < discountType){
                        if((mealType + beverageType + entertainmentType) > 12){
                            System.out.println("This party looks like a blast! Enjoy 20% off!");
                            discountType = 5;
                        }else if((mealType + beverageType + entertainmentType) > 10){
                            System.out.println("Your party is looking great, we're taking off 10%!");
                            discountType = 3;
                        }else{
                            discountType = 1;
                        }
                        System.out.println("Please Enter a Discount Code, or hit Enter to Continue");
                        String input = bufferedReader.readLine();
                        if(input.equals("HEYBUDLETSPARTY")){
                            discountType = 6;
                            System.out.println("Woo buddy, 25% off! You ready to give'r?");
                        }
                        if(input.equals("EPICODUS")){
                            if(discountType < 4){
                                discountType = 4;
                            }
                            System.out.println("Coders need to party too! 15% off!");
                        }
                    }
                    System.out.println(eventPlanner.addEvent(numberOfGuests, mealType, beverageType, entertainmentType, discountType));
                    System.out.println("Event Added!");
                }else if(userInput.equals(2)){
                    System.out.println("Create a New Random Event");
                    Random myRandomGenerator = new Random();
                    Integer numberOfGuests = 0;
                    Integer mealType = 1 + myRandomGenerator.nextInt(6);
                    Integer beverageType = 1 + myRandomGenerator.nextInt(3);
                    Integer entertainmentType = 1 + myRandomGenerator.nextInt(6);
                    Integer discountType = 0;
                    while(numberOfGuests <= 0){
                        System.out.println("How many people do you expect to attend this event?");
                        numberOfGuests = Integer.parseInt(bufferedReader.readLine());
                    }
                    while(discountType < 1 || 6 < discountType){
                        if((mealType + beverageType + entertainmentType) > 12){
                            System.out.println("This party looks like a blast! Enjoy 20% off!");
                            discountType = 5;
                        }else if((mealType + beverageType + entertainmentType) > 10){
                            System.out.println("Your party is looking great, we're taking off 10%!");
                            discountType = 3;
                        }else{
                            discountType = 1;
                        }
                        System.out.println("Please Enter a Discount Code, or hit Enter to Continue");
                        String input = bufferedReader.readLine();
                        if(input.equals("HEYBUDLETSPARTY")){
                            discountType = 6;
                            System.out.println("Woo buddy, 25% off! You ready to give'r?");
                        }
                        if(input.equals("EPICODUS")){
                            if(discountType < 2){
                                discountType = 2;
                            }
                            System.out.println("Coders need to party too! 5% off!");
                        }
                    }
                    System.out.println(eventPlanner.addEvent(numberOfGuests, mealType, beverageType, entertainmentType, discountType));
                    System.out.println("Random Event Added!");
                }else if(userInput.equals(3)){
                    System.out.println("Create a New Prebuilt Event");
                    Integer eventType = 0;
                    while(eventType <= 0){
                        System.out.println("Please select from the following events:\n1  -  Wedding\n2   -  Birthday Party\n3  -  Reunion");
                        eventType = Integer.parseInt(bufferedReader.readLine());
                    }
                    if(eventType.equals(1)){
                        System.out.println("Enjoy your wedding with a 20% discount!");
                        System.out.println(eventPlanner.addEvent(75, 6, 3, 6, 5));
                    }
                    if(eventType.equals(2)){
                        System.out.println("Celebrate your Birthday with a 15% discount!");
                        System.out.println(eventPlanner.addEvent(15, 1, 2, 1, 4));
                    }
                    if(eventType.equals(3)){
                        System.out.println("Have a rocking reunion with 10% off!");
                        System.out.println(eventPlanner.addEvent(100, 5, 2, 5, 3));
                    }
                }else if(userInput.equals(0)){
                    System.out.println("Goodbye!");
                    programRunning = false;
                }else{
                    System.out.println("Invalid User Input");
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
