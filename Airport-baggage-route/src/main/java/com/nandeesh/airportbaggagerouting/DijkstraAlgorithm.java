package com.nandeesh.airportbaggagerouting;




import java.util.List;

import com.nandeesh.airportbaggagerouting.model.DirectedEdge;

public interface DijkstraAlgorithm {
    public String findShortestPath(String entry,String dest, List<DirectedEdge> graphEdges);
}
