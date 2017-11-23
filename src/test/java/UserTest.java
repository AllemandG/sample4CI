import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

import users.User;

public class UserTest {

    @Test
    public void test1() {
        User user = new User();
        user.setFirstName("Jean");
        Assert.assertThat(user.getFirstName(), IsEqual.equalTo("Jean"));
    }

    @Test
    public void test2() {
        User user = new User();
        user.setLastName("Dupont");
        Assert.assertThat(user.getLastName(), IsEqual.equalTo("Dupont"));
    }
    
    @Test
    public void test3() {
        User user1 = new User();
        User user2 = new User();
        user1.setLastName("Dupont");
        user2.setLastName("Dupont");
        Assert.assertNotEquals(user1, user2);
    }
    
    @Test
    public void test4() {
        User user1 = new User();
        User user2 = new User();
        user1.setLastName("Dupont");
        user1.setFirstName("Jean");
        user2.setLastName("Dupont");
        user2.setFirstName("Christophe");
        Assert.assertNotEquals(user1.toString(), user2.toString());
    }
}
