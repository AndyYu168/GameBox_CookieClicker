package me.nikl.cookieclicker.updates.clicking;

import me.nikl.cookieclicker.Game;
import me.nikl.cookieclicker.updates.Upgrade;
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
public class AdamantiumMouse extends Upgrade{

    public AdamantiumMouse(Game game) {
        super(game, 78);
        this.cost = 50000000000.;
        setClickCookieReq(1000000000.);

        icon = new MaterialData(Material.ARROW).toItemStack();
        icon.setAmount(1);

        ItemMeta meta = icon.getItemMeta();
        meta.setDisplayName("Adamantium mouse");

        ArrayList<String> lore = new ArrayList<>();
        lore.add("Price: " + NumberUtil.convertHugeNumber(cost));
        lore.add(ChatColor.AQUA + "Clicking gains +1% of your CpS..");
        lore.add("");
        lore.add(ChatColor.ITALIC + "\"You could cut diamond with these.\"");

        meta.setLore(lore);
        icon.setItemMeta(meta);
    }

    @Override
    public void onActivation() {
        game.cookiesPerClickPerCPS += 0.01;
        active = true;
    }


}
