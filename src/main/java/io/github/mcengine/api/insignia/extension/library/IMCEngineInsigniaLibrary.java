package io.github.mcengine.api.insignia.extension.library;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Insignia-based Library module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to provide insignia-related library support to the system.
 */
public interface IMCEngineInsigniaLibrary {
    /**
     * Called when the Insignia Library is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Insignia Library is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Insignia Library instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
