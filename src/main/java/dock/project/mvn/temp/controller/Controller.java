package dock.project.mvn.temp.controller;

import dock.project.mvn.temp.model.RequestUser;
import dock.project.mvn.temp.model.User;
import dock.project.mvn.temp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Controller {

    @Autowired
    private UserService userService;

    @PostMapping("v1/retrieve/data")
    public ResponseEntity<User> getData(@RequestBody RequestUser requestUser) {
        User myUser = userService.getUser(requestUser);
        return new ResponseEntity<>(myUser, HttpStatus.OK);
    }

}
