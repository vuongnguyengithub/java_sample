package com.vuong.common.rest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.apache.log4j.Logger;


import io.swagger.jaxrs.config.BeanConfig;

@ApplicationPath("/api")
public class JAXRSConfiguration extends Application{

    private static final Logger LOGGER = Logger.getLogger(JAXRSConfiguration.class);

    public JAXRSConfiguration() {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion(getVersion("com.vuong", "java_sample"));
        beanConfig.setSchemes(new String[] { "http" });
        beanConfig.setBasePath("java_sample/api");
        beanConfig.setResourcePackage("com.vuong.common.rest");
        beanConfig.setScan(true);
    }

    private String getVersion(String groupId, String artifactId) {
        Properties properties = getPropertiesInfo(groupId, artifactId);
        String version = properties.getProperty("version");

        if (version == null) {
            Package aPackage = getClass().getPackage();
            if (aPackage != null) {
                version = aPackage.getImplementationVersion();
                if (version == null) {
                    version = aPackage.getSpecificationVersion();
                }
            }
        }
        return version;
    }

    private Properties getPropertiesInfo(String groupId, String artifactId) {
        Properties property = new Properties();
        InputStream pomFile = getClass().getResourceAsStream("/META-INF/maven/" + groupId + "/" + artifactId + "/pom.properties");
        if (pomFile != null) {
            try {
                property.load(pomFile);
            } catch (IOException ex) {
                LOGGER.error("Cannot get the version of project from pom.properties", ex);
            }
        }
        return property;
    }
}
