package com.example.uservalidation.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.uservalidation.model.Users;

@Repository
public class UserRepo {
    private List<Users> userlist;

        public UserRepo(){
            userlist = new ArrayList<>();
            
            userlist.add(new Users("1", "Ajay", "ajay1@gmail.com", "919987456874", "27/03/2001"));
            userlist.add(new Users("2", "Trishir", "trishir12@gmail.com", "918874589654", "23/11/2000"));
            userlist.add(new Users("3", "Bhargav", "bh@gmail.com", "919874587698", "29/11/2000"));
            userlist.add(new Users("4", "Jay", "jay@gmail.com", "918878965478", "14/05/2001"));
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
