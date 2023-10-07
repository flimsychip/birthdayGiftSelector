import java.util.Scanner;
public class birthdayGiftSelector {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("how much would you like to spend on a gift? ");
        double money = input.nextDouble();
        input.nextLine();
        if (money <= 0) {
            System.out.print("oh :(");
            return;
        }
        System.out.print("what kind of gift would you like to buy? your options are music, clothing, literature, or misc. ");
        var category = input.nextLine();
        if (money < 10){
            if (category.equalsIgnoreCase("music")){
                System.out.print("you could buy a cd");
            } else if (category.equalsIgnoreCase("clothing")){
                System.out.print("you could buy a hat");
            } else if (category.equalsIgnoreCase("literature")){
                System.out.print("you could buy a zine");
            } else if (category.equalsIgnoreCase("misc")){
                System.out.print("you could buy a keychain or pins");
            } else {
                System.out.print("invalid choice");
            }
        } else if (money < 30){
            if (category.equalsIgnoreCase("music")){
                System.out.print("you could buy a record");
            } else if (category.equalsIgnoreCase("clothing")){
                System.out.print("you could buy a shirt or pants");
            } else if (category.equalsIgnoreCase("literature")){
                System.out.print("you could buy a book");
            } else if (category.equalsIgnoreCase("misc")){
                System.out.print("you could buy a poster");
            } else {
                System.out.print("invalid choice");
            }
        } else if (money <= 50){
            if (category.equalsIgnoreCase("music")){
                System.out.print("you could buy a cd player");
            } else if (category.equalsIgnoreCase("clothing")){
                System.out.print("you could buy a jacket");
            } else if (category.equalsIgnoreCase("literature")){
                System.out.print("you could buy my textbooks for me");
            } else if (category.equalsIgnoreCase("misc")){
                System.out.print("you could buy a video game");
            } else {
                System.out.print("invalid choice");
            }
        } else {
            System.out.print("instead of a gift, please donate this amount to charity");
        }
    }
}