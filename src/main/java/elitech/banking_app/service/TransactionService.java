package elitech.banking_app.service;

import elitech.banking_app.dto.TransactionRequestDTO;
import elitech.banking_app.dto.TransactionResponseDTO;

import java.util.List;

public interface TransactionService {

    TransactionResponseDTO deposit(TransactionRequestDTO transactionRequestDTO);
    TransactionResponseDTO withdrawal(TransactionRequestDTO transactionRequestDTO);
    TransactionResponseDTO transfer(TransactionRequestDTO transactionRequestDTO);
    List<TransactionResponseDTO> getAllTransactions();
    


}
