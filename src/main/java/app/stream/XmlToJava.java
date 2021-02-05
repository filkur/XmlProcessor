package app.stream;

import app.model.Accounts;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.FileReader;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class XmlToJava {
    public static Accounts unmarshall () throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(Accounts.class);
            return (Accounts) context.createUnmarshaller()
                    .unmarshal(new FileReader("./input.xml"));

    }
}
