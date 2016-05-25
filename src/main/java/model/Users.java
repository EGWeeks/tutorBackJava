package model;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * Created by Weeks on 5/25/16.
 */

public class Users {
    public static void main(String[] args) {
        get("/", (req, res) -> "This GETS all users.");

        post("/new", (req, res) -> {
            // req.body() return info as query string
            return "This is a POST for creating a new user." + req.body();
        });

        get("/:id", (req, res) -> "This GETS a users by ID.");

        post("/signin", (req, res) -> "This is a POST for signing a user in.");
    }


}
