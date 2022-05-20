

public class Main {

    public static void main(String[] args) {




        Account shariarAccoubtr = new Account();
        //("12345",0.00,"Shariar","shariarhossain99@gmail.com","0191111111");

        System.out.println("Account Number : "+ shariarAccoubtr.getNumber() +"\n"+shariarAccoubtr.getBalance()+"\n"+ shariarAccoubtr.getCustomerName()+"\n"+shariarAccoubtr.getCustomerEmailAddress()+"\n"+shariarAccoubtr.getCustomerPhoneNumber());

        shariarAccoubtr.withdrawal(100);
        shariarAccoubtr.deposit(50.0);
        shariarAccoubtr.withdrawal(100);
        shariarAccoubtr.deposit(51);
        shariarAccoubtr.withdrawal(100);

        Account salimAccounts = new Account("Salim","salim@gmail.com","01762543151");
        System.out.println(salimAccounts.getNumber()+ " name "+ salimAccounts.getCustomerName());


    }
}