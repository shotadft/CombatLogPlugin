package jre.frwostella.combatLogPlugin.util;

import org.bukkit.ChatColor;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.NonNull;

public final class TextUtil {
    @Contract("_ -> new")
    public static @NonNull String color(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}
