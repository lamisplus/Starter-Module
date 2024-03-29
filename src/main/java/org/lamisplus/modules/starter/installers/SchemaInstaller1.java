package org.lamisplus.modules.starter.installers;

import com.foreach.across.core.annotations.Installer;
import com.foreach.across.core.installers.AcrossLiquibaseInstaller;
import org.springframework.core.annotation.Order;

@Order(1)
@Installer(name = "schema-installer-starter",
        description = "Installs the required starter tables",
        version = 1)
public class SchemaInstaller1 extends AcrossLiquibaseInstaller {
    public SchemaInstaller1() {
        super("classpath:installers/starter/schema/schema-1.xml");
    }
}
