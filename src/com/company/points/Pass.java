package com.company.points;

public class Pass {
    int MaxCountPass; // максимальное количество пассажиров в одном вагоне
    int AllPassInTrain; // общее количество пассажиров в поезде (на данном рейсе)

    String BeginStation = "Санкт-петербург"; // отправная точка

    public Pass(int maxCountPass, int allPassInTrain) {
        this.MaxCountPass = maxCountPass;
        this.AllPassInTrain = allPassInTrain;
    }

    public void Pass() {
        String WhereExit; // где выходит пассажир
    }
}
