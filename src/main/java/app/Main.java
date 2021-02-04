package app;

import app.processor.Processor;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        Processor.startProcessing();
    }
}
