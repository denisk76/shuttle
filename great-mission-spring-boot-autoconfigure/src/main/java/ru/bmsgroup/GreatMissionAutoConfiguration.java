package ru.bmsgroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(GreatMission.class)
@EnableConfigurationProperties(GreatMissionProperties.class)
public class GreatMissionAutoConfiguration {
    @Autowired
    private GreatMissionProperties missionProperties;

    @Bean
    @ConditionalOnMissingBean
    public MissionService greatMission() {
        return new GreatMission(missionProperties.getPilotName());
    }

}
