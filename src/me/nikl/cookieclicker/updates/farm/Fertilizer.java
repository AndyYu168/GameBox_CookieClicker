package me.nikl.cookieclicker.updates.farm;

import me.nikl.cookieclicker.Game;
import me.nikl.cookieclicker.Utility;
import me.nikl.cookieclicker.productions.Buildings;
import me.nikl.cookieclicker.updates.Upgrade;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

import java.util.ArrayList;

/**
 * Created by Niklas on 09.07.2017.
 *
 */
public class Fertilizer extends Upgrade{

    public Fertilizer(Game game) {
        super(game, 11);
        this.cost = 55000;
        productionsRequirements.put(Buildings.FARM, 5);

        icon = new MaterialData(Material.DIRT).toItemStack();
        icon.setAmount(1);

        ItemMeta meta = icon.getItemMeta();
        meta.setDisplayName("Fertilizer");

        ArrayList<String> lore = new ArrayList<>();
        lore.add("Price: " + Utility.convertHugeNumber(cost));
        lore.add(ChatColor.AQUA + "Farms are "+ ChatColor.BOLD + "twice"+ ChatColor.RESET + ChatColor.AQUA + " as efficient.");
        lore.add("");
        lore.add(ChatColor.ITALIC + "\"It's chocolate, I swear.\"");

        meta.setLore(lore);
        icon.setItemMeta(meta);
    }

    @Override
    public void onActivation() {
        game.getBuilding(Buildings.FARM).multiply(2);
        game.getBuilding(Buildings.FARM).visualize(game.getInventory());
        active = true;
    }


}
