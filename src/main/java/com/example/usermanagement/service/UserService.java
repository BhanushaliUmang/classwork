package com.example.usermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usermanagement.dao.UserRepo;
import com.example.usermanagement.model.Users;

@Service
public class UserService {
    
    @Autowired
    UserRepo userRepo;

    public String addUser(Users user) {
        Boolean insert = userRepo.save(user);

        if(insert){
            return "User added";
        }
        else{
            return "Failed";
        }
    }

    public List<Users> getAllUsers() {
        return userRepo.getAllUsersFromRepo();
    }


    public Users getUserById(String id) {
        List<Users> userlist =  userRepo.getAllUsersFromRepo();

        for(Users user : userlist){
            if(user.getId().equals(id)){
                return user;
            }
        }

        return null;
    }

    public String deleteUserById(String id) {

        Boolean deleteresponse = false;

        String status;
        if(id != null)
        {
            List<Users> userlist =  userRepo.getAllUsersFromRepo();

            for(Users user : userlist)
            {
                if(user.getId().equals(id))
                {
                    deleteresponse = userRepo.remove(user);
                    if(deleteresponse)
                    {
                        status = "User with id: " + id + " was deleted";
                    }
                    else
                    {
                        status = "User with id: " + id + " was not deleted";
                    }
                    return status;
                }
            }

            return "User with id: " + id + " does not exist";

        }
        else
        {
            return "Cannot accept Null ID";
        }


        
    }

    public String updateTodoById(String id, Users user) {

        Boolean updateuser = false;
        String status;

        if(id !=null){
            List<Users> userlist =  userRepo.getAllUsersFromRepo();

            for(Users user1 : userlist){

                if(user1.getId().equals(id)){

                    updateuser = userRepo.update(user,user1);
                    if(updateuser)
                    {
                        status = "User with id: " + id + " was updated";
                    }
                    else
                    {
                        status = "User with id: " + id + " was not updated";
                    }
                    return status;
                }
            }
            return "User with id: " + id + " does not exist";
        }

        else
        {
            return "Cannot accept Null ID";
        }
    }
   
}
