package app.model.account;

import lombok.*;

import javax.xml.bind.annotation.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@XmlRootElement(name = "account")
@XmlType(propOrder = {"name", "currency", "balance", "closingDate"})
@XmlAccessorType(XmlAccessType.FIELD) //need this or throws exception
public class Account {

    @XmlAttribute
    private String iban;

    @XmlElement
    private String name;

    @XmlElement
    private String currency;

    @XmlElement
    private double balance;

    @XmlElement
    private String closingDate;

}
