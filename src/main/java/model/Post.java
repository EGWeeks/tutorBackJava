package model;

/**
 * Created by Weeks on 5/27/16.
 */

public class Post {

    // User can post in a different location than there profile
    private int postId;
    private int userId;
    private String sport;
    private String type;
    private String rate;
    private String available;
    private String desc;
    private String location;
    private String lat;
    private String lng;

    public Post(int userId, String sport, String type, String rate, String available, String desc, String location, String lat, String lng) {
        this.userId = userId;
        this.sport = sport;
        this.type = type;
        this.rate = rate;
        this.available = available;
        this.desc = desc;
        this.location = location;
        this.lat = lat;
        this.lng = lng;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        if (postId != post.postId) return false;
        if (userId != post.userId) return false;
        if (!sport.equals(post.sport)) return false;
        if (!type.equals(post.type)) return false;
        if (!rate.equals(post.rate)) return false;
        if (!available.equals(post.available)) return false;
        if (!desc.equals(post.desc)) return false;
        if (!location.equals(post.location)) return false;
        if (!lat.equals(post.lat)) return false;
        return lng.equals(post.lng);

    }

    @Override
    public int hashCode() {
        int result = postId;
        result = 31 * result + userId;
        result = 31 * result + sport.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + rate.hashCode();
        result = 31 * result + available.hashCode();
        result = 31 * result + desc.hashCode();
        result = 31 * result + location.hashCode();
        result = 31 * result + lat.hashCode();
        result = 31 * result + lng.hashCode();
        return result;
    }
}
