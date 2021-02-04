import java.util.HashMap;
import java.util.Map;

public class UserRepo {


    private Map<String, User> userMap;


    public UserRepo() {
      userMap = new HashMap<>();
      userMap.put("Søren", new User("Søren", "123"));
      userMap.put("Makrellen", new User("Makrellen", "123"));
    }


    public boolean checkPass (String userName, String pass ){

       User user = userMap.get(userName);
       if (user != null) {
        return user.getPassword().equals(pass);
       } else {
           return false;
       }
    }

}





