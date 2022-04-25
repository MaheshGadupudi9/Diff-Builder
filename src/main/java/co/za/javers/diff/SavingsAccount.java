package co.za.javers.diff;

import java.math.BigDecimal;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */

interface Account{
   public BigDecimal balance = new BigDecimal(0.00);
}
public class SavingsAccount  implements Account{
    public SavingsAccount(BigDecimal intValue) {
        //balance=intValue;
    }

    @Override
    public String toString() {
        return balance.toString();
    }

    public static void main(String[] args) {
//        System.out.println(Math.round(Math.random()*10));
        final SavingsAccount account = new SavingsAccount(new BigDecimal(50.00));
        System.out.println(account);
    }
}
