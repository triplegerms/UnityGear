package net.triplegerms.unitygear;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.triplegerms.unitygear.init.ModItems;
import net.triplegerms.unitygear.item.ArmorType;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		// ModBlocks.init();
		ArmorType.init();
		ModItems.init();
	}

	public void init(FMLInitializationEvent event) {
		// ModBlocks.initRecipes();
		ModItems.initRecipes();
	}

	public void postInit(FMLPostInitializationEvent event) {

	}

}
