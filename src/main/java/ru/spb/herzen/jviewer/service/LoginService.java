package ru.spb.herzen.jviewer.service;

import ru.spb.herzen.jviewer.model.RequestModel;
import ru.spb.herzen.jviewer.model.RoomModel;
import ru.spb.herzen.jviewer.model.RoomModelImpl;
import ru.spb.herzen.jviewer.model.UserModel;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: eugene
 * Date: 11/2/13
 * Time: 3:27 PM
 * To change this template use File | Settings | File Templates.
 */
public interface LoginService {

    UserModel getData(RequestModel requestModel);
    List<RoomModelImpl> getRooms();
}
