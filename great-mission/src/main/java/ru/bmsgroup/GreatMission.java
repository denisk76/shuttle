package ru.bmsgroup;

public class GreatMission implements MissionService{
    private String pilotName;

    public GreatMission(String pilotName) {
        this.pilotName = pilotName;
    }

    @Override
    public String startTheEngine() {
        return pilotName+" Great start Engine";
    }

    @Override
    public String takeoff() {
        return "Great takeoff";
    }

    @Override
    public String flight() {
        return "great flight";
    }

    @Override
    public String landing() {
        return "great landing";
    }
}
