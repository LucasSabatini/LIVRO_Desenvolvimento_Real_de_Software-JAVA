package main;

import java.io.IOException;

public class MainApplication {

    public static void main(final String... args) throws Exception {

        final BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();

        final BankStatementParser bankStatementParser = new BankStatementCSVParser();

        bankStatementAnalyzer.analyze("bank-data-simple.csv", bankStatementParser);
    }
}
