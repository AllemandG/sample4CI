import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

import users.User;

public class UserTest {

    @Test
    public void test1() {
        User user = new User();
        user.setFirstName("Jean");
//        Assert.assertThat(user.getLastName(), IsEqual.equalTo("Jean"));
    }

    @Test
    public void test2() {
        User user = new User();
        user.setLastName("Dupont");
//        Assert.assertThat(user.getLastName(), IsEqual.equalTo("Dupont"));
    }
    
    @Test
    public void test3() {
        User user1 = new User();
        User user2 = new User();
        user1.setLastName("Dupont");
        user2.setLastName("Dupont");
//        Assert.assertThat(user1.equals(user2), false);
    }
}
