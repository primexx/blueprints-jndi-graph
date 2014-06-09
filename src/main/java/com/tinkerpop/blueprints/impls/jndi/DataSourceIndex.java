package com.tinkerpop.blueprints.impls.jndi;

import com.tinkerpop.blueprints.CloseableIterable;
import com.tinkerpop.blueprints.Element;
import com.tinkerpop.blueprints.Index;

/**
 * @author Travis Walker
 */
public class DataSourceIndex<T extends Element> implements Index<T> {

    @Override
    public long count(String key, Object value) {
        return 0;
    }

    @Override
    public CloseableIterable<T> get(String key, Object value) {
        return null;
    }

    @Override
    public Class<T> getIndexClass() {
        return null;
    }

    @Override
    public String getIndexName() {
        return null;
    }

    @Override
    public void put(String key, Object value, T element) {
      
    }

    @Override
    public CloseableIterable<T> query(String s, Object o) {
        return null;
    }

    @Override
    public void remove(String s, Object o, T t) {
      
    }
}
