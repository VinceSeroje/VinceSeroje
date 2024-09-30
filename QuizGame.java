import java.util.Scanner;
public class QuizGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int life = 2;
        String a;
        System.out.println("You Have 2 life to Answer");
        System.out.println("Enter The Letter Of Your Answer");
        System.out.println();

        while (life > 0){
            System.out.println("1. What Is 10+10?");
            System.out.println("A. 45   B. 5   C.20 ");
            System.out.print("Answer: ");
            a = s.nextLine();
            if (a.equalsIgnoreCase("C")){ System.out.println("Your Answer Is Correct");break;}
            else life--;}
        System.out.println();

        while (life > 0){
            System.out.println("2. What Is 69x76?");
            System.out.println("A.5244   B.6784   C.4425");
            System.out.print("Answer: ");
            a = s.nextLine();
            if (a.equalsIgnoreCase("A")){ System.out.println("Your Answer Is Correct");break;}
            else life--;}
        System.out.println();

        while (life > 0){
            System.out.println("3. What Is The First Computer Language?");
            System.out.println("A.Java  B.Fortran   C.CSS");
            System.out.print("Answer: ");
            a = s.nextLine();
            if (a.equalsIgnoreCase("B")){ System.out.println("Your Answer Is Correct");break;}
            else life--;}
        System.out.println();

        while (life > 0){
            System.out.println("4. What Is The Center of Earth?");
            System.out.println("A. Crust  B. Inner Core  C.Outer Core");
            System.out.print("Answer: ");
            a = s.nextLine();
            if (a.equalsIgnoreCase("B")){ System.out.println("Your Answer Is Correct");break;}
            else life--;}
        System.out.println();

        while (life > 0){
            System.out.println("In What Year Computer Invented?");
            System.out.println("A. 1995   B. 1899  C. 1945");
            System.out.print("Answer: ");
            a = s.nextLine();
            if (a.equalsIgnoreCase("C")){ System.out.println("Your Answer Is Correct");break;}
            else life--;}
        System.out.println();

        while (life > 0){
            System.out.println("5. Who Wrote The El Filibusterismo?");
            System.out.println("A. Hen. Luna  B.Duterte  C. Dr. Jose Rizal");
            System.out.print("Answer: ");
            a = s.nextLine();
            if (a.equalsIgnoreCase("C")){ System.out.println("Your Answer Is Correct");break;}
            else life--;}
        System.out.println();

        while (life > 0){
            System.out.println("6. Bunos: Sino Mahal Mo");
            System.out.println("A. Self    B. Family  C. Friends ");
            System.out.print("Answer: ");
            a = s.nextLine();
            if (a.equalsIgnoreCase("A")){ System.out.println("Your Answer Is Correct");break;}
            else if (a.equalsIgnoreCase("B")){ System.out.println("Your Answer Is Correct");break;}
            else if (a.equalsIgnoreCase("C")){ System.out.println("Your Answer Is Correct");break;}
            else life--;}
        System.out.println();




        if (life > 0) System.out.println("You Won");
        else System.out.println("You Lost");

    }
}
