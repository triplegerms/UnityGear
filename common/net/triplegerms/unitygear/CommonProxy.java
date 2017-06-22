package net.triplegerms.unitygear;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.triplegerms.unitygear.ability.AbilityStorage;
import net.triplegerms.unitygear.ability.ActiveAbility;
import net.triplegerms.unitygear.ability.ArmorEventHandler;
import net.triplegerms.unitygear.ability.IAbility;
import net.triplegerms.unitygear.init.ModItems;
import net.triplegerms.unitygear.item.ArmorType;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		// ModBlocks.init();
		ArmorType.init();
		ModItems.init();
		CapabilityManager.INSTANCE.register(IAbility.class, new AbilityStorage(), ActiveAbility.class);
		MinecraftForge.EVENT_BUS.register(new ArmorEventHandler());
	}

	public void init(FMLInitializationEvent event) {
		// ModBlocks.initRecipes();
		ModItems.initRecipes();
	}

	public void postInit(FMLPostInitializationEvent event) {

	}

}
