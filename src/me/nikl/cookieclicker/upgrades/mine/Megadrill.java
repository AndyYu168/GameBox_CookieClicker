package me.nikl.cookieclicker.upgrades.mine;

import me.nikl.cookieclicker.Game;
import me.nikl.cookieclicker.buildings.Buildings;
import me.nikl.cookieclicker.upgrades.Upgrade;
import me.nikl.cookieclicker.upgrades.UpgradeType;
import org.bukkit.Material;
import org.bukkit.material.MaterialData;

/**
 * Created by Niklas on 09.07.2017.
 *
 */
public class Megadrill extends Upgrade{

    public Megadrill(Game game) {
        super(game, 17);
        this.cost = 600000;
        productionsRequirements.put(Buildings.MINE, 5);

        icon = new MaterialData(Material.DIAMOND_PICKAXE).toItemStack();
        icon.setAmount(1);

        loadLanguage(UpgradeType.CLASSIC, Buildings.MINE);
    }

    @Override
    public void onActivation() {
        game.getBuilding(Buildings.MINE).multiply(2);
        game.getBuilding(Buildings.MINE).visualize(game.getInventory());
        active = true;
    }


}
