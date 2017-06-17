package net.triplegerms.unitygear.item;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.triplegerms.unitygear.UnityGear;
import net.triplegerms.unitygear.init.ModItems;
import net.triplegerms.unitygear.lib.Names;

public class ItemUnityDiamond extends Item {

	public ItemUnityDiamond(String name) {
		setCreativeTab(UnityGear.tabGear);
		setUnlocalizedName(Names.unlocal(name));
		setRegistryName(name);
		GameRegistry.register(this);
	}

	public void addRecipes() {
		//GameRegistry.addShapelessRecipe(new ItemStack(this), Items.DIAMOND,ModItems.uEssence);
		GameRegistry.addShapedRecipe(new ItemStack(this), 
				" D ", "DED", " D ", 
				'D', Items.DIAMOND, 
				'E', ModItems.uEssence);
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item." + UnityGear.RESOURCE_PREFIX + Names.UNITY_DIAMOND_ITEM;
	}

}
