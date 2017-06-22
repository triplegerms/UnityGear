package net.triplegerms.unitygear.ability;

public class ActiveAbility implements IAbility{
	
	private int coolDownTimer = 200;

	public int getCoolDown() {
		return coolDownTimer;
	}

	public void resetCoolDown() {
		coolDownTimer = 200;
		
	}

	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setCoolDown(int newTime) {
		coolDownTimer = newTime;
	}

}
