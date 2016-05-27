package model;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * Created by Weeks on 5/25/16.
 */

public class Users {

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

}
