package com.company;

import com.company.points.Pass;
import com.company.points.TimeWay;
import com.company.points.Train;

public class Main {

    public static void main(String[] args) {
        Pass pass1 = new Pass(60,720);

        Train train1 = new Train("volvo", "Купе", 12, 120.2F);

        TimeWay timeway1 = new TimeWay("Санкт-петербург", "Владивосток", 22.7F);       
    }
}
