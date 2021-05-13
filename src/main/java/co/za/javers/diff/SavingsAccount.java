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
//        balance=intValue;
    }


}
