package model;


/**
 * Created by Weeks on 5/25/16.
 */

public class Users {

    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String bio;
    private String location;
    private String zip;
    private String lat;
    private String lng;
    private String img;

    public Users(String firstName, String lastName, String email, String password, String bio, String location, String zip, String lat, String lng, String img) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.bio = bio;
        this.location = location;
        this.zip = zip;
        this.lat = lat;
        this.lng = lng;
        this.img = img;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (!firstName.equals(users.firstName)) return false;
        if (!lastName.equals(users.lastName)) return false;
        if (!email.equals(users.email)) return false;
        if (!password.equals(users.password)) return false;
        if (!bio.equals(users.bio)) return false;
        if (!location.equals(users.location)) return false;
        if (!zip.equals(users.zip)) return false;
        if (!lat.equals(users.lat)) return false;
        if (!lng.equals(users.lng)) return false;
        return img != null ? img.equals(users.img) : users.img == null;
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + bio.hashCode();
        result = 31 * result + location.hashCode();
        result = 31 * result + zip.hashCode();
        result = 31 * result + lat.hashCode();
        result = 31 * result + lng.hashCode();
        result = 31 * result + (img != null ? img.hashCode() : 0);
        return result;
    }

}
