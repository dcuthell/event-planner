import models.EventPlanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        EventPlanner newEventPlanner = new EventPlanner();

        System.out.println("Welcome to the Event Planner!");

        boolean programRunning = true;

        while(programRunning){
            Integer userInput;
            System.out.println("Please Select from the Following Menu Items:\n1  -  Create a New Event\n0  -  Exit");
            try{
                userInput = Integer.parseInt(bufferedReader.readLine());
                if(userInput.equals(1)){
                    System.out.println("Create a New Event");
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
