package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 * class: software design
 * student Id: 991636966
 * date 2022-02-22
 * 
 * @author Anthony Coelho
 */
public class TestUserprofile {
    public static void main(String[] args){
        UserProfile test = new UserProfile(userID, genre);
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = in.nextLine();
        System.out.println(genre);
        System.out.print("From the list above which movie genre is your faviorate: ");
        String genres = in.nextLine();
        System.out.println("Your UserProfile has now been created.\nWELCOME "+name+"!");
    }
}
    

