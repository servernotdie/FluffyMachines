package net.guizhanss.fluffymachines.utils;

import lombok.experimental.UtilityClass;
import net.guizhanss.guizhanlib.common.utils.StringUtil;

import java.util.Locale;

@UtilityClass
public final class MetalUtils {

    public static String getMetalName(String type) {
        return switch (type.toUpperCase(Locale.ROOT)) {
            case "IRON" -> "Sắt";
            case "GOLD" -> "Vàng";
            case "COPPER" -> "Đồng";
            case "TIN" -> "Thiếc";
            case "SILVER" -> "Bạc";
            case "LEAD" -> "Chì";
            case "ALUMINUM" -> "Nhôm";
            case "ZINC" -> "Kẽm";
            case "MAGNESIUM" -> "Magie";
            default -> StringUtil.humanize(type);
        };
    }
}
