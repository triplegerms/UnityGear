package net.triplegerms.unitygear;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.triplegerms.unitygear.ability.IAbility;
import net.triplegerms.unitygear.init.ModItems;

@Mod(modid = UnityGear.MODID, name = UnityGear.MOD_NAME, version = UnityGear.VERSION)
public class UnityGear {
	public static final String MODID = "unitygear";
	public static final String MOD_NAME = "Unity Gear";
	public static final String VERSION = "@VERSION@";
	//public static final String DEPENDENCIES = "required-after:forge@[12.18.3.2316,)";
	public static final String RESOURCE_PREFIX = MODID.toLowerCase() + ":";
	@CapabilityInject(IAbility.class)

	@Instance(MODID)
	public static UnityGear instance;

	@SidedProxy(clientSide = "net.triplegerms.unitygear.ClientProxy", serverSide = "net.triplegerms.unitygear.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

	public static CreativeTabs tabGear = new CreativeTabs(UnityGear.RESOURCE_PREFIX + "creative_tab")
	{
		@Override
		public ItemStack getTabIconItem()
		{
			return new ItemStack(ModItems.uDiamond);
		}
	};

}
