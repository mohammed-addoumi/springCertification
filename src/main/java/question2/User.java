package question2;

public class User {

    private User(){}

    private int id;

    private String name;

    private String password;

    public User(int id, String name,String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    static class Builder{
        private Integer id = null;
        private String name = null;
        private String password = null;

         Builder setId(int id){
             this.id = id;
            return this;
        }

         Builder setName(String name){
             this.name = name;
            return this;
        }

        Builder setPassword(String password){
            this.password = password;
            return this;
        }

        User build(){
            return new User(this.id,this.name,this.password);
        }
    }
}
