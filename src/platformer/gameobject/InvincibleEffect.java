package platformer.gameobject;

import platformer.builder.Services;

// Make the player not taking damage even if the players touch monsters and bullets after player 
public class InvincibleEffect extends PowerupEffect {

	@Override
	protected void effect(Player player) {
		player.invincible();
	}

	@Override
	protected String getImageFileName() {
		return "powerup-invincible.png";
	}
	
}
