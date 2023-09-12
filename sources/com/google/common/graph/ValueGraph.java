package com.google.common.graph;

import java.util.Set;
import javax.annotation.Nullable;

public interface ValueGraph<N, V> extends BaseGraph<N> {
    Set<N> adjacentNodes(N n);

    boolean allowsSelfLoops();

    Graph<N> asGraph();

    int degree(N n);

    @Nullable
    V edgeValueOrDefault(N n, N n2, @Nullable V v);

    Set<EndpointPair<N>> edges();

    boolean equals(@Nullable Object obj);

    boolean hasEdgeConnecting(N n, N n2);

    int hashCode();

    int inDegree(N n);

    boolean isDirected();

    ElementOrder<N> nodeOrder();

    Set<N> nodes();

    int outDegree(N n);

    Set<N> predecessors(N n);

    Set<N> successors(N n);
}
