package com.tinkerpop.blueprints.impls.jndi;

import com.tinkerpop.blueprints.CloseableIterable;
import com.tinkerpop.blueprints.Edge;

import java.util.*;
import java.sql.*;

/**
 * @author Travis Walker
 */
public class DataSourceEdgeIterable<T extends Edge> implements CloseableIterable<Edge> {

    private final DataSourceGraph graph;
    private final Connection conn;

    DataSourceEdgeIterable(final Connection conn, DataSourceGraph graph) {
        this.graph = graph;
        this.conn = conn;
    }

    @Override
    public Iterator<Edge> iterator() {

        try {

        } catch (SQLException e) {
            throw new DataSourceGraphException(e);
        }

        return new Iterator<Edge>() {
            private Edge nextVal = null;

            @Override
            public boolean hasNext() {

            }

            @Override
            public Edge next() {

            }

            @Override
            public void remove() {

            }
        };
    }

    @Override
    public void close() {
        try {

        } catch (SQLException e) {
            throw new DataSourceGraphException(e);
        }
    }

}
