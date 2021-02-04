package app.dataStream;

import app.model.Accounts;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JavaToXml {
    public static void marshal(Accounts accounts){
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Accounts.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(accounts, new File("output.xml"));
        } catch (JAXBException exception){
            System.out.println(exception.getErrorCode()+exception.getMessage());
        } catch (IllegalArgumentException exception){
            System.out.println("Can't find the input file. make sure it exists");
        }
    }
}
