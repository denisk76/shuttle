package ru.bmsgroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(TestMission.class)
@EnableConfigurationProperties(TestMissionProperties.class)
public class TestMissionAutoConfiguration {
    @Autowired
    private TestMissionProperties missionProperties;

    @Bean
    @ConditionalOnMissingBean
    public MissionService testMission() {
        return new TestMission(missionProperties.getPilotName());
    }

}
