package com.mcmiddleearth.mcmeadvancements.core.data;

import com.google.gson.JsonElement;
import com.mcmiddleearth.mcmeadvancements.core.TriggerType;

import java.util.Map;

public class CriterionData {

    private final JsonElement json;

    public CriterionData(JsonElement data) {
        this.json = data;
    }

    public TriggerType getTriggerType() {
        //todo: extract from json
        return null;
    }

    public Map<String,ConditionData> getConditions() {
        //todo: extract from json
        return null;
    }

    public String getAsString() {
        return json.getAsString();
    }
}
