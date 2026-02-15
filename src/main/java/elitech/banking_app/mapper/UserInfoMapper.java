package elitech.banking_app.mapper;

import elitech.banking_app.dto.UserInfoRequestDTO;
import elitech.banking_app.dto.UserResponseDTO;
import elitech.banking_app.entities.UserInfo;
import org.modelmapper.ModelMapper;

public class UserInfoMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static UserResponseDTO convertToDto(UserInfo userInfo) {
        return modelMapper.map(userInfo, UserResponseDTO.class);
    }

    public static UserInfo convertToEntity(UserInfoRequestDTO userInfoRequestDTO) {
        return modelMapper.map(userInfoRequestDTO, UserInfo.class);
    }



}
