package tk.jviewer.dao.impl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import tk.jviewer.dao.LoginDao;
import tk.jviewer.model.RoomModel;
import tk.jviewer.model.UserModel;

import java.util.List;

/**
 * Login Data Access Object implementation.
 * @author Evgeny Mironenko
 */
public class LoginDaoImpl extends JdbcDaoSupport implements LoginDao {

    /**
     * @see tk.jviewer.dao.LoginDao#getData(String)
     */
    @Override
    public UserModel getData(String name) {
        return getJdbcTemplate().queryForObject("select * from users where name = ?", new Object[]{name},
                new BeanPropertyRowMapper<>(UserModel.class));
    }

    /**
     * @see tk.jviewer.dao.LoginDao#getRooms()
     */
    @Override
    public List<RoomModel> getRooms() {
        return getJdbcTemplate().query("select * from rooms", new BeanPropertyRowMapper<>(RoomModel.class));
    }
}
