package Section10_003;

public class User {
    private String name;
    private String email;
    private String phoneNumber;

    // tao contruction
    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public User(){

    }

    //setter va getter
   public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //toString
    @Override
    public String toString() {
        return "User{" +
                "name : ," + name + '\'' +
                "email : ," + email + '\'' +
                "phoneNumber : " + phoneNumber + '\'' +
                '}';
    }
}


