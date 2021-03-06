package ua.gwm.sponge_plugin.crates.preview;

import ninja.leaping.configurate.ConfigurationNode;
import org.spongepowered.api.entity.living.player.Player;
import ua.gwm.sponge_plugin.crates.manager.Manager;

public abstract class Preview {

    public Preview(ConfigurationNode node) {
    }

    public Preview() {
    }

    public abstract void preview(Player player, Manager manager);
}
