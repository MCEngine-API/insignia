package io.github.mcengine.api.insignia.addon;

import org.bukkit.plugin.Plugin;

/**
 * Interface for AI AddOn modules that can be dynamically loaded.
 */
public interface IMCEngineInsigniaAddOn {

    /**
     * Called when the AddOn is loaded by the AI engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);
}
