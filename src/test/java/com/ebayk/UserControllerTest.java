package com.ebayk;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.ebayk.data.user.User;
import com.ebayk.data.user.UserRating;
import java.net.URL;
import org.junit.jupiter.api.Test;

class UserControllerTest {

	  @Test
	     void listAd(Integer userID) {
             UserController userController = new UserController(3);
	     User listAdResponse = userController.listAd();
	     assertNotNull(listAdResponse.getId());
	    // assertDoesNotThrow(() -> new UserRating(listAdResponse.getRatings()));
	    }		    
}
