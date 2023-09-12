package com.google.common.graph;

import java.util.Set;
import javax.annotation.Nullable;

interface GraphConnections<N, V> {
    void addPredecessor(N n, V v);

    V addSuccessor(N n, V v);

    Set<N> adjacentNodes();

    Set<N> predecessors();

    void removePredecessor(N n);

    V removeSuccessor(N n);

    Set<N> successors();

    @Nullable
    V value(N n);
}
