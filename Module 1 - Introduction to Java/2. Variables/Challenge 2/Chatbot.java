import java.util.Scanner; //import Scanner

public class Chatbot {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions. 

        
        Scanner scan = new Scanner(System.in);//set up scanner. 

        System.out.println("Hello. What is your name?");
        String userName = scan.nextLine(); //Pick up user's name and store it. 

                           
        //add new a line before asking next question. 
        System.out.println("\nHi "+userName+"! I'm Javabot. Where are you from?");
        String userHome = scan.nextLine(); //Pick up user's home and store it. 
                        

        //add new a line before asking next question.
        System.out.println("I hear it's beautiful at "+userHome+"! I'm from a place called Oracle");
        System.out.println("How old are you?");
        int userAge = scan.nextInt(); //Pick up age and store it.


        //add new a line before asking next question.
        System.out.println("So you're "+userAge+", cool! I'm 400 years old.");
        System.out.println("This means I'm "+400 / userAge +" times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        //Pick up language and store it. 
        scan.nextLine();
        String favouriteLanguage = scan.nextLine();

        //add new a line here.
        System.out.println( favouriteLanguage + ", that's great! Nice chatting with you "+ userName +". I have to log off now. See ya!");
        
        //close scanner. 

        
    }
}
