package elitech.banking_app.mapper;

import elitech.banking_app.dto.AccountRequestDTO;
import elitech.banking_app.dto.AccountResponseDTO;
import elitech.banking_app.dto.UserInfoRequestDTO;
import elitech.banking_app.dto.UserResponseDTO;
import elitech.banking_app.entities.Account;
import elitech.banking_app.entities.UserInfo;
import org.modelmapper.ModelMapper;

public class AccountMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static AccountResponseDTO convertToDto(Account account) {
        return modelMapper.map(account, AccountResponseDTO.class);
    }

    public static Account convertToEntity(AccountRequestDTO accountRequestDTO) {
        return modelMapper.map(accountRequestDTO, Account.class);
    }


}
