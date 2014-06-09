package com.tinkerpop.blueprints.impls.jndi;

import com.tinkerpop.blueprints.Element;
import com.tinkerpop.blueprints.util.ElementHelper;

import java.util.*;
import java.sql.*;

/**
 * @author Travis Walker
 */
abstract class DataSourceElement implements Element {

    protected final Connection conn;
    protected final Object id;
    protected final DataSourceGraph graph;

    DataSourceElement(Connection conn, DataSourceGraph graph, Object id) {
        this.id = (Long) id;
        this.conn = conn;
        this.graph = graph;
    }

    @Override
    public Object getId() {
        return id;
    }

    @Override
    public <T> T getProperty(String key) {
        if (key == null || key.isEmpty()) {
            throw new IllegalArgumentException("Property key cannot be null (or empty)");
        }
        return null;
    }

    @Override
    public Set<String> getPropertyKeys() {
//        try {

//        } catch (SQLException e) {
//            throw new DataSourceGraphException(e);
//        }
        return null;
    }

    @Override
    public void setProperty(String key, Object value) {

//        try {

//        } catch (SQLException e) {
//            throw new DataSourceGraphException(e);
//        }
    }

    @Override
    public <T> T removeProperty(String key) {
        if (key == null || key.isEmpty()) {
            throw new IllegalArgumentException("Property key cannot be null");
        }
//        try {

//        } catch (SQLException e) {
//            throw new DataSourceGraphException(e);
//        }
        return null;
    }

    @Override
    public void remove() {
//        try {

//        } catch (SQLException e) {
//            throw new DataSourceGraphException(e);
//        }
    }

    @Override
    public String toString() {
        return "DataSource[" + id + "]";
    }

}
