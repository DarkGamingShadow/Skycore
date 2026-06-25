package de.dgs.skycore;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Skycore implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("skycore");

    @Override
    public void onInitialize() {
        LOGGER.info("Skycore works");
    }
}
