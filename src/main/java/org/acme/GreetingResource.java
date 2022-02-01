package org.acme;

import io.agroal.api.AgroalDataSource;
import io.quarkus.agroal.DataSource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.Connection;
import java.sql.SQLException;

@Path("/hello")
public class GreetingResource {

    @Inject
    @DataSource("FOO")
    AgroalDataSource oracleDataSource;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws SQLException {
        try (Connection oracleConnection = oracleDataSource.getConnection()) {
            return oracleConnection.getClientInfo().toString();
        }
    }
}