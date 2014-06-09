package com.tinkerpop.blueprints.impls.jndi;

import com.tinkerpop.blueprints.CloseableIterable;
import com.tinkerpop.blueprints.Vertex;

import java.util.*;
import java.sql.*;

/**
 * @author Travis Walker
 */
public class DataSourceVertexIterable<T extends Vertex> implements CloseableIterable<Vertex> {

    private final DataSourceGraph graph;
    private final Connection conn;

    DataSourceVertexIterable(Connection conn, DataSourceGraph graph) {
        this.graph = graph;
        this.conn = conn;
    }

    @Override
    public void close() {
//        try {

//        } catch (SQLException e) {
//            throw new DataSourceGraphException(e);
//        }
    }

    @Override
    public Iterator<Vertex> iterator() {

//        try {

//        } catch (SQLException e) {
//            throw new DataSourceGraphException(e);
//        }

        return new Iterator<Vertex>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public DataSourceVertex next() {
                return null;
            }

            @Override
            public void remove() {
                
            }
        };
    }
}
