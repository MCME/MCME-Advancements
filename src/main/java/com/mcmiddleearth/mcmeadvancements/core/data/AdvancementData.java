package com.mcmiddleearth.mcmeadvancements.core.data;

import com.google.gson.JsonElement;

import java.util.Map;

public class AdvancementData {

    private JsonElement json;

    public AdvancementData(JsonElement data) {
        this.json = data;
    }

    public Map<String, CriterionData> getCriteria() {
        //todo: extract from json
        return null;
    }

    public String getAsString() {
        return json.getAsString();
    }
}
