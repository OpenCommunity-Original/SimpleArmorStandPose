package net.simple.armor.stand.pose.lang;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.util.UTF8ResourceBundleControl;
import net.md_5.bungee.api.ChatMessageType;
import org.jetbrains.annotations.PropertyKey;

import java.util.MissingFormatArgumentException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import static org.bukkit.Bukkit.getLogger;

public class I18nOpenCommunityLang {
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle("languages.message",
            new UTF8ResourceBundleControl());

    /**
     * Returns a TextComponent un-styled from the give key.
     *
     * @param key String
     * @return TextComponent
     */
    public static TextComponent getMessage(@PropertyKey(resourceBundle = "languages.message") String key) {
        return getMessage(key, "");
    }

    /**
     * Returns a TextComponent un-styled from the give key.
     *
     * @param key String
     * @return TextComponent
     */
    public static TextComponent getMessage(@PropertyKey(resourceBundle = "languages.message") String key,
                                           String extra) {
        return Component.text(getRawMessage(key + extra));
    }

    /**
     * Returns a raw string message.
     *
     * @param key String
     * @return String
     */
    public static String getRawMessage(@PropertyKey(resourceBundle = "languages.message") String key) {
        if (resourceBundle == null) {
            return key;
        }
        try {
            return resourceBundle.getString(key);
        } catch (MissingResourceException e) {
            getLogger().info("Missing Resource " + e.getMessage());
            return key;
        }
    }

    /**
     * Produces a TexComponent that can accept typical java String.format type replacement before its created.
     *
     * @param key  Il8n key
     * @param args Object to insert.
     * @return TextComponent
     */
    public static TextComponent formatMessage(@PropertyKey(resourceBundle = "languages.message") String key,
                                              Object... args) {
        if (resourceBundle == null) {
            return Component.text(key);
        }
        try {
            String format = resourceBundle.getString(key);
            String out = String.format(format, args);
            return Component.text(out);
        } catch (MissingResourceException e) {
            getLogger().info("Missing Resource " + e.getMessage());
            return Component.text(key);
        } catch (MissingFormatArgumentException e) {
            getLogger().info("Missing Format Argument " + e.getMessage());
            return getMessage(key);
        }
    }
}

