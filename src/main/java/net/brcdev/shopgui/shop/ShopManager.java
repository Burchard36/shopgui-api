package net.brcdev.shopgui.shop;

import net.brcdev.shopgui.player.PlayerData;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ShopManager {

  public boolean areShopsLoaded() {
    return false;
  }

  public void load() {
  }

  public void openMainMenu(final Player player) {
  }

  public void openShopMenu(Player player, String shopId, int page, boolean direct) {
  }

  public ShopItem findShopItemByItemStack(Player player, ItemStack itemStack,
                                          boolean excludeFreeItems) {
    return null;
  }

  public ShopItem findShopItemByItemStack(ItemStack itemStack, boolean excludeFreeItems) {
    return null;
  }

  public Shop getShopById(String shopId) {
    return null;
  }

  public enum ItemType {
    ITEM,
    PERMISSION,
    ENCHANTMENT,
    COMMAND,
    SPECIAL,
    DUMMY
  }

  public enum ShopAction {
    BUY,
    SELL,
    SELL_ALL
  }
}
