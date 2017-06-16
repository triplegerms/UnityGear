package net.triplegerms.unitygear.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.triplegerms.unitygear.UnityGear;
import net.triplegerms.unitygear.lib.Names;

public class ArmorBase extends ItemArmor {
	
	
	public ArmorBase(String name, ArmorMaterial material, EntityEquipmentSlot slot){		
		super(material, 0, slot);
		setCreativeTab(UnityGear.tabGear);
		setUnlocalizedName(Names.unlocal(name));
		setRegistryName(UnityGear.MODID, name);
		GameRegistry.register(this);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item." + UnityGear.RESOURCE_PREFIX + Names.UNITY_DIAMOND_ITEM;
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
		
	}

}
