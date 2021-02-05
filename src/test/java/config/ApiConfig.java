package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:Desktop\\api.properties.txt",
        "system:properties"
})
public interface ApiConfig extends Config {

    @DefaultValue("https://ya.ru")
    @Key("api.url")
    String apiUrl();

    @DefaultValue("yandex")
    @Key("api.login")
    String apiLogin();

    @Key("api.password")
    String apiPassword();
}