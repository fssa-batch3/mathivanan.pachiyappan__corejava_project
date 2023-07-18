package Day06.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateTasks {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<String>();
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
        cityList.add("Mumbai");

        List<String> uniqueCityList = new ArrayList<>(new HashSet<>(cityList));

        System.out.println("Original City List: " + cityList);
        System.out.println("Unique City List: " + uniqueCityList);
    }
}

