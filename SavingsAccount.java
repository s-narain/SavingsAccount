class SavingsAccount 
{
    private final double startingBalance;
    private double interestRate;
    private int numMonths;
    private int deposit;
    private int withdrawal;
    private double interestEarned;
    private double endingBalance;
    private double accountBalance;

    public SavingsAccount(double bal, double intRate)
    {
        startingBalance = bal;
        interestRate = intRate;
    }

    public void withdraw() 
    {
        accountBalance = startingBalance - withdrawal;
    }

    public void deposit() 
    {
        accountBalance = accountBalance + deposit;
    }

    public void addInterest() 
    {
        // Get the monthly interest rate.
        double monthlyInterestRate = interestRate / 12;

        // Calculate the last amount of interest earned.
        interestEarned = monthlyInterestRate * accountBalance;

        // Add the interest to the balance.
        endingBalance = accountBalance + interestEarned;
    }

    //getters
    public double getStartingBalance()
    {
        return startingBalance;
    }

    public double getAnnualInterestRate()
    {
        return interestRate;
    }

    public int getMonth()
    {
        return numMonths;
    }

    public int getDeposits()
    {
        return deposit;
    }

    public int getWithdrawals()
    {
        return withdrawal;
    }

    public double getInterestEarned()
    {
        return interestEarned;
    }

    public double getEndingBalance()
    {
        return endingBalance;
    }

    //setters

    public void setInterestRate(double irate)
    {
        interestRate = irate;
    }

    public void setMonth(int mth)
    {
        numMonths = mth;
    }

    public void setDeposit(int dep)
    {
        deposit = dep;
    }

    public void setWithdrawal(int withd)
    {
        withdrawal = withd;
    }
    
    public static void main()
    {
        System.out.println("Starting   Annual\t\t\t\t\tInterest   Ending");
        System.out.println("Balance    Int. Rate \tMonths\tDeposits   Withdrawals\tEarned\t   Balance");

        SavingsAccount account1 = new SavingsAccount (500.0,0.00);
        account1.setMonth(1);
        account1.setDeposit(100);
        account1.setWithdrawal(50);
        account1.withdraw();
        account1.deposit();
        account1.addInterest();
        printSavingsAccount(account1);

        SavingsAccount account2 = new SavingsAccount (500.0,0.12);
        account2.setMonth(1);
        account2.setDeposit(100);
        account2.setWithdrawal(50);
        account2.withdraw();
        account2.deposit();
        account2.addInterest();
        printSavingsAccount(account2);

        SavingsAccount account3 = new SavingsAccount (500.0,0.24);
        account3.setMonth(1);
        account3.setDeposit(100);
        account3.setWithdrawal(50);
        account3.withdraw();
        account3.deposit();
        account3.addInterest();
        printSavingsAccount(account3);
    }
    
    public static void printSavingsAccount(SavingsAccount acc)
    { 
        System.out.printf("%.2f", acc.getStartingBalance());
        System.out.print("\t   ");
        System.out.printf("%.2f", acc.getAnnualInterestRate());
        System.out.print("\t\t");
        System.out.print(acc.getMonth() + "\t");
        System.out.print(acc.getDeposits() + "\t   ");
        System.out.print(acc.getWithdrawals() +"\t\t");
        System.out.printf("%.2f", acc.getInterestEarned());
        System.out.print("\t   ");
        System.out.printf("%.2f", acc.getEndingBalance());
        System.out.println();
    }
}
