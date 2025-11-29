public class Lasagna {
    
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int actualMin){
        int expectedMin = expectedMinutesInOven();
        if (actualMin > expectedMin) {
            return 0;
        }else{
            return expectedMin - actualMin;
        }
    }

    public int preparationTimeInMinutes(int numLayer){
        return 2 * numLayer;
    }

    public int totalTimeInMinutes(int numLayer,int numOvenMin){
        return preparationTimeInMinutes(numLayer) + numOvenMin;
    }
}
