package app.model;

import app.model.account.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "Accounts")
public class Accounts {
    @Setter
    @XmlElement(name = "Account")
    @Getter
    private List<Account> accountsList;
}
