package ru.bmsgroup;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "bmsgroup.flight")
@Getter
@Setter
public class GreatMissionProperties {
    private String pilotName;
}
