package example;

import java.sql.*;
import java.util.List;

interface IRepo<T> {
    int insert(T object) throws SQLException;
    void delete(T object) throws SQLException;
    void update(T object, int id) throws SQLException;
    List<T> getList() throws SQLException;

    Connection connectToDB() throws SQLException;
    Statement getStatement(Connection conn) throws SQLException;
}
