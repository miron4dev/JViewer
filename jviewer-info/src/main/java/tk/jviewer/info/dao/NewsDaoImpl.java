package tk.jviewer.info.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import tk.jviewer.info.model.News;

import java.util.List;

/**
 * Implementation of {@link NewsDao}.
 */
public class NewsDaoImpl extends JdbcDaoSupport implements NewsDao {

    @Override
    public List<News> getNews() {
        return getJdbcTemplate().query("SELECT * FROM news", new BeanPropertyRowMapper<>(News.class));
    }

    @Override
    public void addNews(String topic, String text, String author, String date) {
        getJdbcTemplate().update("INSERT INTO news (topic, text, date, author) VALUES (?, ?, ?, ?)", topic, text,
                date, author);
    }

    @Override
    public void editNews(Integer id, String topic, String text, String author, String date) {
        getJdbcTemplate().update("UPDATE news SET topic = ?, text = ?, author = ?, date = ? WHERE id = ?", topic, text, author, date, id);
    }

    @Override
    public void deleteNews(Integer id) {
        getJdbcTemplate().update("DELETE FROM news WHERE id = ?", id);
    }
}
