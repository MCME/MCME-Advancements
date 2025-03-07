package com.mcmiddleearth.mcmeadvancements.core.data;

import com.google.gson.JsonElement;

public class ConditionData {

    private final JsonElement json;

    public ConditionData(JsonElement data) {
        this.json = data;
    }

    public String getAsString() {
        return json.getAsString();
    }

}
