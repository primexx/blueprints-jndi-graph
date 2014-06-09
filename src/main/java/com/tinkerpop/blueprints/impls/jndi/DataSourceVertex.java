package com.tinkerpop.blueprints.impls.jndi;

import com.tinkerpop.blueprints.VertexQuery;
import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.Edge;

import com.tinkerpop.blueprints.util.DefaultVertexQuery;
import com.tinkerpop.blueprints.util.ExceptionFactory;

import java.sql.*;
import javax.sql.*;

/**
 * @author Travis Walker
 */
public class DataSourceVertex extends DataSourceElement implements Vertex {

    DataSourceVertex(Connection conn, DataSourceGraph graph, Object id) {
        super(conn, graph, id);
    }

    @Override
    public Edge addEdge(String label, Vertex vertex) {

        if (label == null) throw ExceptionFactory.edgeLabelCanNotBeNull();

        try {

        } catch (SQLException e) {
            throw new DataSourceGraphException(e);
        }

    }

    @Override
    public Iterable<Edge> getEdges(Direction direction, String... labels) {
        try {

        } catch (SQLException e) {
            throw new DataSourceGraphException(e);
        }
    }

    @Override
    public Iterable<Vertex> getVertices(Direction direction, String... labels) {
        try {

        } catch (SQLException e) {
            throw new DataSourceGraphException(e);
        }
    }

    @Override
    public VertexQuery query() {
        return new DefaultVertexQuery(this);
    }

}
