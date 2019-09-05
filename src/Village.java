import java.util.Scanner;

public class Village {
    public static void main(String [] args){
        String mall;
        String iceCreamShop;
        String mansion;
        String mill;
        String school;
        String foodcourt;
        String bathroom;
        String bstall;
        String bstand;
        String scry;
        String scrawl;

        String movies;
        String fcexit;
        String fcbath;
        String fcphone;
        String fchall;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Do you want to go to the (JavaTowne Mall), (Ice Cream Shop), (18th Century Mansion), (Saw Mill), or (Elementary School)? ");
        mall = keyboard.nextLine();
        iceCreamShop = keyboard.nextLine();
        mansion = keyboard.nextLine();
        mill = keyboard.nextLine();
        school = keyboard.nextLine();

        if (mall.equals("JavaTowne Mall")) {
            System.out.println("Quick you have to choose between running to the food court to your (left) or the movie theater to your (right).");
            foodcourt = keyboard.nextLine();
            movies = keyboard.nextLine();
        }
               if (fcexit.equals("left")){
            System.out.println("Now you are in the food court. Do you head for the back door (exit) or the (bathroom)?");
            fcexit = keyboard.nextLine();
            fcbath = keyboard.nextLine();

        }
               else if (fcbath.equals("bathroom")){
            System.out.println("Your best choice in the women's bathroom is to find a (stall) or (stand) in place. What do you choose?");
            bstall = keyboard.nextLine();
            bstand = keyboard.nextLine();

        }
               else if (bstand.equals("stand")){
            System.out.println("Now is your chance (cry) out for help from a random stranger or (crawl) between stalls to confuse them to try escape?");
            scry = keyboard.nextLine();
            scrawl = keyboard.nextLine();

        }
               else (scry.equals("cry"){
            System.out.println("You made the right choice. Big Jim answered your call. He regularly ");

        }
               else scrawl{
            System.out.println("You skinned your knee on a crack in the floor. The creatures almost got you but Big Jim heard and rescues you. You are not recovering in the hospital.");
        }
               if fcexit{
            System.out.println("You made it to the food court back door exit, do you run through the corridor or phone for help?");
            fcphone = keyboard.nextLine();
            fchall = keyboard.nextLine();

        }
               if fcphone{
            System.out.println("Your phone is in a dead zone but 911 somehow works. You are rescued!");
        }
               else if fchall{
            System.out.println("You run feverishly down the hall and barely make it out before the creature comes for you. Hurray you are saved!");
        }


    }
}
