/*
 * Copyright (C) 2007-2014, GoodData(R) Corporation. All rights reserved.
 */
package com.gooddata.model;


import static org.junit.Assert.assertEquals;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

public class MaqlDdlTest {

    @Test
    public void testSer() throws Exception {
        assertEquals("{\"manage\":{\"maql\":\"maqlddl\"}}", new ObjectMapper().writeValueAsString(new MaqlDdl("maqlddl")));

    }
}
