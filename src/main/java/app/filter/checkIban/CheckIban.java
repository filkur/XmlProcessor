package app.filter.checkIban;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.iban4j.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CheckIban {
    public static boolean check (String ibanStr){
        try {
            Iban iban = Iban.valueOf(ibanStr);
            IbanUtil.validate(ibanStr);
            IbanUtil.validate(ibanStr, IbanFormat.Default);
            return true;
            // valid
        } catch (IbanFormatException |
                InvalidCheckDigitException |
                UnsupportedCountryException e ) {
            // invalid
            return false;
        }
    }
}
