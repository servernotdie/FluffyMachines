package io.ncbpfluffybear.fluffymachines.machines;

import io.ncbpfluffybear.fluffymachines.objects.AutoCrafter;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class AutoArmorForge extends AutoCrafter {

    public AutoArmorForge(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "&7Bàn rèn giáp tự động", Material.ANVIL, "&7Bàn rèn giáp", RecipeType.ARMOR_FORGE);
    }
}
