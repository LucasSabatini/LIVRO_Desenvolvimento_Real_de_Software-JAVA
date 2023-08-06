public class MainApplication {

    public static void main(final String... args) throws Exception {

        final BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();

        final BankStatementParser bankStatementParser = new BankStatementCSVParser();

        bankStatementAnalyzer.analyze(args[0], bankStatementParser);
    }
}

//Ex3.16 - Problemas inesperados
//
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
//Exception in thread "main" java.nio.file.NoSuchFileException: src/main/resources/bank-data-simple.csv
//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space