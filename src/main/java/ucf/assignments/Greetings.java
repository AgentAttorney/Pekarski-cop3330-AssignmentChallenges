package ucf.assignments;

import java.util.Random;

public class Greetings {
    public static String greet(String name) {
        Random rand = new Random();
        int upperbound = 4;
        int int_random = rand.nextInt(upperbound);

        String lc_name = name.toLowerCase();
        if(lc_name.isEmpty()){
            return lc_name;
        }
        else if(lc_name.contains("hollander")){
            return "Round my grade professor :)";
        }
        else if(lc_name.contains("mik")){
            return "you're a fucking weeb";
        }
        else if(int_random == 0){
            lc_name = "dad";
            return "Dad? Is it you? Did you come back " + lc_name;
        }
        else if(int_random == 1){
            return "HOW DID YOU GET IN THE STASH, " + name + "?!";
        }
        else if(int_random == 2){
            return name + ", I hope you'll check out my Youtube channel at https://www.youtube.com/watch?v=dQw4w9WgXcQ";
        }
        else{
            return "Hello, " + name + " it's nice to meet you";
        }

    }
}
