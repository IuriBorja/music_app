
public class Audio {

    private String title;
    private int duration;
    private int totalPlays;
    private int likes;
    private int classifications;


    public int getClassifications() {
        return classifications;
    }

    public void setClassifications(int classifications) {

        this.classifications = classifications;

        if (classifications >= 5) {
            System.out.println("This music is your favorite now with 5 stars");
        } else {
            System.out.println("Updated Classification");
        }


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int like() {
        return likes++;
    }

    public int play() {
        return totalPlays++;
    }


}
