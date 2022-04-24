package com.ebayk;
import java.util.Arrays;
import java.util.Collections;
import com.ebayk.data.user.UserRating;
import com.ebayk.data.user.UserRepository;
import com.ebayk.data.user.User;
import com.ebayk.service.RatingAnalyzer;
import com.ebayk.service.RatingAnalyzer.UserNotFoundException;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/{id}")
public class UserController {

 @RequestMapping("/rated-users")
  public List<User> listAd(@PathVariable("id") Integer userId) throws UserNotFoundException {
    return Arrays.asList(
        // This is just placeholder sample data
       User.newUser().id(2).name("Bob").ratings(Collections.emptyList()).ratings(
          Arrays.asList(
              new UserRating(3, 4000)
          )
      ).build(),
        User.newUser().id(3).name("Charles").ratings(Collections.emptyList()).ratings(
        Arrays.asList(
            new UserRating(3, 5)
          )
      ).build());
  }
 @RequestMapping("/rated-user")
  public User singleAd() {
    // This is just placeholder sample data
    return  User.newUser().id(4000).name("Cleo").ratings(Collections.emptyList()).build());
  }
 
}
