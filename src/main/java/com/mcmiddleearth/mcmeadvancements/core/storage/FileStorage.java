package com.mcmiddleearth.mcmeadvancements.core.storage;

import java.io.File;
import java.util.UUID;

public class FileStorage implements StorageConnector {

    private final File file;

    public FileStorage(File file) {
        this.file = file;
    }

    @Override
    public void grantCriterion(UUID player, String advancement, String criterion) {

    }

    @Override
    public void advancementDone(UUID player, String advancement) {

    }
}
