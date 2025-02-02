package android.example.donationapp.Model;

public class HomeActivityAdapterClass {

    private int imageResourceID;
    private String heading, location, time;

    public HomeActivityAdapterClass(int image, String sHeading, String sLocation, String sTime)
    {
        this.imageResourceID = image;
        this.heading = sHeading;
        this.location = sLocation;
        this.time = sTime;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
