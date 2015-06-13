package tk.jviewer.service;

import tk.jviewer.model.RequestModel;
import tk.jviewer.model.RoomModel;
import tk.jviewer.model.UserModel;

import java.util.List;

/**
 * Login service interface.
 * @author Evgeny Mironenko
 */
public interface LoginService {

    /**
     * Gets user data from request model.
     * @param requestModel current request model
     * @return user data object.
     */
    UserModel getData(RequestModel requestModel);

    /**
     * Gets list of all available rooms.
     * @return list of rooms.
     */
    List<RoomModel> getRooms();
}
