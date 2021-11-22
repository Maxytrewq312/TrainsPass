package com.company.points;

public class TimeWay {
    String BeginStation; // начальная станция
    String EndStation; // конечная станция
    float TravelTime; // время в пути без учета остановок

    float TimeStop = 30.0F; // время всех остановок

    public TimeWay(String beginStation, String endStation, float travelTime) {
        BeginStation = beginStation;
        EndStation = endStation;
        TravelTime = travelTime;
    }

    public void Time() {
        float AllTime = TimeStop + TravelTime; // общее время с учетом остановок
    }
}
