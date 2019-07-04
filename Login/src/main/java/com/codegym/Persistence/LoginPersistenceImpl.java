package com.codegym.Persistence;



import com.codegym.Model.Login;
import com.codegym.Model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LoginPersistenceImpl implements GeneralPersistence{
    ArrayList<User> userArrayList=new ArrayList<>();
    {
        userArrayList.add(new User("123abc","bang1122","nguyengocbang","hanoi",23));
        userArrayList.add(new User("noname","bang1122","sdfgh","hanoi",23));
        userArrayList.add(new User("one","bang","fgh","hanoi",23));
    }

    @Override
    public User checkLogin(Login login) {
        for (User u:userArrayList){
            if (u.getAccount().equals(login.getAccount())){
                return u;
            }
        }
        return null;
    }
}
