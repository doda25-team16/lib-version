package com.doda2025team16.libversion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for VersionUtil
 */
public class AppTest {
    
    @Test
    public void testVersionUtilReturnsVersion() {
        String version = VersionUtil.getVersion();
        assertNotNull(version, "Version should not be null");
        assertFalse(version.isEmpty(), "Version should not be empty");
        System.out.println("Version detected: " + version);
    }
}
