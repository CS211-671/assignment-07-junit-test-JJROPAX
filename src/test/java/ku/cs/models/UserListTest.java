package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    UserList userList;
    @BeforeEach
    void init() {
        userList = new UserList();
        userList.addUser("user1", "plain-p@ssw0rd1");
        userList.addUser("user2", "plain-p@ssw0rd2");
        userList.addUser("user3", "plain-p@ssw0rd3");
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        User user = userList.findUserByUsername("user2");
        String expected = "user2";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("change password test")
    public void testUserCanChangePassword() {
        boolean actual = userList.changePassword("user2","plain-p@ssw0rd2","plain-p@ssw0rd12345");
        assertTrue(actual);
    }

    @Test
    @DisplayName("correct password test")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        User actual = userList.login("user1", "plain-p@ssw0rd1");
        assertNotNull(actual);
        User expected = userList.findUserByUsername("user1");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("incorrect password test")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        User actual = userList.login("user1", "wrong-password");
        assertNull(actual);
    }

}