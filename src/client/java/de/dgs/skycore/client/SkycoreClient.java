package de.dgs.skycore.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkycoreClient implements ClientModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("skycore");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Skycore works");
    }
}
