package com.kots.practice.javarush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PlayaroundClass {

    public static ArrayList<String> utterances = new ArrayList<>();

    private int maxSize() {
        return 5;
    }

    public void add3(String response) {
        addResponse(response);
        addResponse(response);
        addResponse(response);
    }

    public void addResponse(String response) {
        if (utterances.size() < maxSize()) {
            utterances.add(response);
        } else {
            utterances.remove(0);
            addResponse(response);
        }
    }
    public static void main(String[] args) {
        var test = new PlayaroundClass();
        System.out.println(utterances.size());
        test.add3("Hello");
        System.out.println(utterances.size());
        test.add3("How are you?");
        System.out.println(utterances.size());
        test.addResponse("Nice");
        System.out.println(utterances);

//        int multiplier = (int) (1 + Math.random() * 1000);
//        System.out.println("Факт " + (int) ((1 + Math.random()) * multiplier) + ":\n");
//
//        Map<String, ArrayList<String>> dialogs = new HashMap<>();
//
//        dialogs.put("111", new ArrayList<>());
//        dialogs.put("222", new ArrayList<>());
//        dialogs.put("333", new ArrayList<>());
//
//        dialogs.get("111").add("Hello");
//        dialogs.get("111").add("How are you?");
//        dialogs.get("111").add("I'm here for you");
//
//        dialogs.get("333").add("Gosh I hate you");
//        dialogs.get("333").add("HATRED!");
//
//        for(String user : dialogs.keySet()) {
//            HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
//            map.put(user, dialogs.get(user));
//            System.out.println(Arrays.deepToString(map.get(user).toArray()));
//        }



    }
}
