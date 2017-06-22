package net.triplegerms.unitygear.util;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.triplegerms.unitygear.item.ArmorBase;

import org.lwjgl.input.Keyboard;

public class Keybind {

	public static KeyBinding keybind;

	public static void init() {
		keybind = new KeyBinding("unitygear.keybind", Keyboard.KEY_U,"key.categories.gameplay");
		ClientRegistry.registerKeyBinding(keybind);
	}
	
	@SubscribeEvent
	public void onKeyInput(KeyInputEvent event) {   
		//ArmorBase.abilityOn = !ArmorBase.abilityOn;
		//System.out.print(ArmorBase.abilityOn);
	}

}
