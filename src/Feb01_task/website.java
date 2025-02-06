package Feb01_task;

import java.util.Scanner;

public class website {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter website");
        String website = sc.nextLine();

        if(website.contains(".com")){
            System.out.println("The website type is: Commercial website");
        } else if (website.contains(".org")) {
            System.out.println("The website type is: Non-profit organization");
        } else if (website.contains(".edu")) {
            System.out.println("The website type is: Educational institution");
        } else if(website.contains(".gov")){
            System.out.println("The website type is: Government website");
        } else if (website.contains(".net")) {
            System.out.println("The website type is: Network-related website");
        } else if(website.contains(".info")){
            System.out.println("The website type is: Informational website\n");
        } else {
            System.out.println("The website type is: Unknown or other types of websites");
        }
    }
}
