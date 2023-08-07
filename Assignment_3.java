import java.util.Scanner;

public class Assignment_3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String clrRed = "\033[31;1m";
        String clrBlue = "\033[34;1m";
        String clrGreen = "\033[32m";
        String reset = "\033[0m";
        int mark1 = 0, mark2 = 0, mark3 = 0;
        String name;
        int age;
        String sub1;
        String sub2;
        String sub3;
        
        myBlock1: {
            System.out.print("Enter your name:");
            name = scanner.nextLine();

            if (!(name.length() > 0 && !name.contains(" ")))
                System.out.printf("%sInvalid name %\n", clrRed);

            if (true)
                break myBlock1;
        }

        myBlock2: {
            System.out.print("Enter your age:");
            age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after reading the age

            if (age < 10 || age > 18)
                System.out.printf("%sInvalid age \n", clrRed);

            if (true)
                break myBlock2;
        }

        myBlock3: {
            System.out.print("Enter your subject:");
            sub1 = scanner.nextLine();

            if(!sub1.startsWith("SE-")) System.out.printf("%sInvalid Subject \n", clrRed);
            
            if(true) break myBlock3;
           
        }

        myBlock4: {
            System.out.print("Enter your marks:");
            mark1 = scanner.nextInt();
            scanner.nextLine();

            if(!(0 <= mark1 && mark1<=100)) System.out.printf("%sInvalid Marks \n", clrRed);

            if(true) break myBlock4;
           
        }

        myBlock5: {
            System.out.print("Enter your subject:");
            sub2 = scanner.nextLine();

            if(!sub2.startsWith("SE-")) System.out.printf("%sInvalid Subject \n", clrRed);
           
            if (sub2.equals(sub1)) System.out.printf("%sSubject already exists \n", clrRed);

             if(true) break myBlock5;
           
            }
        
        myBlock6: {
            System.out.print("Enter your marks:");
            mark2 = scanner.nextInt();

            scanner.nextLine();

            if(!(0 <= mark2 && mark2<=100)) System.out.printf("%sInvalid Marks \n", clrRed);

            if(true) break myBlock6;
           
        }


        myBlock7: {
            System.out.print("Enter your subject:");
            sub3= scanner.nextLine();

            if(!sub3.startsWith("SE-")) System.out.printf("%sInvalid Subject \n", clrRed);
            if (sub3.equals(sub1) || sub3.equals(sub2)) 
                System.out.printf("%sSubject already exists \n", clrRed);
        
            if(true) break myBlock7;
           
        }

        myBlock4: {
            System.out.print("Enter your marks:");
            mark3 = scanner.nextInt();
            scanner.nextLine();

            if(!(0 <= mark3 && mark3<=100)) System.out.printf("%sInvalid Marks \n", clrRed);

            if(true) break myBlock4;
        }
            int total= mark1 + mark2 + mark3;
            double avg = total / 3.0;
           // System.out.printf("Average Marks: %.2f \n", avg);

           String status;
           String status1;
           String status2;
           String status3;

           if (avg >=75) status = "Credit Pass";
           else if (75> avg && avg > 55) status = "Pass";
           else status="Fail";

           if (mark1>=75) status1 ="Credit Pass";
           if (75 > mark1 && mark1 > 55) status1 = "Pass";
           else status1="Fail";

           if (mark2>=75) status2 ="Credit Pass";
           else if (75 > mark2 && mark2 > 55) status2 = "Pass";
           else status2="Fail";

           if (mark3>=75) status3 ="Credit Pass";
           else if (75 > mark3 && mark3 > 55) status3 = "Pass";
           else status3="Fail";
           System.out.println();

           name = name.toUpperCase();
           sub1 = String.format("SE-%03d", Integer.parseInt(sub1.split("-")[1]));
           sub2 = String.format("SE-%03d", Integer.parseInt(sub2.split("-")[1]));
           sub3 = String.format("SE-%03d", Integer.parseInt(sub3.split("-")[1]));

           String CONSTANT ="|%s     |%d           |%s%s%s             |\n";
        
           System.out.printf("Name  :%s%s%s\n", clrBlue,name,reset);
           System.out.printf("Age   :%d years old \n", age);
           System.out.printf("Status:%s%s%s \n", (status.equals("Credit Pass") ? clrGreen : (status.equals("Pass") ? clrBlue : clrRed)), status, reset);
           System.out.printf("Total :%d    Average :%.2f \n", total, avg);
           
           System.out.println("+-----------+-------------+-----------------+");
           System.out.println("|  Subject  |   Marks     |   Status        |");
           System.out.println("+-----------+-------------+-----------------+");
           
           System.out.printf(CONSTANT, sub1,mark1,(status1.equals("Credit Pass") ? clrGreen : (status1.equals("Pass") ? clrBlue : clrRed)), status1, reset);
           System.out.printf(CONSTANT, sub2,mark2,(status2.equals("Credit Pass") ? clrGreen : (status2.equals("Pass") ? clrBlue : clrRed)), status2, reset);
           System.out.printf(CONSTANT, sub3,mark3,(status3.equals("Credit Pass") ? clrGreen : (status2.equals("Pass") ? clrBlue : clrRed)), status3, reset);
           System.out.println("+-----------+-------------+-----------------+\n");

           

        }  
        
    }
