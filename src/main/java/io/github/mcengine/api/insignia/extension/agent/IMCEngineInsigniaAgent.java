package io.github.mcengine.api.insignia.extension.agent;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Insignia-based Agent module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to integrate insignia-related agents into the system.
 */
public interface IMCEngineInsigniaAgent {
    /**
     * Called when the Insignia Agent is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Insignia Agent is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Insignia Agent instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
