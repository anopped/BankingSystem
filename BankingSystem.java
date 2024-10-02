import java.util.Scanner;

public class BankingSystem {
    public static void main (String[] args)
    {
        Baki baki = new Baki(0);
        Scanner scanner = new Scanner(System.in);


        int enteroption = 0;
        int correctid = 610984;
        int enterid;
        
        do
        {
            // System.out.println("----Enter PIN----");
            // enterid = scanner.nextInt();
            Menu mainmenu = new Menu();
            mainmenu.display2();
            enteroption = scanner.nextInt();
            if(enteroption == 1)
            {
                // Baki baki = new Baki();
                baki.display();
                
            }

            if(enteroption == 2)
            {
                // Baki baki = new Baki();
                double keluarwit = scanner.nextDouble();
                baki.Withdraw(keluarwit);
            }

            if(enteroption == 3)
            {
                // Baki baki = new Baki();
                double masukwit = scanner.nextDouble();
                baki.Deposit(masukwit);
                
            }

        }while(enteroption != 0);
        
    }
}


class Baki
{
    private double balance;
    
    public Baki(double balance)
    {
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void Withdraw(double withdraw)
    {
        if (withdraw<=balance)
        {
            withdraw = withdraw - balance;
            balance = withdraw;
            System.out.println("Account Balance = " + balance);
            System.out.println("Thanks for choosing Bank Isley");
            
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
        
    }

    public void Deposit(double deposit)
    {
        deposit = balance + deposit;
        balance = deposit;
        System.out.println("Account Balance = " + balance);
        System.out.println(" ");
        // System
    }

    public void display()
    {
    System.out.println("Your Balance = RM " + balance);
    System.out.println(" ");
    System.out.println(" ");
    // System.out.println("[10]-------Return Main Menu");
    // System.out.println("[0]--------Exit");
    }
}


class Menu
{
    public void display2()
    {
        System.out.println("---------Welcome to Bank Isley---------");
        System.out.println(" ");
        System.out.println("[1]-------Check Balance");
        System.out.println("[2]-------Withdraw Money");
        System.out.println("[3]-------Deposit Money");
        System.out.println("[9]-------Exit");
        System.out.println(" ");
    
    }
}

class teruskan
{
    public void sambung()
    {
        System.out.println("---------Continue Banking Bruh?---------");
    }
}