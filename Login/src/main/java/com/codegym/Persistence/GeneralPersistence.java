package com.codegym.Persistence;

import com.codegym.Model.Login;
import com.codegym.Model.User;

public interface GeneralPersistence {
   User checkLogin(Login login);
}
