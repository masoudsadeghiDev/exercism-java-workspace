
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        int len = birdsPerDay.length;
        return birdsPerDay[len -1];
    }

    public void incrementTodaysCount() {
        int len = birdsPerDay.length;
        birdsPerDay[len -1] = birdsPerDay[len -1] + 1;
    }

    public boolean hasDayWithoutBirds() {
        
        for(int count : birdsPerDay){

            if (count == 0) {
                return true;
            }

        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {

        if (numberOfDays < 0 ) 
            return 0;
        
        int total = 0;

        for(int i = 0; i < Math.min(birdsPerDay.length, numberOfDays) ; i++ ){
            int count = birdsPerDay[i];
            total +=count;
        }

        return total;
    }

    public int getBusyDays() {

        int busyDays = 0;

        for(int count: birdsPerDay){

            if (count >= 5) {
                busyDays++;
            }

        }

        return busyDays;
    }
}
