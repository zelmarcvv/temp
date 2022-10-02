package dock.project.mvn.temp.service;

import dock.project.mvn.temp.model.RequestUser;
import dock.project.mvn.temp.model.User;

public interface UserService {
    User getUser(RequestUser userReq);

}
