package net.simple.armor.stand.pose.events;

import net.kyori.adventure.text.Component;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import net.simple.armor.stand.pose.lang.I18nOpenCommunityLang;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.util.EulerAngle;

import java.util.HashMap;

public class ArmorPose implements Listener {
    public static HashMap<Location, Integer> pose = new HashMap<>();
    public String message;

    @EventHandler
    public void onClick(PlayerInteractAtEntityEvent event) {
        Entity entity = event.getRightClicked();
        Player sender = event.getPlayer();
        if (entity instanceof ArmorStand) {
            if (!event.getPlayer().isSneaking()) return;
            event.setCancelled(true);
            ArmorStand armorstand = (ArmorStand) event.getRightClicked();
            if (pose.containsKey(armorstand.getLocation())) {
                Integer position_pose = pose.get(armorstand.getLocation());
                switch (position_pose) {
                    case 1:
                        pose.put(armorstand.getLocation(), 2);
                        armorstand.setArms(true);
                        armorstand.setBodyPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setHeadPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setLeftLegPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setRightLegPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setLeftArmPose(new EulerAngle(Math.toRadians(339), Math.toRadians(0), Math.toRadians(346)));
                        armorstand.setRightArmPose(new EulerAngle(Math.toRadians(339), Math.toRadians(0), Math.toRadians(15)));

                        message = "0";
                        this.sendMessage(sender, message);
                        break;
                    case 2:
                        pose.put(armorstand.getLocation(), 3);
                        armorstand.setArms(true);
                        armorstand.setBodyPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setHeadPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setLeftLegPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setRightLegPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setLeftArmPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setRightArmPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));

                        message = "1";
                        this.sendMessage(sender, message);
                        break;
                    case 3:
                        pose.put(armorstand.getLocation(), 4);
                        armorstand.setArms(true);
                        armorstand.setBodyPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setHeadPose(new EulerAngle(Math.toRadians(14), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setLeftLegPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setRightLegPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setLeftArmPose(new EulerAngle(Math.toRadians(312), Math.toRadians(0), Math.toRadians(39)));
                        armorstand.setRightArmPose(new EulerAngle(Math.toRadians(312), Math.toRadians(0), Math.toRadians(323)));

                        message = "2";
                        this.sendMessage(sender, message);
                        break;
                    case 4:
                        pose.put(armorstand.getLocation(), 5);
                        armorstand.setArms(true);
                        armorstand.setBodyPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setHeadPose(new EulerAngle(Math.toRadians(356), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setLeftLegPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setRightLegPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setLeftArmPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(343)));
                        armorstand.setRightArmPose(new EulerAngle(Math.toRadians(282), Math.toRadians(0), Math.toRadians(0)));

                        message = "3";
                        this.sendMessage(sender, message);
                        break;
                    case 5:
                        pose.put(armorstand.getLocation(), 6);
                        armorstand.setArms(true);
                        armorstand.setBodyPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setHeadPose(new EulerAngle(Math.toRadians(346), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setLeftLegPose(new EulerAngle(Math.toRadians(11), Math.toRadians(0), Math.toRadians(353)));
                        armorstand.setRightLegPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(8)));
                        armorstand.setLeftArmPose(new EulerAngle(Math.toRadians(31), Math.toRadians(0), Math.toRadians(353)));
                        armorstand.setRightArmPose(new EulerAngle(Math.toRadians(248), Math.toRadians(37), Math.toRadians(0)));

                        message = "4";
                        this.sendMessage(sender, message);
                        break;
                    case 6:
                        pose.put(armorstand.getLocation(), 7);
                        armorstand.setArms(true);
                        armorstand.setBodyPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setHeadPose(new EulerAngle(Math.toRadians(346), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setLeftLegPose(new EulerAngle(Math.toRadians(11), Math.toRadians(0), Math.toRadians(353)));
                        armorstand.setRightLegPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(8)));
                        armorstand.setLeftArmPose(new EulerAngle(Math.toRadians(254), Math.toRadians(37), Math.toRadians(0)));
                        armorstand.setRightArmPose(new EulerAngle(Math.toRadians(254), Math.toRadians(324), Math.toRadians(0)));

                        message = "5";
                        this.sendMessage(sender, message);
                        break;
                    case 7:
                        pose.put(armorstand.getLocation(), 8);
                        armorstand.setArms(true);
                        armorstand.setBodyPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setHeadPose(new EulerAngle(Math.toRadians(346), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setLeftLegPose(new EulerAngle(Math.toRadians(11), Math.toRadians(0), Math.toRadians(353)));
                        armorstand.setRightLegPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(8)));
                        armorstand.setLeftArmPose(new EulerAngle(Math.toRadians(254), Math.toRadians(341), Math.toRadians(0)));
                        armorstand.setRightArmPose(new EulerAngle(Math.toRadians(241), Math.toRadians(40), Math.toRadians(0)));

                        message = "6";
                        this.sendMessage(sender, message);
                        break;
                    case 8:
                        pose.put(armorstand.getLocation(), 9);
                        armorstand.setArms(true);
                        armorstand.setBodyPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setHeadPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setLeftLegPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setRightLegPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setLeftArmPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(346)));
                        armorstand.setRightArmPose(new EulerAngle(Math.toRadians(309), Math.toRadians(338), Math.toRadians(15)));

                        message = "7";
                        this.sendMessage(sender, message);
                        break;
                    case 9:
                        pose.put(armorstand.getLocation(), 10);
                        armorstand.setArms(true);
                        armorstand.setBodyPose(new EulerAngle(Math.toRadians(0), Math.toRadians(6), Math.toRadians(0)));
                        armorstand.setHeadPose(new EulerAngle(Math.toRadians(356), Math.toRadians(47), Math.toRadians(0)));
                        armorstand.setLeftLegPose(new EulerAngle(Math.toRadians(0), Math.toRadians(40), Math.toRadians(350)));
                        armorstand.setRightLegPose(new EulerAngle(Math.toRadians(0), Math.toRadians(304), Math.toRadians(0)));
                        armorstand.setLeftArmPose(new EulerAngle(Math.toRadians(18), Math.toRadians(0), Math.toRadians(353)));
                        armorstand.setRightArmPose(new EulerAngle(Math.toRadians(248), Math.toRadians(47), Math.toRadians(0)));

                        message = "8";
                        this.sendMessage(sender, message);
                        break;
                    case 10:
                        pose.put(armorstand.getLocation(), 11);
                        armorstand.setArms(true);
                        armorstand.setBodyPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setHeadPose(new EulerAngle(Math.toRadians(14), Math.toRadians(23), Math.toRadians(0)));
                        armorstand.setLeftLegPose(new EulerAngle(Math.toRadians(18), Math.toRadians(141), Math.toRadians(350)));
                        armorstand.setRightLegPose(new EulerAngle(Math.toRadians(349), Math.toRadians(108), Math.toRadians(0)));
                        armorstand.setLeftArmPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(225)));
                        armorstand.setRightArmPose(new EulerAngle(Math.toRadians(265), Math.toRadians(334), Math.toRadians(0)));

