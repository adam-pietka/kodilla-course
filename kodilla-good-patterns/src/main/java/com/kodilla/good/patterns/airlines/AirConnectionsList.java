package com.kodilla.good.patterns.airlines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AirConnectionsList {
    Map<AirPort, List<String>>connectionListHash = new HashMap<>();
//    Map<String , List<String>> connectionList = new HashMap<>();
    List<String> warszawaList = new ArrayList<>();
    List<String> krakowList = new ArrayList<>();
    List<String> wroclawList = new ArrayList<>();
    List<String> gdansList = new ArrayList<>();

    public AirConnectionsList() {
        warszawaList.add("GDANSK");
        warszawaList.add("OLSZTYN");
        warszawaList.add("KRAKOW");
        warszawaList.add("WROCLAW");

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

        /*connectionList.put("WARSZAWA", warszawaList);
        connectionList.put("KRAKOW", krakowList);
        connectionList.put("WROCLAW", wroclawList);
        connectionList.put("GDANSK", gdansList);*/

        connectionListHash.put(new AirPort("Warszawa"), warszawaList);
        connectionListHash.put(new AirPort("Krakow"), krakowList);
        connectionListHash.put(new AirPort("Wroclaw"), wroclawList);
        connectionListHash.put(new AirPort("Gdansk"), gdansList);

    }

//    public Map<String, List<String>> getConnectionList() {
//        return connectionList;
//    }

    public Map<AirPort, List<String>> getConnectionListHash() {
        return connectionListHash;
    }
}



