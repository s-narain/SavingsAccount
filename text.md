# SavingsAccount
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
}
