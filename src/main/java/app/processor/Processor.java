package app.processor;

import app.dataStream.XmlToJava;
import app.model.Accounts;
import app.processor.filter.DataFilter;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Processor {
    private static final DataFilter filter = new DataFilter();

    public static void startProcessing() throws JAXBException, FileNotFoundException {
        Accounts accounts = XmlToJava.unmarshall();
        DataFilter.filter(accounts);
        /*List<Account> accountList= accounts.getAccountsList();
        for (Account account: accountList){
            System.out.println(account);
        }*/

    }
}