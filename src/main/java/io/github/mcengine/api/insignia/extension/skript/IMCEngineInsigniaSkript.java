package io.github.mcengine.api.insignia.extension.skript;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Insignia-based Skript module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to integrate scripted insignia content into the system.
 */
public interface IMCEngineInsigniaSkript {
    /**
     * Called when the Insignia Skript module is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Insignia Skript module is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Insignia Skript instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
