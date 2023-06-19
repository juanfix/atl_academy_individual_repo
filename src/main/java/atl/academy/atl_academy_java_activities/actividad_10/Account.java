package atl.academy.atl_academy_java_activities.actividad_10;

public class Account {
    private Person holder;
    private Integer accountNumber;
    private double balance;

    public Account(){

    }

    public Account(Person holder, Integer accountNumber, double balance){
        this.holder = holder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Person getHolder() {
        return holder;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }


    public String showData() {
        return "Account{" +
                "holder=" + holder.showData() +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public Boolean deposit (double value ) {
        if(value >= 0){
            this.balance += value;
            return true;
        }
        return false;
    }

    public boolean withdrawals ( double value ){
        if(this.balance >= value){
            this.balance -= value;
            return true;
        }
        return false;
    }

    public boolean transfer(double value, Account account) {
        if(this.balance >= value) {
            this.balance -= value;
            account.deposit(value);
            return true;
        }
        return false;
    }

}
