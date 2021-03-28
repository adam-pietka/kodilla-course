package com.kodilla.good.patterns.airlines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AirConnectionsList {
//    List<AirConnection> connectionList = new ArrayList<>();
//    Map<String,AirConnection> connectionList = new HashMap<>();
    Map<String , List<String>> connectionList = new HashMap<>();
    List<String> wawrszawaList = new ArrayList<>();
    List<String> krakowList = new ArrayList<>();
    List<String> wroclawList = new ArrayList<>();
    List<String> gdansList = new ArrayList<>();

    public AirConnectionsList() {
        wawrszawaList.add("GDANSK");
        wawrszawaList.add("OLSZTYN");
        wawrszawaList.add("KRAKOW");
        wawrszawaList.add("WROCLAW");

        krakowList.add("RADOM");
        krakowList.add("WROCLAW");
        krakowList.add("WARSZAWA");
        krakowList.add("GDANSK");

        wroclawList.add("RADOM");
        wroclawList.add("WARSZAWA");
        wroclawList.add("SOPOT");
        wroclawList.add("GDANSK");

        gdansList.add("WARSZAWA");
        gdansList.add("KRAKOW");
        gdansList.add("ZAKOPANE");
        gdansList.add("WROCLAW");

        connectionList.put("WARSZAWA", wawrszawaList);
        connectionList.put("KRAKOW", krakowList);
        connectionList.put("WROCLAW", wroclawList);
        connectionList.put("GDANSK", gdansList);
    }

    public Map<String, List<String>> getConnectionList() {
        return connectionList;
    }
}


