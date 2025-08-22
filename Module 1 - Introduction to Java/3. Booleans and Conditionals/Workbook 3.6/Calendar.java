public class Calendar {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        String day = "Friday"; //Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");


        System.out.println("Hmm, let me check my calendar.");
        
        switch (day) {
            case "Monday": System.out.println("Sorry, I have to stay at work late.");
            case "Tuesday": System.out.println("It looks like I have meetings all day.");
            case "Wednesday": System.out.println("I have a dentist appointment. Some other time!");
            case "Thursday": System.out.println("Sorry, thursday is date night!");
            case "Friday": System.out.println("I'm free!!");
            case "Saturday": System.out.println("I'm free!!");
            case "Sunday": System.out.println("I'm free!!");
            default : System.out.println("That's not a day");
        }  
        

    }
}
