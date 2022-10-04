package java.axamit.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:credentials.properties"
})
public interface CredentialsConfig extends Config {

    @Config.Key("user")
    String user();

    @Config.Key("password")
    String password();

    @Config.Key("remote")
    @Config.DefaultValue("")
    String remote();

    String videoStorage();
}
