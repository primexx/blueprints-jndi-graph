package com.tinkerpop.blueprints.impls.jndi;

import com.tinkerpop.blueprints.GraphQuery;
import com.tinkerpop.blueprints.Predicate;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.Edge;

/**
 * @author Travis Walker
 */
public class DataSourceGraphQuery implements GraphQuery {

    @Override
    public GraphQuery has(String key) {
        return null;  
    }

    @Override
    public GraphQuery has(String key, Object value) {
        return null;  
    }

    @Override
    public GraphQuery has(String key, Predicate predicate, Object value) {
        return null;  
    }

    @Override
    public GraphQuery hasNot(String key) {
        return null;  
    }

    @Override
    public GraphQuery hasNot(String key, Object value) {
        return null;  
    }

    @Override
    @Deprecated
    public <T extends Comparable<T>> GraphQuery has(String key, T value, Compare compare) {
        return null;  
    }

    @Override
    public <T extends Comparable<?>> GraphQuery interval(String key, T startValue, T endValue) {
        return null;  
    }

//    @Override
//    public <T> GraphQuery interval(String key, T startValue, T endValue) {
//        return null;  
//    }

    @Override
    public GraphQuery limit(int limit) {
        return null;  
    }

    @Override
    public Iterable<Edge> edges() {
        return null;  
    }

    @Override
    public Iterable<Vertex> vertices() {
        return null;  
    }
}
