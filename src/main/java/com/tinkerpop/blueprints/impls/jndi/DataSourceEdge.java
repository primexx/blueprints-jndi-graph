package com.tinkerpop.blueprints.impls.jndi;

import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.Direction;

import java.sql.*;

/**
 * @author Travis Walker
 */
public class DataSourceEdge extends DataSourceElement implements Edge {

    private final Object outV;
    private final Object inV;
    private final String label;

    public DataSourceEdge(Connection conn, DataSourceGraph graph, Object id, Object outV, Object inV, String label) {
        super(conn, graph, id);
        this.label = label;
        this.outV  = outV;
        this.inV   = inV;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public Vertex getVertex(Direction direction) throws IllegalArgumentException {
        switch (direction) {
            case IN:
                return new DataSourceVertex(conn, graph, inV);
            case OUT:
                return new DataSourceVertex(conn, graph, outV);
            default:
                throw ExceptionFactory.bothIsNotSupported();
        }
    }

    @Override
    public String toString() {
        return "DataSource[" + id + " (" + label + ")]";
    }

}
