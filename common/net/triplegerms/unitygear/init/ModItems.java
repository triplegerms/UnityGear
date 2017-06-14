package net.triplegerms.unitygear.init;

import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.triplegerms.unitygear.UnityGear;
import net.triplegerms.unitygear.item.ItemUnityDiamond;
import net.triplegerms.unitygear.item.ItemUnityEssence;
import net.triplegerms.unitygear.lib.Names;

public class ModItems {
	
	public static ItemUnityEssence uEssence;
	public static ItemUnityDiamond uDiamond;
	
	public static void init(){
		uEssence = new ItemUnityEssence();
		uEssence.setRegistryName(new ResourceLocation(UnityGear.MODID, Names.ESSENCE_ITEM));
		GameRegistry.register(uEssence);
		
		uDiamond = new ItemUnityDiamond();
		uDiamond.setRegistryName(new ResourceLocation(UnityGear.MODID, Names.UNITY_DIAMOND_ITEM));
		GameRegistry.register(uDiamond);
	}
	
	public static void initRecipes(){
		uEssence.addRecipes();
		uDiamond.addRecipes();
	}
	
	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher){
		ModelResourceLocation model = new ModelResourceLocation(UnityGear.RESOURCE_PREFIX + Names.ESSENCE_ITEM, "inventory");
		ModelLoader.registerItemVariants(uEssence, model);
		mesher.register(uEssence, 0, model);
		
		model = new ModelResourceLocation(UnityGear.RESOURCE_PREFIX + Names.UNITY_DIAMOND_ITEM, "inventory");
		ModelLoader.registerItemVariants(uDiamond, model);
		mesher.register(uDiamond, 0, model);
	}

}
