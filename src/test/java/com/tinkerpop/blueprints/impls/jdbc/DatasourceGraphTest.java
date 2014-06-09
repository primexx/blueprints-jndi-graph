package com.tinkerpop.blueprints.impls.sql;

import com.tinkerpop.blueprints.*;
import com.tinkerpop.blueprints.impls.GraphTest;
//import com.tinkerpop.blueprints.util.io.gml.GMLReaderTestSuite;
//import com.tinkerpop.blueprints.util.io.graphml.GraphMLReaderTestSuite;
//import com.tinkerpop.blueprints.util.io.graphson.GraphSONReaderTestSuite;

import java.io.*;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author Travis Walker
 */
public class DatasourceGraphTest extends GraphTest {

    public void testVertexTestSuite() throws Exception {
        this.stopWatch();
        doTestSuite(new VertexTestSuite(this));
        printTestPerformance("VertexTestSuite", this.stopWatch());
    }

    public void testEdgeTestSuite() throws Exception {
        this.stopWatch();
        doTestSuite(new EdgeTestSuite(this));
        printTestPerformance("EdgeTestSuite", this.stopWatch());
    }

    public void testGraphTestSuite() throws Exception {
        this.stopWatch();
        doTestSuite(new GraphTestSuite(this));
        printTestPerformance("GraphTestSuite", this.stopWatch());
    }

    public void testVertexQueryTestSuite() throws Exception {
        this.stopWatch();
        doTestSuite(new VertexQueryTestSuite(this));
        printTestPerformance("VertexQueryTestSuite", this.stopWatch());
    }

    public void testGraphQueryTestSuite() throws Exception {
        this.stopWatch();
        doTestSuite(new GraphQueryTestSuite(this));
        printTestPerformance("GraphQueryTestSuite", this.stopWatch());
    }

    public void testTransactionalGraphTestSuite() throws Exception {
        this.stopWatch();
        doTestSuite(new TransactionalGraphTestSuite(this));
        printTestPerformance("TransactionalGraphTestSuite", this.stopWatch());
    }

    @Override
    public Graph generateGraph() {
        return generateGraph(graphName);
    }

    @Override
    public Graph generateGraph(String graphName) {
        return null;
//        return new SqlGraph("com.mysql.jdbc.Driver", "jdbc:mysql:" + path);
    }

    public void doTestSuite(final TestSuite testSuite) throws Exception {

        startUp();
        cleanUp();

        for (Method method : testSuite.getClass().getDeclaredMethods()) {
            System.out.println("Testing " + method.getName() + "...");
            method.invoke(testSuite);
        }
    }

}
