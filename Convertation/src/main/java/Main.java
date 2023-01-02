import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Users users = new Users("Tanya", 20);
        Users users1 = new Users("TanyaDD", 21);
        ArrayList<Users> list = new ArrayList<>();
        list.add(users);
        list.add(users1);

        UsersWrapper usersWrapper = new UsersWrapper();
        usersWrapper.setUsersArrayList(list);

        String user = objectMapper.writeValueAsString(usersWrapper);
        System.out.println(user);

//        String json = "{ \"name\" : \"Tanya\", \"age\" : \"20\" }";
//        Car car = objectMapper.readValue(user, Car.class);
//        System.out.println(car);
    }
}
