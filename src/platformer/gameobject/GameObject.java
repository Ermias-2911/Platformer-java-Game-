package platformer.gameobject;

import platformer.gameobject.properties.IDestructible;

// The base class of all game objects
public abstract class GameObject implements IDestructible {
	private boolean destroyed = false;
	
	// Returns if this game object has already been destroyed
	public boolean isDestroyed() {
		return this.destroyed;
	};

	public void destroy() {
		this.destroyed = true;
	}
}
