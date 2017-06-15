package net.triplegerms.unitygear.item;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.triplegerms.unitygear.UnityGear;
import net.triplegerms.unitygear.lib.Names;

public class ArmorBase extends ItemArmor {
	
	public static ArmorMaterial TEST_MAT = EnumHelper.addArmorMaterial("INFUSED_ARMOR", "unitygear:scale", 200, new int[] {4, 9, 7, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F);
	
	//public ArmorBase(String name, ArmorMaterial material, EntityEquipmentSlot slot)
	public ArmorBase(String name){
		
		super(TEST_MAT, 0, EntityEquipmentSlot.CHEST);
		setCreativeTab(UnityGear.tabGear);
		setUnlocalizedName(Names.unlocal(name));
		setRegistryName(name);
		GameRegistry.register(this);
	}

}
