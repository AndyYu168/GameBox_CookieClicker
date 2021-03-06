package me.nikl.cookieclicker.upgrades.antimattercondenser;

import me.nikl.cookieclicker.Game;
import me.nikl.cookieclicker.buildings.Buildings;
import me.nikl.cookieclicker.upgrades.Upgrade;
import me.nikl.cookieclicker.upgrades.UpgradeType;

/**
 * Created by Niklas on 09.07.2017.
 *
 */
public class LargeMacaronCollider extends Upgrade{

    public LargeMacaronCollider(Game game) {
        super(game, 101);
        this.cost = 85000000000000000.;
        productionsRequirements.put(Buildings.ANTIMATTER_CONDENSER, 25);

        // for the standard upgrade type the building icon is used
        loadLanguage(UpgradeType.CLASSIC, Buildings.ANTIMATTER_CONDENSER);
    }

    @Override
    public void onActivation() {
        game.getBuilding(Buildings.ANTIMATTER_CONDENSER).multiply(2);
        game.getBuilding(Buildings.ANTIMATTER_CONDENSER).visualize(game.getInventory());
        active = true;
    }
}
