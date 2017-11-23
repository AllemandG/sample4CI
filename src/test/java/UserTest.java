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
    
    @Test
    public void test5() {
        User user1 = new User();
        User user2 = new User();
        user1.setLastName("Dupont");
        user2.setLastName("Dupont");
        Assert.assertNotEquals(user1.hashCode(), user2.hashCode());
    }
    
    @Test
    public void test6() {
        User user1 = new User();
        User user2 = user1;
        user1.setLastName("Dupont");
        Assert.assertEquals(user1.hashCode(), user2.hashCode());
    }
    
    @Test
    public void test7() {
        User user1 = new User();
        User user2 = new User();
        Assert.assertNotEquals(user1.getId(), user2.getId());
    }
    
    @Test
    public void test8() {
        User user1 = new User();
        User user2 = new User();
        user1.setLastName("Dupont");
        user1.setFirstName("Jean");
        user2.setLastName("Dupont");
        user2.setFirstName("Christophe");
        Assert.assertNotEquals(user1.getFirstName(), user2.getFirstName());
    }
    
    @Test
    public void test9() {
        User user1 = new User();
        Assert.assertNotEquals(user1, null);
    }
    
    @Test
    public void test10() {
        User user1 = new User();
        Assert.assertEquals(user1, user1);
    }
}
