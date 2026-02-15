package elitech.banking_app.service;

import elitech.banking_app.dto.AccountRequestDTO;
import elitech.banking_app.dto.AccountResponseDTO;

import java.util.List;

public interface AccountService {

    AccountResponseDTO createAccount(AccountRequestDTO accountRequestDTO);
    AccountResponseDTO getAccountById(Long id);
    List<AccountResponseDTO> getAllAccounts();
    Double getBalance(String accountNumber);




}
