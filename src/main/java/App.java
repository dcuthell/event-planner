import models.Event;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Event newEvent = new Event();
        System.out.println(newEvent.getPartySizeMultiplier(1));
    }
}
