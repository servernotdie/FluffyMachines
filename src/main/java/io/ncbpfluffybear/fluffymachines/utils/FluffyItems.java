package io.ncbpfluffybear.fluffymachines.utils;

import dev.j3fftw.extrautils.utils.LoreBuilderDynamic;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.player.PlayerBackpack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.itemstack.ColoredFireworkStar;
import io.ncbpfluffybear.fluffymachines.items.FireproofRune;
import io.ncbpfluffybear.fluffymachines.items.MiniBarrel;
import io.ncbpfluffybear.fluffymachines.items.tools.FluffyWrench;
import io.ncbpfluffybear.fluffymachines.items.tools.PortableCharger;
import io.ncbpfluffybear.fluffymachines.machines.AdvancedAutoDisenchanter;
import io.ncbpfluffybear.fluffymachines.machines.AdvancedChargingBench;
import io.ncbpfluffybear.fluffymachines.machines.AutoAncientAltar;
import io.ncbpfluffybear.fluffymachines.machines.AutoCraftingTable;
import io.ncbpfluffybear.fluffymachines.machines.AutoTableSaw;
import io.ncbpfluffybear.fluffymachines.machines.BackpackLoader;
import io.ncbpfluffybear.fluffymachines.machines.BackpackUnloader;
import io.ncbpfluffybear.fluffymachines.machines.ElectricDustFabricator;
import io.ncbpfluffybear.fluffymachines.machines.ElectricDustRecycler;
import io.ncbpfluffybear.fluffymachines.machines.SmartFactory;
import io.ncbpfluffybear.fluffymachines.machines.WaterSprinkler;
import io.ncbpfluffybear.fluffymachines.multiblocks.CrankGenerator;
import io.ncbpfluffybear.fluffymachines.objects.AutoCrafter;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Specifies all plugin items
 */
public class FluffyItems {

    private FluffyItems() {
    }

    // Barrels
    public static final SlimefunItemStack MINI_FLUFFY_BARREL = new SlimefunItemStack(
        "MINI_FLUFFY_BARREL",
        Material.COMPOSTER,
        "&eRương Fluffy Mini",
        "",
        "&7Có thể chứa nhiều vật phẩm",
        "&7Có thể thay đổi dung lượng",
        "",
        "&bDung lượng tối đa: &e" + MiniBarrel.getDisplayCapacity() + " vật phẩm"
    );

    // Portable Chargers
    public static final SlimefunItemStack SMALL_PORTABLE_CHARGER = new SlimefunItemStack(
        "SMALL_PORTABLE_CHARGER",
        Material.BRICK,
        "&eSạc di động Cấp 1",
        "",
        "&7Có thể sạc vật phẩm/trang bị trên tay",
        "",
        "&eTốc độ sạc: &7" + PortableCharger.Type.SMALL.chargeSpeed + " J/s",
        LoreBuilder.powerCharged(0, PortableCharger.Type.SMALL.chargeCapacity)
    );

    public static final SlimefunItemStack MEDIUM_PORTABLE_CHARGER = new SlimefunItemStack(
        "MEDIUM_PORTABLE_CHARGER",
        Material.IRON_INGOT,
        "&6Sạc di động Cấp 2",
        "",
        "&7Có thể sạc vật phẩm/trang bị trên tay",
        "",
        "&eTốc độ sạc: &7" + PortableCharger.Type.MEDIUM.chargeSpeed + " J/s",
        LoreBuilder.powerCharged(0, PortableCharger.Type.MEDIUM.chargeCapacity)
    );

    public static final SlimefunItemStack BIG_PORTABLE_CHARGER = new SlimefunItemStack(
        "BIG_PORTABLE_CHARGER",
        Material.GOLD_INGOT,
        "&aSạc di động Cấp 3",
        "",
        "&7Có thể sạc vật phẩm/trang bị trên tay",
        "",
        "&eTốc độ sạc: &7" + PortableCharger.Type.BIG.chargeSpeed + " J/s",
        LoreBuilder.powerCharged(0, PortableCharger.Type.BIG.chargeCapacity)
    );

