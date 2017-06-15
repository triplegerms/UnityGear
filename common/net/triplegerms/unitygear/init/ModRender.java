package net.triplegerms.unitygear.init;

import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.triplegerms.unitygear.lib.Names;

public class ModRender {
	
	public static void preInit(ItemModelMesher mesher){
		registerItemRenderer(ModItems.uEssence, 0, Names.resName(Names.ESSENCE_ITEM), mesher);
		registerItemRenderer(ModItems.uDiamond, 0, Names.resName(Names.UNITY_DIAMOND_ITEM), mesher);
		registerItemRenderer(ModItems.tArmor, 0, Names.resName(Names.SCALE_CHEST_ITEM), mesher);
	}
	
	public static void init(){
		
	}
	
	public static void postInit(){
		
	}
	
	public static void registerItemRenderer(Item item, int meta, String resName, ItemModelMesher mesher){
		ModelResourceLocation model = new ModelResourceLocation(resName, "inventory");
		ModelLoader.registerItemVariants(item, model);
		mesher.register(item, meta, model);
	}

}
