

public class Music extends Audio{

    private String nameOfArtist;
    private String musicGenre;
    private String record;
    private int yearRealease;


    @Override
    public int getClassifications() {
        return super.getClassifications();
    }

    @Override
    public int like() {
        return super.like();
    }

    public String getNameOfArtist() {
        return nameOfArtist;
    }

    public void setNameOfArtist(String nameOfArtist) {
        this.nameOfArtist = nameOfArtist;
    }

    public String getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public int getYearRealease() {
        return yearRealease;
    }

    public void setYearRealease(int yearRealease) {
        this.yearRealease = yearRealease;
    }
}
