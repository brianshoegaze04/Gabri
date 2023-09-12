package com.directions.route;

import java.util.ArrayList;

public interface RoutingListener {
    void onRoutingCancelled();

    void onRoutingFailure(RouteException routeException);

    void onRoutingStart();

    void onRoutingSuccess(ArrayList<Route> arrayList, int i);
}
