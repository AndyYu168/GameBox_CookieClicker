package me.nikl.cookieclicker.upgrades.clicking;

import me.nikl.cookieclicker.Game;
import me.nikl.cookieclicker.upgrades.Upgrade;
import me.nikl.gamebox.util.NumberUtil;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

import java.util.ArrayList;

/**
 * Created by Niklas on 09.07.2017.
 *
 */
public class NevercrackMouse extends Upgrade{

    public NevercrackMouse(Game game) {
        super(game, 367);
        this.cost = 500000000000000000000.;
        setClickCookieReq(10000000000000000000.);

        icon = new MaterialData(Material.ARROW).toItemStack();
        icon.setAmount(1);

        ItemMeta meta = icon.getItemMeta();
        meta.setDisplayName("Nevercrack mouse");

        ArrayList<String> lore = new ArrayList<>();
        lore.add("Price: " + NumberUtil.convertHugeNumber(cost));
        lore.add(ChatColor.AQUA + "Clicking gains +1% of your CpS..");
        lore.add("");
        lore.add(ChatColor.ITALIC + "\"How much beefier can you");
        lore.add(ChatColor.ITALIC + "   make a mouse until");
        lore.add(ChatColor.ITALIC + "   it's considered a rat?");

        meta.setLore(lore);
        icon.setItemMeta(meta);
    }

    @Override
    public void onActivation() {
        game.cookiesPerClickPerCPS += 0.01;
        active = true;
    }


}
