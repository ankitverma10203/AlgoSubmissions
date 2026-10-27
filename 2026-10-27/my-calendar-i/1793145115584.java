int lessEndTime = less != null ? intervals.get(less) : -1;
        int greaterStartTime = greater != null ? greater : Integer.MAX_VALUE;

        boolean isPossible =  startTime >= lessEndTime && endTime <= greaterStartTime;

        if (isPossible) {
            intervals.put(startTime, endTime);
        }


        Integer less = intervals.floorKey(startTime);
        Integer greater = intervals.ceilingKey(startTime);
    public boolean book(int startTime, int endTime) {

        if (intervals.containsKey(startTime)) return false;
    
    }
        intervals = new TreeMap<>();
    public MyCalendar() {


        return isPossible;
    }