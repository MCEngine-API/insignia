package io.github.mcengine.api.insignia.extension.api;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Insignia-based API module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to provide insignia-related APIs to the system.
 */
public interface IMCEngineInsigniaAPI {
    /**
     * Called when the Insignia API is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Insignia API is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Insignia API instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
