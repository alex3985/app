package Service;


import database.HerokuConnectionDB;
import modules.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.Class;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;


@RestController
public class UserService {
    @Autowired
    HerokuConnectionDB db;
    @RequestMapping("/getUsers")
    public LinkedList<User> getAllUser() {
        LinkedList<User> userList = new LinkedList<User>();
       try {
            Class.forName("org.postgresql.Driver");
            db = new HerokuConnectionDB();
            Statement st = db.getConnectionToHeroku().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM public.users ");
            while(rs.next()) {
                userList.add(new User(rs.getInt(1),rs.getString(2),
                        rs.getString(3),rs.getString(4)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return userList;
    }
}
