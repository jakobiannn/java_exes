package com.company;

import java.util.HashMap;
import java.util.Map;

class UserMap {

    private Map<String,String> users = new HashMap<>();

    void setUser(String login, String password) {
        users.put(login, password);
    }

    void checkName(String login) throws Exception {

        for (Map.Entry<String, String> entry: users.entrySet()) {

            if (login.equals(entry.getKey())){
                throw (new Exception("Пользователь с таким именем" +
                        "уже существует!"));
            }
        }
    }

    String getPass(String login){
        return users.get(login);
    }
}
