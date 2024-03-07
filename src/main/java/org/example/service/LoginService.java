package org.example.service;

import com.mysql.cj.log.Log;
import org.example.dto.Login;

public interface LoginService {
    void insertLoginData(Login login);
    Boolean validationLogin(Login login);
}
