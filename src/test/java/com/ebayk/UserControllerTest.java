package com.ebayk;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.ebayk.data.user.User;
import java.net.URL;
import org.junit.jupiter.api.Test;

class UserControllerTest {

	  @Test
	    void listAd(Integer userID) {
             UserController userController = new UserController();
	     ListAd listAdResponse = userController.listAd(userID);
	     assertNotNull(listAdResponse.getID());
	     assertDoesNotThrow(() -> new UserRating(listAdResponse.getRatings()));
	    }		    
}
