import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Loging system");

        Scanner input = new Scanner(System.in);


        UserRepo rp = new UserRepo();


        boolean oneMore = true;

        while (oneMore){

            System.out.println("Indtast User");
            String userName = input.nextLine();
            System.out.println("Indtast kode. Exit for at stoppe");
            String password = input.nextLine();

            if(rp.checkPass(userName,password)){
                System.out.println("Korrekt login");
            } else {
                System.out.println("prøv igen møgdyr");
            }

            if (password.equals("Exit")){
                oneMore = false;
            }
        }

        System.out.println(rp.checkPass("Søren","1234"));
        System.out.println(rp.checkPass("Søren","123"));


    }
}
