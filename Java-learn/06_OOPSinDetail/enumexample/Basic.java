package enumexample;

public class Basic {
    enum Week {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

        Week() {
            System.out.println("Constructor called for : " + this.toString());
        } // enum constructors are always private or default because we dont want to create new objects
        // internally: public static final Week SUNDAY = new Week();
    }
    public static void main(String[] args) {
        Week week;
        week = Week.SUNDAY;

        // for (Week day : Week.values()) {
        //     System.out.println(day);
        // }

        // System.out.println(week);
        // System.out.println(week.ordinal());
    }
}

