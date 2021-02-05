package app;

import app.processor.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){
        try {
            Processor.startProcessing();
        }
        catch (FileNotFoundException | JAXBException exception) {
            Logger logger = LoggerFactory.getLogger(Main.class);
            logger.info("Something goes wrong...");
        }

    }
}
