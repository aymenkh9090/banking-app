package elitech.banking_app.service;

import elitech.banking_app.dto.UserInfoRequestDTO;
import elitech.banking_app.dto.UserResponseDTO;

import java.util.List;

public interface UserService {

    UserResponseDTO createUser(UserInfoRequestDTO userInfoRequestDTO);
    UserResponseDTO getUserById(Long id);
    List<UserResponseDTO> getAllUsers();
    UserResponseDTO updateUser(Long id, UserInfoRequestDTO userInfoRequestDTO);
    void deleteUser(Long id);
    void addRoleToUser(Long id, String roleName);

}
