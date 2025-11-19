// Version aware library
package com.doda2025team16.libversion;

import java.io.InputStream;
import java.util.Properties;

public class VersionUtil {
    private static String version;

    public static String getVersion() {
        if (version != null) return version;
        try (InputStream input = VersionUtil.class.getResourceAsStream(
            "/META-INF/maven/com.doda2025team16.libversion/lib-version/pom.properties")) {
            if (input != null) {
                Properties prop = new Properties();
                prop.load(input);
                version = prop.getProperty("version", "unknown");
            } else {
                version = "unknown";
            }
        } catch (Exception e) {
            version = "unknown";
        }
        return version != null ? version : "unknown";
    }
}
