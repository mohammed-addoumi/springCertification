package question2;

public class Runner {

    public static void main(String[] args) {
        User user = new User.Builder().setId(12).setName("simo").setPassword("test password").build();
        System.out.println(user);
    }
}
