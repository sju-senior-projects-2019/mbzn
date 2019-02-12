package com.example.marielberger.nflseniorproject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PlayerStats {




        public static void main(String[] args) {

            try {
                URL url = new URL ("https://api.mysportsfeeds.com/v1.0/pull/nfl/2018-regular/cumulative_player_stats.xml");
                String encoding = Base64Encoder.encode ("3147f37d-4293-4dbe-8daa-328a63:nflpassword");

                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setDoOutput(true);
                connection.setRequestProperty("Authorization", "Basic " + encoding);
                InputStream content = (InputStream)connection.getInputStream();
                BufferedReader in =
                        new BufferedReader(new InputStreamReader(content));
                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println(line);
                }
            } catch(Exception e) {
                e.printStackTrace();
            }

        }

    }

