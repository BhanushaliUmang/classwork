package com.example.usermanagement.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.usermanagement.model.Users;

@Repository
public class UserRepo {
    
        private List<Users> userlist;

        public UserRepo(){
            userlist = new ArrayList<>();
            
            userlist.add(new Users("1", "Ajay", "Ajaysinh_jadeja", "Bhuj", "9988774789"));
            userlist.add(new Users("2", "Trishir", "Trishir_payel", "Gadhshisa", "8897897456"));
            userlist.add(new Users("3", "Bhargav", "Bhargav-Kanzariya", "Limdi", "8899877458"));
            userlist.add(new Users("4", "Jay", "Jay_Patel", "Unjha", "7788996547"));
        }

        public boolean save(Users user){
            userlist.add(user);
            return true;
        }

        public List<Users> getAllUsersFromRepo() {
            return userlist;
        }

        public Boolean remove(Users user) {
            userlist.remove(user);
            return true;
        }

        

        public Boolean update(Users user, Users user1) {
            userlist.remove(user1);
            userlist.add(user);

            return true;
        }

       
}
