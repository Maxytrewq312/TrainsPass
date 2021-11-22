package com.company.points;

public class Distance {
    String BeginStation; // начальная станция
    String EndStation; // конечная станция
    float DistFromStopToStop; // расстояние от остановки до остановки

    int CountStops = 10; // количество остановок
    public void Dist(float AllDist) {
        AllDist = CountStops * DistFromStopToStop;
    }
}
