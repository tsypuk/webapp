package smartjava.site;

import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Validated
public interface AccountService {
    @NotNull
    List<Account> getAllAccounts();

    Account getAccount(long id);

    Account saveAccount(
            @NotNull(message = "{validate.accountService.saveAccount.account}")
            @Valid Account account
    );

    void deleteAccount(long id);
}