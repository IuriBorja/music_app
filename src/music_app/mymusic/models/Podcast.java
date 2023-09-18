

public class Podcast extends Audio{

    private boolean guests;
    private int numberOfGuests;
    private int durationHours;
    private String name;
    private String hostName;
    private String description;




    @Override
    public int like() {
        return super.like() * 2;
    }

    @Override
    public int getClassifications() {
        return super.getClassifications() * 2;
    }

    public boolean isGuests() {
        return guests;
    }

    public void setGuests(boolean guests) {
        this.guests = guests;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public int getDurationHours() {
        return durationHours;
    }

    public void setDurationHours(int durationHours) {
        this.durationHours = durationHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
