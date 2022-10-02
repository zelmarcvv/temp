package dock.project.mvn.temp.service.impl;

import dock.project.mvn.temp.model.RequestUser;
import dock.project.mvn.temp.model.User;
import dock.project.mvn.temp.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(RequestUser userName) {
        User userResponse = new User();
        userResponse.setUser(userName.getNameUser());
        userResponse.setPassword("12345");
        return userResponse;
    }
}
