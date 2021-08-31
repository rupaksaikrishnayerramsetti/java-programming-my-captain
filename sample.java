import java.util.*;
public class sample {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int choice;
        System.out.println("pick one : 1.hi \t 2.hello\t 3.bravo");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("you said hi");
                break;
            case 2:
                System.out.println("you said hello");
                break;
            case 3:
                System.out.println("you said bravo");
                break;
            default:
            System.out.println("Invalid syntax");
                break;
        }
	}
}