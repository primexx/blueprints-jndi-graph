package com.tinkerpop.blueprints.impls.jndi;

import java.sql.SQLException;

/**
 * @author Travis Walker
 */
public class DataSourceGraphException extends RuntimeException {
    public DataSourceGraphException(SQLException ex) {
        super(ex);
    }
}
