import java.util.*;

class A31
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int choice = 0;

        while(choice != 6)
        {
            System.out.println("\nStudent Daily Life Schedule");
            System.out.println("1. Morning Routine");
            System.out.println("2. College Time");
            System.out.println("3. Evening Study");
            System.out.println("4. Dinner Time");
            System.out.println("5. Night Routine");
            System.out.println("6. Exit");

            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            if(choice == 1)
            {
                System.out.println("6:00 AM - Wake up");
                System.out.println("6:30 AM - Exercise");
                System.out.println("7:00 AM - Breakfast");
            }
            else if(choice == 2)
            {
                System.out.println("8:00 AM - College starts");
                System.out.println("1:00 PM - Lunch");
                System.out.println("4:00 PM - College ends");
            }
            else if(choice == 3)
            {
                System.out.println("5:00 PM - Snacks");
                System.out.println("6:00 PM - Study");
            }
            else if(choice == 4)
            {
                System.out.println("8:00 PM - Dinner");
            }
            else if(choice == 5)
            {
                System.out.println("9:00 PM - Revision");
                System.out.println("10:30 PM - Sleep");
            }
            else if(choice == 6)
            {
                System.out.println("Schedule completed.");
            }
            else
            {
                System.out.println("Invalid choice");
            }
        }
    }
}