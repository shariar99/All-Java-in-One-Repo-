public class Account {
    private String number;
    private  double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(){
        this("4567",0.00,"Salim","salimhossain45@gmail.com","0192222222");

        System.out.println("Empty Constractor Called ");
    }

    public Account(String number , double balance,String customerName,String customerEmailAddress,String customerPhoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999",100.55,customerName,customerEmailAddress,customerPhoneNumber);

        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance+= depositAmount;
        System.out.println("Deposit of "+ depositAmount +" made. new balance " + this.balance );

    }
    public void withdrawal(double withdrowlAmount){
        if (balance - withdrowlAmount < 0){
            System.out.println("only "+ this.balance +"available .withdrawal not processed");

        }else {
            this.balance -= withdrowlAmount;
            System.out.println("Withdrawal of "+ withdrowlAmount +"processed Remaining balance =" +this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
