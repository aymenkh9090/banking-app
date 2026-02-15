package elitech.banking_app.mapper;

import elitech.banking_app.dto.TransactionRequestDTO;
import elitech.banking_app.dto.TransactionResponseDTO;
import elitech.banking_app.dto.UserInfoRequestDTO;
import elitech.banking_app.dto.UserResponseDTO;
import elitech.banking_app.entities.Transaction;
import elitech.banking_app.entities.UserInfo;
import org.modelmapper.ModelMapper;

public class TransactionMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static TransactionResponseDTO convertToDto(Transaction transaction) {
        return modelMapper.map(transaction, TransactionResponseDTO.class);
    }

    public static Transaction convertToEntity(TransactionRequestDTO  transactionRequestDTO) {
        return modelMapper.map(transactionRequestDTO, Transaction.class);
    }




}
