package lessalopards.littlesister.DAO;

import java.util.List;

import lessalopards.littlesister.Model.Position;
import lessalopards.littlesister.Model.User;

public interface DataAccessObject {

    List<User> getAllUsers();
    List<Position> getAllPositions();
}
