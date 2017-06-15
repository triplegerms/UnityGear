package net.triplegerms.unitygear.item;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.triplegerms.unitygear.UnityGear;
import net.triplegerms.unitygear.lib.Names;

public final class ArmorType {
	public static ArmorMaterial armorThief;
	public static ArmorMaterial armorScale;
	public static ArmorMaterial armorTribal;

	public static void init() {
		
		armorThief = addArmorMaterial(Names.THIEF_ARMOR,
				Names.resName("thief"), 50,
				new int[] { 5, 8, 9, 4 }, 15,
				SoundEvents.ITEM_ARMOR_EQUIP_GENERIC);
		
		armorScale = addArmorMaterial(Names.SCALE_ARMOR,
				Names.resName("scale"), 120,
				new int[] { 1, 3, 4, 3 }, 10,
				SoundEvents.ITEM_ARMOR_EQUIP_GENERIC);
		
		armorTribal = addArmorMaterial(Names.TRIBAL_ARMOR,
				Names.resName("tribal"), 20, new int[] { 3, 5, 6, 3 },
				8, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC);
	}	

	
	private static ArmorMaterial addArmorMaterial(String name, String textureName, int durability, int[] reductionAmounts, int enchantability, SoundEvent soundOnEquip){
        return EnumHelper.addArmorMaterial(name.toUpperCase(), textureName, durability, reductionAmounts, enchantability, soundOnEquip, 0F);
    }
}