                        message = "9";
                        this.sendMessage(sender, message);
                        break;
                    case 11:
                        pose.put(armorstand.getLocation(), 12);
                        armorstand.setArms(true);
                        armorstand.setBodyPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setHeadPose(new EulerAngle(Math.toRadians(346), Math.toRadians(348), Math.toRadians(0)));
                        armorstand.setLeftLegPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(353)));
                        armorstand.setRightLegPose(new EulerAngle(Math.toRadians(315), Math.toRadians(0), Math.toRadians(0)));
                        armorstand.setLeftArmPose(new EulerAngle(Math.toRadians(268), Math.toRadians(13), Math.toRadians(0)));
                        armorstand.setRightArmPose(new EulerAngle(Math.toRadians(268), Math.toRadians(348), Math.toRadians(0)));

                        message = "10";
                        this.sendMessage(sender, message);
                        break;
                    case 12:
                        pose.put(armorstand.getLocation(), 13);
                        armorstand.setArms(true);
                        armorstand.setBodyPose(new EulerAngle(Math.toRadians(0), Math.toRadians(355), Math.toRadians(0)));
                        armorstand.setHeadPose(new EulerAngle(Math.toRadians(356), Math.toRadians(30), Math.toRadians(0)));
                        armorstand.setLeftLegPose(new EulerAngle(Math.toRadians(238), Math.toRadians(0), Math.toRadians(306)));
                        armorstand.setRightLegPose(new EulerAngle(Math.toRadians(349), Math.toRadians(33), Math.toRadians(343)));
                        armorstand.setLeftArmPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(242)));
                        armorstand.setRightArmPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(120)));

                        message = "11";
                        this.sendMessage(sender, message);
                        break;
                    case 13:
                        pose.put(armorstand.getLocation(), 1);
                        armorstand.setArms(true);
                        armorstand.setBodyPose(new EulerAngle(Math.toRadians(0), Math.toRadians(351), Math.toRadians(0)));
                        armorstand.setHeadPose(new EulerAngle(Math.toRadians(356), Math.toRadians(324), Math.toRadians(0)));
                        armorstand.setLeftLegPose(new EulerAngle(Math.toRadians(346), Math.toRadians(0), Math.toRadians(12)));
                        armorstand.setRightLegPose(new EulerAngle(Math.toRadians(248), Math.toRadians(324), Math.toRadians(0)));
                        armorstand.setLeftArmPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(242)));
                        armorstand.setRightArmPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(120)));

                        message = "12";
                        this.sendMessage(sender, message);
                        break;
                    default:
                        break;
                }
            } else {
                pose.put(armorstand.getLocation(), 2);
                armorstand.setArms(true);
                armorstand.setBodyPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                armorstand.setHeadPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                armorstand.setLeftLegPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                armorstand.setRightLegPose(new EulerAngle(Math.toRadians(0), Math.toRadians(0), Math.toRadians(0)));
                armorstand.setLeftArmPose(new EulerAngle(Math.toRadians(339), Math.toRadians(0), Math.toRadians(346)));
                armorstand.setRightArmPose(new EulerAngle(Math.toRadians(339), Math.toRadians(0), Math.toRadians(15)));

                event.getPlayer().spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(I18nOpenCommunityLang.getRawMessage("pose") + ": 0"));
            }
        }
    }

    /**
     * Send a message.
     *
     * @param player
     * @param message
     */
    public void sendMessage(Player player, String message) {
        player.sendMessage(ChatMessageType.ACTION_BAR, new net.md_5.bungee.api.chat.TextComponent(I18nOpenCommunityLang.getRawMessage("pose") + ": " + message));
    }

}