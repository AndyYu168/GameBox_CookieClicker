package me.nikl.cookieclicker.upgrades.curser;

import me.nikl.cookieclicker.Game;
import me.nikl.cookieclicker.upgrades.UpgradeType;
import me.nikl.gamebox.util.NumberUtil;
import me.nikl.cookieclicker.buildings.Buildings;
import me.nikl.cookieclicker.upgrades.Upgrade;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

import java.util.ArrayList;

/**
 * Created by Niklas on 09.07.2017.
 *
 */
public class CarpalTunnelPreventionCream extends Upgrade{

    public CarpalTunnelPreventionCream(Game game) {
        super(game, 1);
        this.cost = 500;
        productionsRequirements.put(Buildings.CURSOR, 1);

        icon = new MaterialData(Material.ARROW).toItemStack();
        icon.setAmount(1);

        loadLanguage(UpgradeType.CLASSIC_MOUSE, Buildings.CURSOR);
    }

    @Override
    public void onActivation() {
        game.baseCookiesPerClick = game.baseCookiesPerClick * 2;
        game.getBuilding(Buildings.CURSOR).multiply(2);
        game.getBuilding(Buildings.CURSOR).visualize(game.getInventory());
        active = true;
    }


}
