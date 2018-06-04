
package com.finalpjt.beans;

import com.finalpjt.entity.User;
import com.finalpjt.service.UserService;

import javax.ejb.EJB;


public class UserController {

    private Long idUser;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String address;
    
    
    @EJB
    private UserService userService;
    
    public UserController() {}
    
    public String register() {
        try {
            User user = new User();
            user.setFirstname(firstName);
            user.setLastname(lastName);
            user.setLogin(login);
            user.setPassword(password);
            user.setAddress(address);
            userService.addUser(user);
            
            return "access";
        } catch(Exception e) {
            e.printStackTrace();
            return "denied";
        }
    }
    
    public String loginAction() {
        try {
            User user;
            if(login != null && password != null) {
                user = userService.getConnecteUser(lastName, password);
            } 
            return "access";
        } catch(Exception e) {
            e.printStackTrace();
            return "denied";
        }
    }
    
    public Long getIdUser() {
        return idUser;
    }
    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
     
}
