package AbstractionProblemSolving_Two;

class loan {
    private double annualInterestRate;
    private double loanAmount;
    private int numberOfyears;
    private java.util.Date loandate;

    public loan() {
        this(2.5,1000,1);
    }

    public loan (double annualInterestRate,int numberOfyears, double loanAmount){
      this.annualInterestRate = annualInterestRate;
      this.numberOfyears = numberOfyears;
      this.loanAmount = loanAmount;
      loandate=new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfyears() {
        return numberOfyears;
    }

    public void setNumberOfyears(int numberOfyears) {
        this.numberOfyears = numberOfyears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayments(){
        double monthlyInterest=annualInterestRate/1200;
        double  monthlyPayments=loanAmount * monthlyInterest/
                (1/Math.pow(1+monthlyInterest,numberOfyears*12));
        return  monthlyPayments;
    }

    public double getTotalPayments(){
        double totalPayments=getMonthlyPayments()*numberOfyears*12;
        return totalPayments;
    }

    public java.util.Date getLoandate(){
        return loandate;
    }
}
