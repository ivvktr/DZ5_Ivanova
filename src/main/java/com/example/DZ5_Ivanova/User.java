package com.example.DZ5_Ivanova;

public class User {
    private String login;

    private String password;

    private String email;

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
}
