import java.util.*;
public class person{
    
    protected String name;;
    // private String address; 
    // private int day,month,year;
    // private int age;
    // private String mob_no;
    // private String adhar_no;
    // private String email_id;
    // private String pan;
    protected String username,password;
    protected Long accno;
    int flag=0;

    

    public void getdata(){
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Name:");
        name=sc1.nextLine();

        // System.out.println("Address:");
        // address=sc.next();

        // System.out.println("Enter date of birth:");
        // do{
        //     System.out.println("Day:");
        //     day=sc.nextInt();
        // }while(day<0||day>31);
        // do{
        //     System.out.println("Month:");
        //     month=sc.nextInt();
        // }while(month>12||month<0);
        // do{
        //     System.out.println("Year:");
        //     year=sc.nextInt();
        // }while(year<1900||year>2022);
        
        // do{
        // System.out.println("Age:");
        //     age=sc.nextInt();
        // }while(age<0||age>120);

        
        // do{
        //     try{
        //         System.out.println("Mob No:");
        //         mob_no=sc.next();
        //         Long l = Long.parseLong(mob_no);
        //         // System.out.println(l);
        //          flag=1;
        //     }
        //     catch(Exception e){
        //         // System.out.println(e);
        //         System.out.println("You entered strings instead of numbers");
        //     }
        // }while(mob_no.length()!=10||flag==0);
        
        // do{
        //     flag=0;
        //     try{
        //         System.out.println("Aadhar No:");
        //         adhar_no=sc.next();
        //         Long l=Long.parseLong(adhar_no);
        //         flag=1;
        //     }

        //     catch(Exception e){
        //         System.out.println("You entered strings instead of numbers");
        //     }

        // }while(adhar_no.length()!=12||flag==0);

            
        // System.out.println("Email Address:");
        // email_id=sc.next();

        // do{
        //     System.out.println("PAN:");
        //     pan=sc.next();
        // }while(pan.length()!=12);

        System.out.println("Enter Your Username:");
            username=sc.next();

            System.out.println("Enter Your Password:");
            password=sc.next();

            System.out.println("Enter Your Account Number:");
            accno=sc.nextLong();

      }

      
}