    public static final SlimefunItemStack LARGE_PORTABLE_CHARGER = new SlimefunItemStack(
        "LARGE_PORTABLE_CHARGER",
        Material.NETHER_BRICK,
        "&2Sạc di động Cấp 4",
        "",
        "&7Có thể sạc vật phẩm/trang bị trên tay",
        "",
        "&eTốc độ sạc: &7" + PortableCharger.Type.LARGE.chargeSpeed + " J/s",
        LoreBuilder.powerCharged(0, PortableCharger.Type.LARGE.chargeCapacity)
    );

    public static final SlimefunItemStack CARBONADO_PORTABLE_CHARGER = new SlimefunItemStack(
        "CARBONADO_PORTABLE_CHARGER",
        Material.NETHERITE_INGOT,
        "&4Sạc di động Cấp 5",
        "",
        "&7Có thể sạc vật phẩm/trang bị trên tay",
        "",
        "&eTốc độ sạc: &7" + PortableCharger.Type.CARBONADO.chargeSpeed + " J/s",
        LoreBuilder.powerCharged(0, PortableCharger.Type.CARBONADO.chargeCapacity)
    );

    // Items
    public static final SlimefunItemStack ANCIENT_BOOK = new SlimefunItemStack(
        "ANCIENT_BOOK",
        Material.BOOK,
        "&6Quyển sách cổ đại",
        "",
        "&7Được sử dụng trong &cMáy xóa phép tự động cao cấp&7",
        "",
        "&6&oTinh hoa ngàn năm"
    );
    public static final SlimefunItemStack HELICOPTER_HAT = new SlimefunItemStack(
        "HELICOPTER_HAT",
        Material.LEATHER_HELMET, Color.AQUA,
        "&1Mũ trực thăng",
        "",
        "&7brrrrrrrrRRRRRRRR",
        "",
        "&eNgồi xuống&7 để sử dụng"
    );
    public static final SlimefunItemStack WATERING_CAN = new SlimefunItemStack(
        "WATERING_CAN",
        "6484da45301625dee79ae29ff513efa583f1ed838033f20db80963cedf8aeb0e",
        "&bBình tưới cây",
        "",
        "&fTưới nước cho cây trồng",
        "",
        "&7> &eChuột phải&7 để đổ đầy bình",
        "&7> &eChuột phải&7 để tăng tốc cây trồng.",
        "&7> &eChuột phải&7 để cây phát triển",
        "",
        "&aLượng nước còn lại: &e0"
    );
    public static final SlimefunItemStack ENDER_CHEST_EXTRACTION_NODE = new SlimefunItemStack(
        "ENDER_CHEST_EXTRACTION_NODE",
        "e707c7f6c3a056a377d4120028405fdd09acfcd5ae804bfde0f653be866afe39",
        "&6Node vận chuyển Ender (Đầu ra)",
        "",
        "&7Đặt máy này bên cạnh &5Rương Ender&7",
        "",
        "&7Sẽ nhập vật phẩm từ &5Rương Ender&7",
        "&7Đưa vật phẩm vào &6rương&7 bên cạnh"
    );
    public static final SlimefunItemStack ENDER_CHEST_INSERTION_NODE = new SlimefunItemStack(
        "ENDER_CHEST_INSERTION_NODE",
        "7e5dc50c0186d53381d9430a2eff4c38f816b8791890c7471ffdb65ba202bc5",
        "&bNode vận chuyển Ender (Đầu vào)",
        "",
        "&7Đặt máy này bên cạnh &5Rương Ender&7",
        "",
        "&7Sẽ xuất vật phẩm từ &5Rương Ender&7",
        "&7Lấy vật phẩm từ &6rương&7 bên cạnh"
    );
    // Machines
    public static final SlimefunItemStack AUTO_CRAFTING_TABLE = new SlimefunItemStack(
        "AUTO_CRAFTING_TABLE",
        Material.CRAFTING_TABLE,
        "&6Bàn chế tạo tự động (Vanilla)",
        "",
        "&7Tự động chế tạo vật phẩm&f Vanilla&7",
        "",
        LoreBuilderDynamic.powerBuffer(AutoCraftingTable.CAPACITY),
        LoreBuilderDynamic.powerPerSecond(AutoCraftingTable.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack AUTO_ANCIENT_ALTAR = new SlimefunItemStack(
        "AUTO_ANCIENT_ALTAR",
        Material.ENCHANTING_TABLE,
        "&5Bàn tế cổ đại tự động",
        "",
        "&7Tự động chế tạo vật phẩm&5 Bàn tế cổ đại&7",
        "",
        LoreBuilderDynamic.powerBuffer(AutoAncientAltar.CAPACITY),
        LoreBuilderDynamic.powerPerSecond(AutoAncientAltar.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack AUTO_TABLE_SAW = new SlimefunItemStack(
        "AUTO_TABLE_SAW",
        Material.STONECUTTER,
        "&6Cưa bàn tự động",
        "",
        "&7Tự động chế tạo vật phẩm&6 Cưa bàn&7",
        "",
        LoreBuilderDynamic.powerBuffer(AutoTableSaw.CAPACITY),
        LoreBuilderDynamic.powerPerSecond(AutoTableSaw.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack WATER_SPRINKER = new SlimefunItemStack(
        "WATER_SPRINKLER",
        "d6b13d69d1929dcf8edf99f3901415217c6a567d3a6ead12f75a4de3ed835e85",
        "&bMáy phun nước",
        "",
        "&7biu~",
        "",
        LoreBuilderDynamic.powerBuffer(WaterSprinkler.CAPACITY),
        LoreBuilderDynamic.powerPerSecond(WaterSprinkler.ENERGY_CONSUMPTION) + " mỗi cây trồng"
    );
    public static final SlimefunItemStack GENERATOR_CORE = new SlimefunItemStack(
        "GENERATOR_CORE",
        Material.BLAST_FURNACE,
        "&7Lõi máy phát điện",
        "",
        "&7Thành phần của máy phát điện"
    );
    public static final SlimefunItemStack CRANK_GENERATOR = new SlimefunItemStack(
        "CRANK_GENERATOR",
        Material.BLAST_FURNACE,
        "&7Máy phát điện quay tay",
        "",
        "&eChuột phải&7 để kéo cần phát điện",
        "",
        LoreBuilderDynamic.power(CrankGenerator.RATE, " mỗi lần sử dụng"),
        LoreBuilderDynamic.powerBuffer(CrankGenerator.CAPACITY),
        "",
        Utils.multiBlockWarning()
    );

    public static final SlimefunItemStack FOUNDRY = new SlimefunItemStack(
        "FOUNDRY",
        Material.BLAST_FURNACE,
        "&cLò đúc",
        "",
        "&eLưu trữ bột quặng và thỏi",
        "&7Có thể lưu trữ 138,240 thỏi",
        "",
        Utils.multiBlockWarning()
    );

    public static final SlimefunItemStack BACKPACK_UNLOADER = new SlimefunItemStack(
        "BACKPACK_UNLOADER",
        Material.BROWN_STAINED_GLASS,
        "&eMáy dỡ ba lô",
        "",
        "&7Dỡ vật phẩm từ ba lô",
        "",
        LoreBuilderDynamic.powerBuffer(BackpackUnloader.CAPACITY),
        LoreBuilderDynamic.powerPerSecond(BackpackUnloader.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack BACKPACK_LOADER = new SlimefunItemStack(
        "BACKPACK_LOADER",
        Material.ORANGE_STAINED_GLASS,
        "&eMáy nạp ba lô",
        "",
        "&7Nạp vật phẩm vào ba lô",
        "",
        LoreBuilderDynamic.powerBuffer(BackpackLoader.CAPACITY),
        LoreBuilderDynamic.powerPerSecond(BackpackLoader.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack UPGRADED_EXPLOSIVE_PICKAXE = new SlimefunItemStack(
        "UPGRADED_EXPLOSIVE_PICKAXE",
        Material.DIAMOND_PICKAXE,
        "&e&lCuốc nổ cải tiến",
        "",
        "&7Đào phạm vi 5x5"
    );
    public static final SlimefunItemStack UPGRADED_EXPLOSIVE_SHOVEL = new SlimefunItemStack(
        "UPGRADED_EXPLOSIVE_SHOVEL",
        Material.DIAMOND_SHOVEL,
        "&e&lXẻng nổ cải tiến",
        "",
        "&7Đào phạm vi 5x5"
    );
    public static final SlimefunItemStack FIREPROOF_RUNE = new SlimefunItemStack(
        "FIREPROOF_RUNE",
        new ColoredFireworkStar(Color.fromRGB(255, 165, 0),
            "&7Cổ ngữ&8&l[&c&lChống cháy&8&l]",
            "",
            "&eVứt vật phẩm này cùng với vật phẩm khác xuống đất",
            "&eVật phẩm sẽ &cchống cháy",
            ""
        )
    );
    public static final SlimefunItemStack SUPERHEATED_FURNACE = new SlimefunItemStack(
        "SUPERHEATED_FURNACE",
        Material.BLAST_FURNACE,
        "&cLò siêu nhiệt",
        "",
        "&7Bộ phận của Lò đúc",
        "&cKhông dùng công cụ nổ để phá!"
    );
    public static final SlimefunItemStack AUTO_ENHANCED_CRAFTING_TABLE = new SlimefunItemStack(
        "AUTO_ENHANCED_CRAFTING_TABLE",
        Material.CRAFTING_TABLE,
        "&eBàn chế tạo nâng cao tự động",
        "",
        "&7Tự động chế tạo vật phẩm&e Bàn chế tạo nâng cao&7",
        "",
        LoreBuilderDynamic.powerBuffer(AutoCrafter.CAPACITY),
        LoreBuilderDynamic.powerPerSecond(AutoCrafter.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack AUTO_MAGIC_WORKBENCH = new SlimefunItemStack(
        "AUTO_MAGIC_WORKBENCH",
        Material.BOOKSHELF,
        "&6Bàn phép thuật tự động",
        "",
        "&7Tự động chế tạo vật phẩm&6 Bàn phép thuật&7",
        "",
        LoreBuilderDynamic.powerBuffer(AutoCrafter.CAPACITY),
        LoreBuilderDynamic.powerPerSecond(AutoCrafter.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack AUTO_ARMOR_FORGE = new SlimefunItemStack(
        "AUTO_ARMOR_FORGE",
        Material.SMITHING_TABLE,
        "&7Máy rèn giáp tự động",
        "",
        "&7Tự động chế tạo vật phẩm&6 Máy rèn giáp&7",
        "",
        LoreBuilderDynamic.powerBuffer(AutoCrafter.CAPACITY),
        LoreBuilderDynamic.powerPerSecond(AutoCrafter.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack ADVANCED_AUTO_DISENCHANTER = new SlimefunItemStack(
        "ADVANCED_AUTO_DISENCHANTER",
        Material.ENCHANTING_TABLE,
        "&cMáy xóa phép tự động cao cấp",
        "",
        "&7Xóa một phép cụ thể khỏi vật phẩm",
        "&7Cần một &6Quyển sách cổ đại&7 để hoạt động",
        "",
        LoreBuilderDynamic.powerBuffer(AdvancedAutoDisenchanter.CAPACITY),
        LoreBuilderDynamic.powerPerSecond(AdvancedAutoDisenchanter.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack SCYTHE = new SlimefunItemStack(
        "SCYTHE",
        Material.IRON_HOE,
        "&eLưỡi hái",
        "",
        "&7Phá 5 cây trồng cùng lúc"
    );
    public static final SlimefunItemStack UPGRADED_LUMBER_AXE = new SlimefunItemStack(
        "UPGRADED_LUMBER_AXE",
        Material.DIAMOND_AXE,
        "&6&lRìu chặt cây cải tiến",
        "",
        "&7Chặt cả cây cùng lúc.",
        "&7Chuột phải để lột vỏ cây."
    );
    public static final SlimefunItemStack DOLLY = new SlimefunItemStack(
        "DOLLY",
        Material.MINECART,
        "&bXe chở rương",
        "",
        "&7Chuột phải để nhặt rương",
        "",
        PlayerBackpack.LORE_OWNER
    );

    public static final SlimefunItemStack WARP_PAD = new SlimefunItemStack(
        "WARP_PAD",
        Material.SMOKER,
        "&6Bệ dịch chuyển",
        "",
        "&7Dùng để dịch chuyển đến bệ dịch chuyển khác",
        "&7Cần Bộ cấu hình bệ dịch chuyển để cấu hình",
        "",
        "&7Ngồi xuống trên bệ dịch chuyển để dịch chuyển"
    );

    public static final SlimefunItemStack WARP_PAD_CONFIGURATOR = new SlimefunItemStack(
        "WARP_PAD_CONFIGURATOR",
        Material.BLAZE_ROD,
        "&6Bộ cấu hình bệ dịch chuyển",
        "",
        "&eNgồi xuống + Chuột phải&7 để đặt điểm đến",
        "&eChuột phải&7 để đặt điểm xuất phát",
        "",
        "&eTọa độ dịch chuyển:&7Không"
    );

    public static final SlimefunItemStack ELECTRIC_DUST_FABRICATOR = new SlimefunItemStack(
        "ELECTRIC_DUST_FABRICATOR",
        Material.BLAST_FURNACE,
        "&6Máy sản xuất bụi",
        "",
        "&7Máy 3 trong 1: nghiền, sàng và rửa quặng",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.speed(10),
        LoreBuilderDynamic.powerBuffer(ElectricDustFabricator.CAPACITY),
        LoreBuilderDynamic.powerPerSecond(ElectricDustFabricator.ENERGY_CONSUMPTION)
    );

    public static final SlimefunItemStack ELECTRIC_DUST_RECYCLER = new SlimefunItemStack(
        "ELECTRIC_DUST_RECYCLER",
        Material.IRON_BLOCK,
        "&fMáy tái chế bụi",
        "",
        "&7Tái chế bụi thành quặng sàng",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.speed(1),
        LoreBuilderDynamic.powerBuffer(ElectricDustRecycler.CAPACITY),
        LoreBuilderDynamic.powerPerSecond(ElectricDustRecycler.ENERGY_CONSUMPTION)
    );

    public static final SlimefunItemStack ALTERNATE_ELEVATOR_PLATE = new SlimefunItemStack(
        "ALTERNATE_ELEVATOR_PLATE",
        Material.POLISHED_BLACKSTONE_PRESSURE_PLATE,
        "&3Bàn thang máy dự phòng",
        "",
        "&fMỗi tầng cần đặt một cái",
        "&fTất cả thang máy phải trên cùng một đường thẳng đứng.",
        "",
        "&eChuột phải&7 để đặt tên",
        ""
    );

    public static final SlimefunItemStack FLUFFY_WRENCH = new SlimefunItemStack(
        "FLUFFY_WRENCH",
        FluffyWrench.Wrench.DEFAULT.getMaterial(),
        "&6Cờ lê",
        "",
        "&7Tháo nhanh các thành phần mạng và máy móc Slimefun (hao mòn)",
        "",
        "&eChuột trái/Chuột phải&7 để tháo"
    );

    public static final SlimefunItemStack REINFORCED_FLUFFY_WRENCH = new SlimefunItemStack(
        "REINFORCED_FLUFFY_WRENCH",
        FluffyWrench.Wrench.REINFORCED.getMaterial(),
        "&bCờ lê cải tiến",
        "",
        "&7Tháo nhanh các thành phần mạng và máy móc Slimefun (hao mòn)",
        "",
        "&eChuột trái/Chuột phải&7 để tháo"
    );

    public static final SlimefunItemStack CARBONADO_FLUFFY_WRENCH = new SlimefunItemStack(
        "CARBONADO_FLUFFY_WRENCH",
        FluffyWrench.Wrench.CARBONADO.getMaterial(),
        "&7Cờ lê tinh chế",
        "",
        "&7Tháo nhanh các thành phần mạng và máy móc Slimefun (tiêu thụ 1J điện mỗi lần)",
        "",
        "&eChuột trái/Chuột phải&7 để tháo",
        "",
        LoreBuilder.powerCharged(0, FluffyWrench.Wrench.CARBONADO.getMaxCharge())
    );

    public static final SlimefunItemStack PAXEL = new SlimefunItemStack(
        "PAXEL",
        Material.DIAMOND_PICKAXE,
        "&bCông cụ đa năng",
        "",
        "&7Cuốc, rìu, xẻng chuyển đổi tùy ý!"
    );

    public static final SlimefunItemStack ADVANCED_CHARGING_BENCH = new SlimefunItemStack(
        "ADVANCED_CHARGING_BENCH",
        Material.SMITHING_TABLE,
        "&cBàn sạc cao cấp",
        "",
        "&7Sạc vật phẩm",
        "&7Có thể nâng cấp bằng &6Thẻ nâng cấp bàn sạc cao cấp&7"
    );

    public static final SlimefunItemStack ACB_UPGRADE_CARD = new SlimefunItemStack(
        "ACB_UPGRADE_CARD",
        Material.PAPER,
        "&6Thẻ nâng cấp bàn sạc cao cấp",
        "",
        "&eChuột phải&7 vào &cBàn sạc cao cấp&7 để nâng cấp",
        "",
        "&6Tốc độ sạc&a+" + AdvancedChargingBench.CHARGE + "J",
        "&6Dung lượng&a+" + AdvancedChargingBench.CAPACITY + "J",
        "&6Tiêu thụ năng lượng&c+" + AdvancedChargingBench.ENERGY_CONSUMPTION + "J"
    );

    public static final SlimefunItemStack CARGO_MANIPULATOR = new SlimefunItemStack(
        "CARGO_MANIPULATOR",
        Material.SEA_PICKLE,
        "&9Bộ cấu hình vận chuyển",
        "",
        "&eChuột phải&7 để sao chép cấu hình node vận chuyển",
        "&eChuột trái&7 để áp dụng cấu hình node vận chuyển",
        "&eShift+Chuột phải&7 để xóa cấu hình node vận chuyển"
    );

    public static final SlimefunItemStack EXP_DISPENSER = new SlimefunItemStack(
        "EXP_DISPENSER",
        Material.DISPENSER,
        "&aMáy thu thập kinh nghiệm",
        "",
        "&7Chuột phải để thu thập kinh nghiệm",
        "&7từ các bình kinh nghiệm trong bộ phát",
        "&7và trong Rương Fluffy đối diện bộ phát",
        "",
        Utils.multiBlockWarning()
    );

    public static final SlimefunItemStack SMART_FACTORY = new SlimefunItemStack(
        "SMART_FACTORY",
        Material.SMOKER,
        "&cNhà máy thông minh",
        "",
        "&7Máy đa năng",
        "&7Có thể chế tạo tài nguyên từ nguyên liệu thô",
        "",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.speed(1),
        LoreBuilderDynamic.powerBuffer(SmartFactory.getEnergyCapacity()),
        LoreBuilderDynamic.powerPerSecond(SmartFactory.getEnergyConsumption())
    );

    static {
        FireproofRune.setFireproof(FIREPROOF_RUNE);
        addGlow(SMALL_PORTABLE_CHARGER);
        addGlow(MEDIUM_PORTABLE_CHARGER);
        addGlow(BIG_PORTABLE_CHARGER);
        addGlow(LARGE_PORTABLE_CHARGER);
        addGlow(CARBONADO_PORTABLE_CHARGER);
    }

    private static void addGlow(ItemStack item) {
        item.addUnsafeEnchantment(Enchantment.BINDING_CURSE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
    }
}
