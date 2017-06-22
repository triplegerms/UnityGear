package net.triplegerms.unitygear.ability;

public interface IAbility {
	
	public int getCoolDown();
	public void resetCoolDown();
	public boolean isActive();
	public void setCoolDown(int inty);

}
