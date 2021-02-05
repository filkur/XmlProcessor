package app.processor;

import app.dataStream.JavaToXml;
import app.dataStream.XmlToJava;
import app.model.Accounts;
import app.filter.DataFilter;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Processor {
    public static void startProcessing() throws JAXBException, FileNotFoundException {
        Logger logger = LoggerFactory.getLogger(Processor.class);
        logger.info("Searching for a input file...");
        Accounts accounts = XmlToJava.unmarshall();
        logger.info("File exist! Start processing...");
        JavaToXml.marshal(DataFilter.filter(accounts));
        logger.info("Processing Done!");
    }
}
