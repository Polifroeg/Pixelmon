package pixelmon.Pokemon;

import pixelmon.entities.pixelmon.BaseEntityPixelmon;
import pixelmon.entities.pixelmon.EntityGroundPixelmon;
import net.minecraft.src.World;

public class EntityKakuna extends EntityGroundPixelmon
{
	
	public EntityKakuna(World world)
	{
		super(world);
		init();
	}

	public void init()
	{
		name = "Kakuna";
		isImmuneToFire = false;
		super.init();
		helper.giScale = 0.915F;
	}
	
	public void evolve() 
	{		
		
	}
}
