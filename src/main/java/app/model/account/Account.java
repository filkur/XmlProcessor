package app.model.account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "Account")
@XmlType(propOrder = {"name", "currency", "balance", "closingDate"})
public class Account {

    @Setter
    @XmlAttribute(name = "iban")
    @Getter
    private String iban;

    @Setter
    @XmlElement(name = "name")
    @Getter
    private String name;

    @Setter
    @XmlElement(name = "currency")
    @Getter
    private String currency;

    @Setter
    @XmlElement(name = "balance")
    @Getter
    private double balance;

    @Setter
    @XmlElement(name = "closingDate")
    @Getter
    private Date closingDate;

}
