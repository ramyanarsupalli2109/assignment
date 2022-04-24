package com.ebayk;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import com.ebayk.data.user.User;
import com.ebayk.data.user.UserRating;
import org.junit.jupiter.api.Test;

class UserControllerTest {

	  @Test
	     void singleuser() {
             UserController userController = new UserController();
	     User singleuser = userController.singleAd();
	     // assertNotNull(singleuser.getId(3));
	    // assertDoesNotThrow(() -> new UserRating(singleuser.getRatings()));
	    }		    
}
