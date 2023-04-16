import java.util.*;
public class ATMmain{
    public static void main (String args []){
        int op,i,ch;
        int enter_op;
        String user,pass;
        String Rec_name;
        Long Rec_acc_no;
        int flag=0;
        int flag1=0;

        Scanner sc=new Scanner (System.in);
        Scanner sc1=new Scanner(System.in);
        ArrayList <login> list=new ArrayList<login>();
        
        do{
        System.out.println("Choose the option from below dropdown:");
        System.out.println("1.Register\n"+"2.Exit");
        op=sc.nextInt();
        switch(op){
            case 1:
            login obj=new login();
            obj.getdata();
            list.add(obj);
            System.out.println("Registration completed...kindly login");
            System.out.println("-------------------------------------------------");
            System.out.println();
            do{
            System.out.println("1.Login\n"+"2.Exit");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter Your Username:");
                user=sc.next();

                System.out.println("Enter Your Password:");
                pass= sc.next();

                
                for(i=0;i<list.size();i++){
                    if(list.get(i).username.equals(user) && list.get(i).password.equals(pass)){
                        flag=1;
                        System.out.println("Login Successfully!!");
                    System.out.println();
                    System.out.println("************* Welcome back "+list.get(i).name+" ******************");
                    do{
                        System.out.println("1.Withdraw\n2.Deposit\n3.Transfer");
                        System.out.println("4.Check Balance\n5.Transaction History\n6.Exit");
                        enter_op=sc.nextInt();
                        switch(enter_op){
                            case 1:
                            list.get(i).Withdrawal();
                            break;

                            case 2:
                            list.get(i).Deposit(); 
                            break;

                            case 3:
                            System.out.println("Enter receipant's name:");
                            Rec_name=sc1.nextLine();
                            System.out.println("Enter receipant's account number:");
                            Rec_acc_no=sc.nextLong();
                            for(int j=0;j<list.size();j++){
                                if(list.get(j).name.equals(Rec_name) && list.get(j).accno == Rec_acc_no){
                                    list.get(i).Transfer(list.get(j));
                                    System.out.println(list.get(i).transfer_money+" rs Successfully transfered to "+Rec_name);
                                    flag1=1;
                                    break;
                                }
                                else{
                                    flag1=0;
                                }
                            }
                            if(flag1==0){
                                System.out.println("Enter valid receipant's details..");
                            }
                            System.out.println();
                            System.out.println("-----------------------------------------");
                            System.out.println();
                            break;

                            case 4:
                            list.get(i).check_balance(); 
                            break;

                            case 5:
                            list.get(i).Transaction_History();
                            break;
                            
                        }

                    }while(enter_op<6);
                }

                else{
                    flag=0;
                }

                if(flag==0){
                    System.out.println("Wrong Username or Password...Kindly Login Again");
                }

            }

              
            

                break;

                case 2:
                break;


            }
        
            }while(ch<2);



                case 2:
                break;
        }

    }while(op<2);
    
            }

        }
    

