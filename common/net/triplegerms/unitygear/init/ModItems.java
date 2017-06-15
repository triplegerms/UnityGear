package net.triplegerms.unitygear.init;

import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.triplegerms.unitygear.UnityGear;
import net.triplegerms.unitygear.item.ArmorBase;
import net.triplegerms.unitygear.item.ItemUnityDiamond;
import net.triplegerms.unitygear.item.ItemUnityEssence;
import net.triplegerms.unitygear.lib.Names;

public class ModItems {

	public static ItemUnityEssence uEssence;
	public static ItemUnityDiamond uDiamond;
	public static ArmorBase tArmor;

	public static void init() {

		uEssence = new ItemUnityEssence(Names.ESSENCE_ITEM);
		uDiamond = new ItemUnityDiamond(Names.UNITY_DIAMOND_ITEM);
		tArmor = new ArmorBase(Names.SCALE_CHEST_ITEM);

	}

	public static void initRecipes() {
		uEssence.addRecipes();
		uDiamond.addRecipes();
	}

	private static Item registerItem(Item item, String name) {
		GameRegistry.register(item, new ResourceLocation(UnityGear.MODID, name));
		return item;
	}

	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher) {
		ModRender.preInit(mesher);
	}

}
