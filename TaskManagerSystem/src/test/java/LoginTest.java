import org.example.main.Login;
import org.example.main.User;
import org.example.main.UserManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {
    @Test
    void returnLoginStatusTrue() {
        UserManager.userCount = 1;
        UserManager.users[0] = new User("kyl_1", "Ch&&sec@ke99!", "Kyle", "Smith");

        boolean value = Login.validateLoginCredentials(UserManager.users[0], "Ch&&sec@ke99!");
        assertTrue(value, "Login Status should be true");
    }

    @Test
    void returnLoginStatusFalse() {
        UserManager.userCount = 1;
        UserManager.users[0] = new User("kyl_1", "Ch&&sec@ke99!", "Kyle", "Smith");
        boolean value = Login.validateLoginCredentials(UserManager.users[0], "Password");
        assertFalse(value, "Login Status should be false");
    }

}
