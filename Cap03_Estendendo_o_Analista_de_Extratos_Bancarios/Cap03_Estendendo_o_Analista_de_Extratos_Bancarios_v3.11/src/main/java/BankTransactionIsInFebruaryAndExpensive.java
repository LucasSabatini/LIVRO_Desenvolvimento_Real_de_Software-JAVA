import java.time.Month;

public class BankTransactionIsInFebruaryAndExpensive implements BankTransactionFilter {
    @Override
    public boolean test(final BankTransaction bankTransaction) {
        return bankTransaction.getDate().getMonth() == Month.FEBRUARY
                && bankTransaction.getAmount() >= 1000;
    }
}
