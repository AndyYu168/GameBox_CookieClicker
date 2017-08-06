package me.nikl.cookieclicker.updates.factory;

import me.nikl.cookieclicker.Game;
import me.nikl.gamebox.util.NumberUtil;
import me.nikl.cookieclicker.buildings.Buildings;
import me.nikl.cookieclicker.updates.Upgrade;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

import java.util.ArrayList;

/**
 * Created by Niklas on 09.07.2017.
 *
 * Custom upgrade replacing 'Sweatshop'
 */
public class ChineseWorkers extends Upgrade{

    public ChineseWorkers(Game game) {
        super(game, 15);
        this.cost = 65000000;
        productionsRequirements.put(Buildings.FACTORY, 25);

        icon = new MaterialData(Material.IRON_BLOCK).toItemStack();
        icon.setAmount(1);

        ItemMeta meta = icon.getItemMeta();
        meta.setDisplayName("Chinese workers");

        ArrayList<String> lore = new ArrayList<>();
        lore.add("Price: " + NumberUtil.convertHugeNumber(cost));
        lore.add(ChatColor.AQUA + "Factories are "+ ChatColor.BOLD + "twice"+ ChatColor.RESET + ChatColor.AQUA + " as efficient.");
        lore.add("");
        lore.add(ChatColor.ITALIC + "\"New cookie flavor: chicken feet\"");

        meta.setLore(lore);
        icon.setItemMeta(meta);
    }

    @Override
    public void onActivation() {
        game.getBuilding(Buildings.FACTORY).multiply(2);
        game.getBuilding(Buildings.FACTORY).visualize(game.getInventory());
        active = true;
    }
}
