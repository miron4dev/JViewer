package tk.jviewer.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import tk.jviewer.dao.RegistrationDao;

/**
 * Registration Data Access Object implementation.
 * @author Evgeny Mironenko
 */
public class RegistrationDaoImpl extends JdbcDaoSupport implements RegistrationDao {

    private static final String INVITATION_ID = "invitationID";

    @Override
    public void createProfile(String username, String password, String role, String faculty) {
        getJdbcTemplate().update("insert into \"jviewer_main\".\"user\" (username, password, role, department, first_name, last_name) values (?, ?, ?, ?, ?, ?)", username, password,
                role, faculty, "TODO", "TODO"); // TODO for EM
    }

    @Override
    public String getInvitationID() {
        return getJdbcTemplate().queryForObject("select value from \"jviewer_main\".\"config\" where name = ?", new Object[]{INVITATION_ID}, String.class);
    }
}
