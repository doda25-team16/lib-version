// Version aware library
package com.doda2025team16.libversion;

import java.io.InputStream;
import java.util.jar.Manifest;

public class VersionUtil {
    private static String version;

    public static String getVersion() {
        if (version != null) return version;
        
        try (InputStream input = VersionUtil.class.getResourceAsStream("/META-INF/MANIFEST.MF")) {
            if (input != null) {
                Manifest manifest = new Manifest(input);
                version = manifest.getMainAttributes().getValue("Implementation-Version");
            } else {
                version = "unknown";
            }
        } catch (Exception e) {
            version = "unknown";
        }
        
        return version != null ? version : "unknown";
    }
}
