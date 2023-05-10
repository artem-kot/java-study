package com.kots.practice.javarush.maps;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PlaygroundMapCaching {

    private static final Map<String, ArrayList<String>> dialogs = new HashMap<>();
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss.SS");

    private void logMessage(String userId, String initiator, String request, String response) {
        ArrayList<String> input = new ArrayList<>();
        input.add(dtf.format(LocalTime.now()) + " >> " + initiator + " : " + request);
        input.add(dtf.format(LocalTime.now()) + " >> Lara: " + response);

        if (dialogs.containsKey(userId)) {
            updateDialog(userId, input);
        } else {
            dialogs.put(userId, input);
        }

        System.out.println("Dialogs: " + dialogs.size());
        System.out.println("Users: " + Arrays.toString(dialogs.keySet().toArray()));
    }

    private static void updateDialog(String userId, ArrayList<String> input) {
        int limit = 8;
        if (dialogs.get(userId).size() >= limit) {
            for (int i = dialogs.get(userId).size() - limit + input.size(); i >= 0; i--) {
                dialogs.get(userId).remove(0);
            }
        }
        for (String utterance : input) {
            dialogs.get(userId).add(utterance);
        }
    }

    public static void main(String[] args) {
        PlaygroundMapCaching dialog = new PlaygroundMapCaching();
        dialog.logMessage("1", "Artem", "ping 1", "pong 1");
        dialog.logMessage("2", "Helen", "ping 1", "pong 1");
        dialog.logMessage("1", "Artem", "ping 2", "pong 2");
        dialog.logMessage("1", "Artem", "ping 3", "pong 3");
        dialog.logMessage("1", "Artem", "ping 4", "pong 4");
        dialog.logMessage("1", "Artem", "ping 5", "pong 5");

        Gson serGson = new GsonBuilder().setPrettyPrinting().create();
//        String json = serGson.toJson(dialogs);
//        System.out.println(json);

        String message = "{\"+4917667898175\":\"accept\"}\n";
        Gson gson = new Gson();
        Map json = gson.fromJson(message, Map.class);
        System.out.println(json.entrySet());
        System.out.println(json.keySet().toArray()[0]);
    }
}
