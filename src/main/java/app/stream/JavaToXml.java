package app.stream;

import app.model.Accounts;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JavaToXml {
    public static void marshal(Accounts accounts) throws JAXBException {
            JAXBContext jaxbContext = JAXBContext.newInstance(Accounts.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(accounts, new File("output.xml"));

    }
}
