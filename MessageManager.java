package com.quickchat;


    

public class MessageManager {

    private String[] sentMessages;
    private String[] disregardedMessages;
    private String[] storedMessages;
    private String[] messageHashes;
    private String[] messageIDs;

    private int sentCount;
    private int disregardedCount;
    private int storedCount;

    public MessageManager(int size) {

        sentMessages = new String[size];
        disregardedMessages = new String[size];
        storedMessages = new String[size];
        messageHashes = new String[size];
        messageIDs = new String[size];

        sentCount = 0;
        disregardedCount = 0;
        storedCount = 0;
    }
}

public String getLongestMessage(int sentCount) {

    String longest = "";

    for (int i = 0; i < sentCount; i++) {
        String[] sentMessages = null;

        if (sentMessages[i].length() > longest.length()) {

            longest = sentMessages[i];
        }
    }

    return longest;
}

public String searchMessagesByRecipient(String recipient, int sentCount, String[] sentMessages) {

    String results = "";

    for (int i = 0; i < sentCount; i++) {

        if (sentRecipients[i].equals(recipient)) {

            results += sentMessages[i] + "\n";
        }
    }

    return results;
}
