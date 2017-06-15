package net.triplegerms.unitygear.item;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import net.triplegerms.unitygear.UnityGear;
import net.triplegerms.unitygear.lib.Names;

public class ItemUnityEssence extends Item {

	public ItemUnityEssence(String name) {
		setCreativeTab(UnityGear.tabGear);
		setUnlocalizedName(Names.unlocal(name));
		setRegistryName(name);
		GameRegistry.register(this);
	}
	
	public void addRecipes(){
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(this), "dyeBlue", new ItemStack(Blocks.RED_FLOWER, 1, 1)));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack){
		return "item." + UnityGear.RESOURCE_PREFIX + Names.ESSENCE_ITEM;
	}
	

}
