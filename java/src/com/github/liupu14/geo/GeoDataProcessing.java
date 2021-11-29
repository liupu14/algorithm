package com.github.liupu14.geo;

public class GeoDataProcessing {
    public static void main(String[] args) {
        System.out.println(calDistance(34.766354,113.625814,34.7258400898,113.671765486));
    }

    public static double calDistance(double x1,double y1,double x2,double y2){
        final double EARTH_CIRCLE = 6378.137;
        double lat1 = Math.toRadians(x1);
        double lat2 = Math.toRadians(x2);
        double lng1 = Math.toRadians(y1);
        double lng2 = Math.toRadians(y2);
        double a = lat1 - lat2;
        double b = lng1 - lng2;
        double s = Math.asin(Math.sqrt(Math.pow(Math.sin(a/2),2)+Math.cos(lat1)*Math.cos(lat2)*Math.pow(Math.sin(b/2),2)));
        return 2 * s * EARTH_CIRCLE;

    }
}
