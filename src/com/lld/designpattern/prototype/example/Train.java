package com.lld.designpattern.prototype.example;

public class Train implements TrainPrototype<Train>{
    private String name;
    private int trainNO;
    private double fare;
    private String trainType;
    private String engineType;
    private int noOfSeats;
    private String stationName;
    private String time;

    public Train() {
    }

    public Train(Train train) {
        name = train.name;
        trainNO = train.trainNO;
        fare = train.fare;
        trainType = train.trainType;
        engineType = train.engineType;
        noOfSeats = train.noOfSeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTrainNO() {
        return trainNO;
    }

    public void setTrainNO(int trainNO) {
        this.trainNO = trainNO;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public Train clone() {
        return new Train(this);
    }

    @Override
    public String toString() {
        return "Train{" +
                "name='" + name + '\'' +
                ", trainNO=" + trainNO +
                ", fare=" + fare +
                ", trainType='" + trainType + '\'' +
                ", engineType='" + engineType + '\'' +
                ", noOfSeats=" + noOfSeats +
                ", stationName='" + stationName + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
