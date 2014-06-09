package com.tinkerpop.blueprints.impls.jndi;

import com.tinkerpop.blueprints.*;
import com.tinkerpop.blueprints.util.DefaultGraphQuery;
import com.tinkerpop.blueprints.util.ExceptionFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import java.sql.*;
import javax.sql.*;

/**
 * @author Travis Walker (http://github.com/primexx)
 */
public class DataSourceGraph implements TransactionalGraph {

    private DataSource dataSource = null;
    private Connection conn = null;

    public DataSourceGraph(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Features getFeatures() {
        return FEATURES;
    }

    private static final Features FEATURES = new Features();
    static {
        FEATURES.supportsSerializableObjectProperty = true;
        FEATURES.supportsBooleanProperty = true;
        FEATURES.supportsDoubleProperty = true;
        FEATURES.supportsFloatProperty = true;
        FEATURES.supportsIntegerProperty = true;
        FEATURES.supportsPrimitiveArrayProperty = true;
        FEATURES.supportsUniformListProperty = true;
        FEATURES.supportsMixedListProperty = true;
        FEATURES.supportsLongProperty = true;
        FEATURES.supportsMapProperty = true;
        FEATURES.supportsStringProperty = true;

        FEATURES.isWrapper = false;
        FEATURES.isPersistent = true;
        FEATURES.supportsDuplicateEdges = true;
        FEATURES.supportsSelfLoops = true;
        FEATURES.supportsVertexIteration = true;
        FEATURES.supportsEdgeIteration = true;
        FEATURES.supportsVertexIndex = false;
        FEATURES.supportsEdgeIndex = false;
        FEATURES.ignoresSuppliedIds = true;
        FEATURES.supportsTransactions = true;
        FEATURES.supportsIndices = false;
        FEATURES.supportsKeyIndices = false;
        FEATURES.supportsVertexKeyIndex = false;
        FEATURES.supportsEdgeKeyIndex = false;
        FEATURES.supportsEdgeRetrieval = false;
        FEATURES.supportsVertexProperties = true;
        FEATURES.supportsEdgeProperties = true;
        FEATURES.supportsThreadedTransactions = false;
    }

    @Override
    public Vertex addVertex(Object o) {
        try {

        } catch (SQLException e) {
            throw new DataSourceGraphException(e);
        }
    }

    @Override
    public Vertex getVertex(Object id) {
        try {

        } catch (SQLException e) {
            throw new DataSourceGraphException(e);
        }
    }

    @Override
    public void removeVertex(Vertex vertex) {

    }

    @Override
    public CloseableIterable<Vertex> getVertices() {
        try {

        } catch (SQLException e) {
            throw new DataSourceGraphException(e);
        }
    }

    @Override
    public Iterable<Vertex> getVertices(String key, Object value) {
        try {

        } catch (SQLException e) {
            throw new DataSourceGraphException(e);
        }
    }

    @Override
    public Edge addEdge(Object o, Vertex out, Vertex in, String label) {
        return out.addEdge(label, in);
    }

    @Override
    public Edge getEdge(Object id) {

        if (null == id) throw ExceptionFactory.edgeIdCanNotBeNull();

        try {

        } catch (SQLException e) {
            throw new DataSourceGraphException(e);
        }
    }

    @Override
    public void removeEdge(Edge edge) {
        edge.remove();
    }

    @Override
    public CloseableIterable<Edge> getEdges() {
        try {

        } catch (SQLException e) {
            throw new DataSourceGraphException(e);
        }
    }

    @Override
    public Iterable<Edge> getEdges(String key, Object value) {
        try {

        } catch (SQLException e) {
            throw new DataSourceGraphException(e);
        }
    }

    @Override
    public GraphQuery query() {
        return new DefaultGraphQuery(this);
    }

    @Override
    public void commit() {
        try {
            conn.commit();
            conn.close();
        } catch (SQLException e) {
            throw new DataSourceGraphException(e);
        }
    }

    @Override
    public void rollback() {
        try {
            conn.rollback();
            conn.close();
        } catch (SQLException e) {
            throw new DataSourceGraphException(e);
        }
    }

    @Override
    public void shutdown() {
        commit();
    }

    @Override
    public String toString() {
        //return "DataSource[" + dataSource.getJdbcUrl() + "]";
        return "DataSource";
    }

    @Override
    @Deprecated
    public void stopTransaction(Conclusion conclusion) { }

}
