import atl.academy.atl_academy_java_activities.actividad_10.Account;
import atl.academy.atl_academy_java_activities.actividad_10.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World");

        /* Activity 10 */

        Person person1 = new Person(123, 321, "Juan Ceballos", LocalDate.of(1991, 02, 15));
        System.out.println(person1.showData());
        System.out.println(person1.isAdult());

        Account account1 = new Account(person1, 11156988, 0);
        System.out.println(account1.showData());
        System.out.println("Deposit: " + account1.deposit(1000));
        System.out.println(account1.showData());
        System.out.println("Withdraw: " + account1.withdrawals(900));
        System.out.println(account1.showData());

    }
}
