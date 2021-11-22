package com.company.points;

public class Train {
    String MarkTrain; // марка поезда
    String Type; // тип вагонов (купе, плацкарт и т.п.)
    int CountVans; // количество вагонов
    float MaxSpeedTrain; // максимальная скорость поезда

    String currentStation = "Москва"; // текущая станция

    public Train(String markTrain, String type, int countVans, float maxSpeedTrain) {
        MarkTrain = markTrain;
        Type = type;
        CountVans = countVans;
        MaxSpeedTrain = maxSpeedTrain;
    }

    public void Train(String NextStation) {
        currentStation = NextStation;
    }
}
