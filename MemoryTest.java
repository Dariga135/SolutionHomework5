public class MemoryTest {
    public static void main(String[] args) {
        MarkerStyleFactory styleFactory = new MarkerStyleFactory();

        LocationMarker[] markersNoFlyweight = new LocationMarker[1000];
        for (int i = 0; i < 1000; i++) {
            markersNoFlyweight[i] = new LocationMarker("Location " + i, new HospitalMarkerStyle());
        }
        System.out.println("Memory usage without Flyweight: " + getMemoryUsage(markersNoFlyweight));

        LocationMarker[] markersWithFlyweight = new LocationMarker[1000];
        for (int i = 0; i < 1000; i++) {
            MarkerStyle style = styleFactory.getMarkerStyle("hospital");
            markersWithFlyweight[i] = new LocationMarker("Location " + i, style);
        }
        System.out.println("Memory usage with Flyweight: " + getMemoryUsage(markersWithFlyweight));
    }

    private static long getMemoryUsage(Object[] array) {
        long totalMemory = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();
        return totalMemory - freeMemory;
    }
}
