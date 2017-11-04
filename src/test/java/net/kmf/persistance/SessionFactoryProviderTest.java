package net.kmf.persistance;

import org.junit.Test;

import static org.junit.Assert.*;

public class SessionFactoryProviderTest {

    @Test
    public void getSessionFactory() throws Exception {
        assertNotNull("Session provider object returned", SessionFactoryProvider.getSessionFactory());
    }

}