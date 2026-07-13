package io.ncbpfluffybear.fluffymachines.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.ncbpfluffybear.fluffymachines.objects.AutoCrafter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class AutoEnhancedCraftingTable extends AutoCrafter {
    public AutoEnhancedCraftingTable(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "&6Bàn chế tạo nâng cao tự động",
            Material.CRAFTING_TABLE, "&6Bàn chế tạo nâng cao", RecipeType.ENHANCED_CRAFTING_TABLE
        );
    }
}
