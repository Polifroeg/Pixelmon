package pixelmon.client.render;

import pixelmon.entities.npcs.EntityDoctor;
import pixelmon.entities.npcs.EntityTrainer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.EntityLiving;

public class RenderDoctor extends RenderLiving {
	public RenderDoctor(float par2) {
		super(null, par2);
	}

	@Override
	public void doRenderLiving(EntityLiving entityLiving, double d, double d1, double d2, float f, float f1) {
		mainModel = ((EntityDoctor) entityLiving).getModel();
		if (mainModel == null)
			return;
		float var10 = entityLiving.getDistanceToEntity(this.renderManager.livingPlayer);
		if (var10 <= (float) 8) {
			drawNameTag(entityLiving, d, d1, d2);
		}
		super.doRenderLiving(entityLiving, d, d1, d2, f, f1);
	}

	public void drawNameTag(EntityLiving entityliving, double par2, double par4, double par6) {
		if (Minecraft.isGuiEnabled() && (entityliving instanceof EntityTrainer)) {
			EntityDoctor doctor = (EntityDoctor) entityliving;
			String s = "Doctor " + doctor.getName();
			renderLivingLabel(doctor, s, par2, par4, par6, 64);
		}
	}
}
