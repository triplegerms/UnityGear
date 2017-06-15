package net.triplegerms.unitygear.item;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.triplegerms.unitygear.UnityGear;
import net.triplegerms.unitygear.lib.Names;

public class ArmorBase extends ItemArmor {
	
	
	public ArmorBase(String name, ArmorMaterial material, EntityEquipmentSlot slot){		
		super(material, 0, slot);
		setCreativeTab(UnityGear.tabGear);
		setUnlocalizedName(Names.unlocal(name));
		setRegistryName(name);
		GameRegistry.register(this);
	}

}
