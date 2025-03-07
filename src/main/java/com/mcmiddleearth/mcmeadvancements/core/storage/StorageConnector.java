package com.mcmiddleearth.mcmeadvancements.core.storage;

import java.util.UUID;

public interface StorageConnector {

    void grantCriterion(UUID player, String advancement, String criterion);

    void advancementDone(UUID player, String advancement);

}
