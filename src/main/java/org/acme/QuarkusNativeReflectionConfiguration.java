package org.acme;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(
    targets = {
        oracle.jdbc.datasource.impl.OracleDataSource.class,
        oracle.jdbc.logging.annotations.Feature.class,
        oracle.jdbc.logging.annotations.Supports.class,
        oracle.jdbc.xa.OracleXADataSource.class,
        oracle.jdbc.xa.client.OracleXADataSource.class,
        oracle.net.ano.AuthenticationService.class,
        oracle.net.ano.DataIntegrityService.class,
        oracle.net.ano.EncryptionService.class,
        oracle.net.ano.SupervisorService.class,
    }
)
public class QuarkusNativeReflectionConfiguration {
}
