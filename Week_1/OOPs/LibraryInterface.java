package Week_1.OOPs;

interface Library {
    void registerAccount();
    void requestBook();
}

class kidUser implements Library {
    int age;
    String bookType;
    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }
    public void requestBook(){
        if(bookType.equals("Kids")){
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
       }
    }
}
class adultUser implements Library{
     int age;
    String bookType;
    public void registerAccount() {
        if (age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be more than 12 to register as an adult");
        }
    }
    public void requestBook(){
        if(bookType.equals("Fiction")){
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("“Oops, you are allowed to take only fiction books");
       }
    }
}
public class LibraryInterface {
    public static void main(String[] args) {
        // TestCase 1
        kidUser kid = new kidUser();
        kid.age=11;
        kid.registerAccount();

        kid.age=19;
        kid.registerAccount();

        kid.bookType="Kids";
        kid.requestBook();
        
        kid.bookType="Fiction";
        kid.requestBook();

        // TestCase 2
        adultUser adult = new adultUser();
        adult.age=5;
        adult.registerAccount();

        adult.age=23;
        adult.registerAccount();

        adult.bookType="Fiction";
        adult.requestBook();

        adult.bookType="Kids";
        adult.requestBook();
    }
}
