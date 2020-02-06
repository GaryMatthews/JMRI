package jmri.jmrit.whereused;

import org.junit.*;

import jmri.util.JUnitUtil;

/**
 * Tests for the SensorWhereUsed Class
 *
 * @author Dave Sand Copyright (C) 2020
 */
public class SensorWhereUsedTest {

    @Test
    public void testCreate() {
        jmri.Sensor sensor = jmri.InstanceManager.getDefault(jmri.SensorManager.class).provideSensor("IT101");
        String result = SensorWhereUsed.checkTurnouts(sensor);
        Assert.assertEquals("",result);
    }

    @Before
    public void setUp() {
        JUnitUtil.setUp();
        JUnitUtil.resetProfileManager();
    }

    @After
    public void tearDown() {
        JUnitUtil.tearDown();
    }
}
