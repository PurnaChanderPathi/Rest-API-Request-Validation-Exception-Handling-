package com.purna.validations.service;

import com.purna.validations.dto.UserRequest;
import com.purna.validations.entity.User;
import com.purna.validations.exception.UserNotFoundException;
import com.purna.validations.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User saveUser(UserRequest userRequest)
    {
       User user= User.build(0, userRequest.getName(), userRequest.getName(),
               userRequest.getMobile(), userRequest.getGender(), userRequest.getAge(),
               userRequest.getNationality());
        return userRepository.save(user);
    }

    public List<User> getAllUsers()
    {
        return userRepository.findAll();
    }

    public User getUser(int id) throws UserNotFoundException {
        User user = userRepository.findByUserId(id);
        if (user != null) {
            return user;
        } else {
                    throw  new UserNotFoundException("user not found with id:"+id);
        }
    }
}
